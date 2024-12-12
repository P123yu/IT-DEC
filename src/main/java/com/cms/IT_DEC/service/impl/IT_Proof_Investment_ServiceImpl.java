package com.cms.IT_DEC.service.impl;

import com.cms.IT_DEC.model.IT_Proof_Investment;
import com.cms.IT_DEC.repository.IT_Proof_Investment_Repo;
import com.cms.IT_DEC.service.IT_Proof_Investment_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IT_Proof_Investment_ServiceImpl implements IT_Proof_Investment_Service {

    @Autowired
    private IT_Proof_Investment_Repo itProofInvestmentRepo;

    @Override
    @Transactional
    public List<IT_Proof_Investment> createProofOfInvestment(List<IT_Proof_Investment> itProofInvestmentList) {
        System.out.println(String.valueOf(itProofInvestmentList));
        return itProofInvestmentRepo.saveAll(itProofInvestmentList);
    }

    @Override
    public IT_Proof_Investment setStatusForProofOfInvestment(Long empId, String financialYear,Boolean state) {
        Long itDecId=1L;
        IT_Proof_Investment itProofInvestmentObj=itProofInvestmentRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,itDecId);
        itProofInvestmentObj.setStatus(state);
        System.out.println(state+"state");
        return itProofInvestmentRepo.save(itProofInvestmentObj);
    }

    @Override
    public Boolean getStatusForProofOfInvestment(Long empId, String financialYear) {
        Long itDecId=1L;
        IT_Proof_Investment itProofInvestmentObj=itProofInvestmentRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,itDecId);
        return itProofInvestmentObj.getStatus();
    }

    @Override
    public IT_Proof_Investment setStatusForSubmitProofOfInvestment(Long empId, String financialYear,Boolean state) {
        Long itDecId=1L;
        IT_Proof_Investment itProofInvestmentObj=itProofInvestmentRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,itDecId);
        itProofInvestmentObj.setSubmitted(state);
        return itProofInvestmentRepo.save(itProofInvestmentObj);
    }

    @Override
    public Boolean getStatusForSubmitProofOfInvestment(Long empId, String financialYear) {
        Long itDecId=1L;
        IT_Proof_Investment itProofInvestmentObj=itProofInvestmentRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,itDecId);
        return itProofInvestmentObj.getSubmitted();
    }

    @Override
    public List<IT_Proof_Investment> getAllProofOfInvestmentByEmpIdAndFinancialYear(Long empId, String financialYear) {
        return itProofInvestmentRepo.findByEmpIdAndFinancialYear(empId, financialYear);
    }
}
