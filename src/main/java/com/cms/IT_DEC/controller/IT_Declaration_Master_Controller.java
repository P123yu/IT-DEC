package com.cms.IT_DEC.controller;


import com.cms.IT_DEC.model.IT_Declaration_Master;
import com.cms.IT_DEC.service.IT_Declaration_Master_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/it-declaration-master")
public class IT_Declaration_Master_Controller {

    @Autowired
    private IT_Declaration_Master_Service itDeclarationMasterService;

    @GetMapping("/get-all")
    public ResponseEntity<?>getAllMaster(){
        List<IT_Declaration_Master> itDeclarationMasterObj= itDeclarationMasterService.getAllMaster();
        if(!itDeclarationMasterObj.isEmpty()){
            return ResponseEntity.ok(itDeclarationMasterObj);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
