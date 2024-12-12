package com.cms.IT_DEC.service.impl;

import com.cms.IT_DEC.model.IT_Declaration_Master;
import com.cms.IT_DEC.repository.IT_Declaration_Master_Repo;
import com.cms.IT_DEC.service.IT_Declaration_Master_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IT_Declaration_Master_ServiceImpl implements IT_Declaration_Master_Service {

    @Autowired
    private IT_Declaration_Master_Repo itDeclarationMasterRepo;

    @Override
    public List<IT_Declaration_Master> getAllMaster() {
        return itDeclarationMasterRepo.findAll();
    }
}
