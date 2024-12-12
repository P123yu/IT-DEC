package com.cms.IT_DEC.service;

import com.cms.IT_DEC.model.IT_Proof_Investment;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IT_Proof_Investment_Service {

   // IT_Proof_Investment_Service createProofOfInvestment
   List<IT_Proof_Investment>createProofOfInvestment(List<IT_Proof_Investment> itProofInvestmentList);

   // set status for save for proof of investment
   IT_Proof_Investment setStatusForProofOfInvestment(Long empId,String financialYear,Boolean state);

   // get status for proof of investment
   Boolean getStatusForProofOfInvestment(Long empId,String financialYear);

   // set status for submit for proof of investment
   IT_Proof_Investment setStatusForSubmitProofOfInvestment(Long empId,String financialYear,Boolean state);

   // get status for submit proof of investment
   Boolean getStatusForSubmitProofOfInvestment(Long empId,String financialYear);

   // get all list of proof of investment by empId and financial year
   List<IT_Proof_Investment> getAllProofOfInvestmentByEmpIdAndFinancialYear(Long empId, String financialYear);
}
