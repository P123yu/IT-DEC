package com.cms.IT_DEC.utils;

import com.cms.IT_DEC.dto.document_dto.DocumentDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DocumentOperations {
    public int i;

    @Value("${it.declaration.doc.upload.api}")
    private String itDecDocPostAPI;

    @Value("${it.declaration.doc.upload.directory}")
    private String itDecDocUploadDirectory;

    public List<DocumentDTO> uploadDocument(DocumentDTO documentDTO, List<MultipartFile> filesList) throws IOException {
        List<DocumentDTO> docDTOList = new ArrayList<DocumentDTO>();
        WebClient webClient = WebClient.create();
        MultiValueMap<String, Object> formData = new LinkedMultiValueMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        String documentDTOJson = null;
        try {
            documentDTOJson = objectMapper.writeValueAsString(documentDTO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        // Create HttpEntity for the DocumentDTO JSON
        HttpHeaders jsonHeaders = new HttpHeaders();
        jsonHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> jsonEntity = new HttpEntity<>(documentDTOJson, jsonHeaders);
        // Create HttpEntity for the MultipartFile
        HttpHeaders fileHeaders = new HttpHeaders();
        for (i = 0; i < filesList.size(); i++) {
            final int index = i;
            ByteArrayResource fileAsResource = new ByteArrayResource(filesList.get(index).getBytes()) {
                @Override
                public String getFilename() {
                    return filesList.get(index).getOriginalFilename();
                }
            };
            HttpEntity<ByteArrayResource> fileEntity = new HttpEntity<>(fileAsResource, fileHeaders);
            formData.add("files", fileEntity);
        }
        formData.add("documentDTO", jsonEntity);
        Mono<List<DocumentDTO>> documentDTOResponseEntity = webClient.post()
                .uri(itDecDocPostAPI + itDecDocUploadDirectory)
                .body(BodyInserters.fromMultipartData(formData))
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<DocumentDTO>>() {
                });
        List<DocumentDTO> documentDTOResponseList = documentDTOResponseEntity.block();
        if (documentDTOResponseList != null && !documentDTOResponseList.isEmpty()) {
            for (DocumentDTO docDto : documentDTOResponseList) {
                LocalDate createdDate = docDto.getCreatedDate();
                docDto.setCreatedDate(createdDate);
                docDTOList.add(docDto);
            }
            return docDTOList;
        } else {
            return null;
        }
    }
}
