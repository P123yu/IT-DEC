package com.cms.IT_DEC.controller;


import com.cms.IT_DEC.model.IT_Dec_File;
import com.cms.IT_DEC.service.IT_Dec_File_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/it-declaration-file")
public class IT_Dec_File_Controller {

    @Autowired
    private IT_Dec_File_Service itDecFileService;


    @PostMapping(value = "/upload/{empId}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE})
//@PostMapping(value = "/upload/{empId}", consumes = {MediaType.APPLICATION_OCTET_STREAM})

// @PostMapping("/upload/{empId}")
    public ResponseEntity<?> uploadFile(@RequestPart(name = "files", required = false) List<MultipartFile> files, @PathVariable Long empId,@RequestParam List<Long> itDecId) throws IOException {

        List<IT_Dec_File> itDecFiles = itDecFileService.uploadFile(files,empId,itDecId);
      if(!itDecFiles.isEmpty()){
          return ResponseEntity.status(HttpStatus.CREATED).body(itDecFiles);
      }
      else {
          return ResponseEntity.badRequest().build();
      }
    }

}
