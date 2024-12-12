package com.cms.IT_DEC.service;

import com.cms.IT_DEC.model.IT_Declaration_Info;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IT_Declaration_Info_Service {

    List<IT_Declaration_Info> createDeclarationInfo(List<IT_Declaration_Info> itDeclarationInfo);
    List<IT_Declaration_Info> getDeclarationInfoByEmpIdAndFinancialYear(Long empId, String financialYear);

    // section80c
    IT_Declaration_Info setSaveStatusForSection80c(Long empId, String financialYear);
    Boolean getSaveStatusForSection80c(Long empId, String financialYear);
    IT_Declaration_Info setDeclarationAmountForSection80c(Long empId, String financialYear,IT_Declaration_Info itDeclarationInfo);
    Double getDeclarationAmountForSection80c(Long empId, String financialYear);

    // section80d
    IT_Declaration_Info setSaveStatusForSection80d(Long empId, String financialYear);
    Boolean getSaveStatusForSection80d(Long empId, String financialYear);
    IT_Declaration_Info setDeclarationAmountForSection80d(Long empId, String financialYear,IT_Declaration_Info itDeclarationInfo);
    Double getDeclarationAmountForSection80d(Long empId, String financialYear);


    // section80e
    IT_Declaration_Info setSaveStatusForSection80e(Long empId, String financialYear);
    Boolean getSaveStatusForSection80e(Long empId, String financialYear);
    IT_Declaration_Info setDeclarationAmountForSection80e(Long empId, String financialYear,IT_Declaration_Info itDeclarationInfo);
    Double getDeclarationAmountForSection80e(Long empId, String financialYear);
}
