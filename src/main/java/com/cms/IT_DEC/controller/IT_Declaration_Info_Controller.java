package com.cms.IT_DEC.controller;


import com.cms.IT_DEC.model.IT_Declaration_Info;
import com.cms.IT_DEC.service.IT_Declaration_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/it-declaration-info")
public class IT_Declaration_Info_Controller {

    @Autowired
    private IT_Declaration_Info_Service itDeclarationInfoService;

    @PostMapping("/add")
    public ResponseEntity<?>createDeclarationInfo(@RequestBody List<IT_Declaration_Info> itDeclarationInfo){

        List<IT_Declaration_Info> itDeclarationInfoObj=itDeclarationInfoService.createDeclarationInfo(itDeclarationInfo);
        if(!itDeclarationInfoObj.isEmpty()){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("/get/{empId}/{financialYear}")
    public ResponseEntity<?>getDeclarationInfoByEmpIdAndFinancialYear(@PathVariable Long empId, @PathVariable String financialYear){
        List<IT_Declaration_Info> itDeclarationInfoObj=itDeclarationInfoService.getDeclarationInfoByEmpIdAndFinancialYear(empId,financialYear);
        if(!itDeclarationInfoObj.isEmpty()){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }


    @PostMapping("/save-status/{empId}/{financialYear}")
    public ResponseEntity<?>setSaveStatusForSection80c(@PathVariable Long empId, @PathVariable String financialYear){
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoService.setSaveStatusForSection80c(empId,financialYear);
        if(itDeclarationInfoObj!=null){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @GetMapping("/get-save-status/{empId}/{financialYear}")
    public ResponseEntity<?>getSaveStatusForSection80c(@PathVariable Long empId, @PathVariable String financialYear){
        Boolean result=itDeclarationInfoService.getSaveStatusForSection80c(empId,financialYear);
        if(result){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @PostMapping("/total-amount-80c/{empId}/{financialYear}")
    public ResponseEntity<?>setDeclarationAmountForSection80c(@PathVariable Long empId, @PathVariable String financialYear, @RequestBody IT_Declaration_Info itDeclarationInfo){
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoService.setDeclarationAmountForSection80c(empId,financialYear,itDeclarationInfo);
        if(itDeclarationInfoObj!=null){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }





    @GetMapping("/get-total-amount-80c/{empId}/{financialYear}")
    public ResponseEntity<?>getDeclarationAmountForSection80c(@PathVariable Long empId, @PathVariable String financialYear){
        Double result=itDeclarationInfoService.getDeclarationAmountForSection80c(empId,financialYear);
        if(result !=null){
            return ResponseEntity.ok(result);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @PostMapping("/save-status-80d/{empId}/{financialYear}")
    public ResponseEntity<?>setSaveStatusForSection80d(@PathVariable Long empId, @PathVariable String financialYear){
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoService.setSaveStatusForSection80d(empId,financialYear);
        if(itDeclarationInfoObj!=null){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @GetMapping("/get-save-status-80d/{empId}/{financialYear}")
    public ResponseEntity<?>getSaveStatusForSection80d(@PathVariable Long empId, @PathVariable String financialYear){
        Boolean result=itDeclarationInfoService.getSaveStatusForSection80d(empId,financialYear);
        if(result){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @PostMapping("/total-amount-80d/{empId}/{financialYear}")
    public ResponseEntity<?>setDeclarationAmountForSection80d(@PathVariable Long empId, @PathVariable String financialYear, @RequestBody IT_Declaration_Info itDeclarationInfo){
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoService.setDeclarationAmountForSection80d(empId,financialYear,itDeclarationInfo);
        if(itDeclarationInfoObj!=null){
            return ResponseEntity.ok(itDeclarationInfoObj);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }





    @GetMapping("/get-total-amount-80d/{empId}/{financialYear}")
    public ResponseEntity<?>getDeclarationAmountForSection80d(@PathVariable Long empId, @PathVariable String financialYear){
        Double result=itDeclarationInfoService.getDeclarationAmountForSection80d(empId,financialYear);
        if(result !=null){
            return ResponseEntity.ok(result);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }


}
