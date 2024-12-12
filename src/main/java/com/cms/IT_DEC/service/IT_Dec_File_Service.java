package com.cms.IT_DEC.service;

import com.cms.IT_DEC.model.IT_Dec_File;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface IT_Dec_File_Service {

    List<IT_Dec_File> uploadFile(List<MultipartFile> files, Long employeeId,List<Long> itDecId) throws IOException;

}
