package com.cms.IT_DEC.controller;


import com.cms.IT_DEC.model.IT_Proof_Investment;
import com.cms.IT_DEC.service.IT_Proof_Investment_Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/proof-of-investment")
@Slf4j
public class IT_Proof_Investment_Controller {

    @Autowired
    private IT_Proof_Investment_Service itProofInvestmentService;

    @PostMapping("/add")
    public ResponseEntity<?>createProofOfInvestment(@RequestBody List<IT_Proof_Investment>itProofInvestmentList){
        System.out.println(String.valueOf(itProofInvestmentList));
           List<IT_Proof_Investment>itProofInvestmentListObj=itProofInvestmentService.createProofOfInvestment(itProofInvestmentList);
           if(!itProofInvestmentListObj.isEmpty()){
               return ResponseEntity.ok(itProofInvestmentListObj);
           }
           else{
               return ResponseEntity.badRequest().build();
           }
    }

// set save status for proof of investment

    @GetMapping("/set-status-proof/{empId}/{financialYear}/{state}")
    public ResponseEntity<?>setStatusForProofOfInvestment(@PathVariable Long empId,@PathVariable String financialYear,@PathVariable Boolean state){
        IT_Proof_Investment itProofInvestmentStatus=itProofInvestmentService.setStatusForProofOfInvestment(empId,financialYear,state);
        if(itProofInvestmentStatus!=null){
            return ResponseEntity.ok(itProofInvestmentStatus);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }

// get save status for proof of investment

    @GetMapping("/get-status-proof/{empId}/{financialYear}")
    public ResponseEntity<?>getStatusForProofOfInvestment(@PathVariable Long empId,@PathVariable String financialYear){
        Boolean result=itProofInvestmentService.getStatusForProofOfInvestment(empId,financialYear);
        if(result){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }





// set submit status for proof of investment

    @GetMapping("/set-submit-status-proof/{empId}/{financialYear}/{state}")
    public ResponseEntity<?>setStatusForSubmitProofOfInvestment(@PathVariable Long empId,@PathVariable String financialYear,@PathVariable Boolean state){
        IT_Proof_Investment itProofInvestmentStatus=itProofInvestmentService.setStatusForSubmitProofOfInvestment(empId,financialYear,state);
        if(itProofInvestmentStatus!=null){
            return ResponseEntity.ok(itProofInvestmentStatus);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }

// get submit status for proof of investment

    @GetMapping("/get-submit-status-proof/{empId}/{financialYear}")
    public ResponseEntity<?>getStatusForSubmitProofOfInvestment(@PathVariable Long empId,@PathVariable String financialYear){
        Boolean result=itProofInvestmentService.getStatusForSubmitProofOfInvestment(empId,financialYear);
        if(result){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }



    @GetMapping("/get-all-proof/{empId}/{financialYear}")
    public ResponseEntity<?>getAllProofOfInvestmentByEmpIdAndFinancialYear(@PathVariable Long empId,@PathVariable String financialYear){
        List<IT_Proof_Investment> itProofInvestmentList=itProofInvestmentService.getAllProofOfInvestmentByEmpIdAndFinancialYear(empId,financialYear);
        if(!itProofInvestmentList.isEmpty()){
            return ResponseEntity.ok(itProofInvestmentList);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }


}


