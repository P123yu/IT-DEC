package com.cms.IT_DEC.service.impl;

import com.cms.IT_DEC.dto.document_dto.DocumentDTO;
import com.cms.IT_DEC.model.IT_Dec_File;
import com.cms.IT_DEC.repository.IT_Dec_File_Repo;
import com.cms.IT_DEC.service.IT_Dec_File_Service;
import com.cms.IT_DEC.utils.DocumentOperations;
import com.cms.IT_DEC.utils.EmployeeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class IT_Dec_File_ServiceImpl implements IT_Dec_File_Service {
    @Autowired
    private IT_Dec_File_Repo itDecFileRepo;
    @Autowired
    DocumentOperations documentOperations;
    @Autowired
    EmployeeOperations employeeOperations;

    @Override
    public List<IT_Dec_File> uploadFile(List<MultipartFile> files, Long employeeId, List<Long> itDecId) throws IOException {
        if(files!=null){
            return handleDocumentUpload(employeeId, files, itDecId);
        }
            return null;
    }

    public List<IT_Dec_File> handleDocumentUpload(Long empId, List<MultipartFile> file, List<Long> itDecId) throws IOException {
        int fileCounter = -1;
        List<IT_Dec_File> uploadedFiles = new ArrayList<>();
        DocumentDTO documentData = new DocumentDTO();
        documentData.setEmpId(empId);
        documentData.setEmpOrg("CMS.SSD.SSD");
        documentData.setLocation("INDIA.BENGALURU");
        List<DocumentDTO> docDTOList = documentOperations.uploadDocument(documentData, file);
        System.out.println(itDecId.size() +":"+docDTOList.size());
        if (!docDTOList.isEmpty()) {
            for (DocumentDTO documentDTO : docDTOList) {
                fileCounter+=1;
                IT_Dec_File itDeclarationFile = new IT_Dec_File();
                itDeclarationFile.setEmployeeId(empId);
                itDeclarationFile.setItDecDocId(documentDTO.getDocId());
                itDeclarationFile.setItDecId(itDecId.get(fileCounter));
                IT_Dec_File itDeclarationFileList = itDecFileRepo.save(itDeclarationFile);
                uploadedFiles.add(itDeclarationFileList);
            }
        }
        return uploadedFiles;
    }


//    @Override
//    public List<IT_Dec_File> uploadFile(List<MultipartFile> files, Long employeeId,List<Long> itDecId) throws IOException {
//        List<IT_Dec_File> uploadedFiles = new ArrayList<>();
//
//        for (MultipartFile file : files) {
//            String fileName = file.getOriginalFilename();
//            Path filePath = Path.of(uploadDir, fileName);
//            Files.createDirectories(filePath.getParent());
//            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//
//            // Set file name and employeeId
//            IT_Dec_File itDeclarationFile = new IT_Dec_File();
//            itDeclarationFile.setName(fileName);
//            itDeclarationFile.setEmployeeId(employeeId); // Set employeeId
//            itDeclarationFile.setItDecId(itDecId);
//            uploadedFiles.add(itDeclarationFile);
//        }
//
//        List<IT_Dec_File> itDeclarationFileList = itDecFileRepo.saveAll(uploadedFiles);
//        return itDeclarationFileList;
//    }
}


