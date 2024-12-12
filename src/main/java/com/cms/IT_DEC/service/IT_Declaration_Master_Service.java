package com.cms.IT_DEC.service;

import com.cms.IT_DEC.model.IT_Declaration_Master;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IT_Declaration_Master_Service {
    List<IT_Declaration_Master> getAllMaster();
}
