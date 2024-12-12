package com.cms.IT_DEC.service.impl;

import com.cms.IT_DEC.model.IT_Declaration_Info;
import com.cms.IT_DEC.service.IT_Declaration_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cms.IT_DEC.repository.IT_Declaration_Info_Repo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IT_Declaration_Info_ServiceImpl implements IT_Declaration_Info_Service {

    @Autowired
    private IT_Declaration_Info_Repo itDeclarationInfoRepo;

    @Override
    public List<IT_Declaration_Info> createDeclarationInfo(List<IT_Declaration_Info> itDeclarationInfo) {

//       if(itDeclarationInfo.get)
        return itDeclarationInfoRepo.saveAll(itDeclarationInfo);
    }

    @Override
    public List<IT_Declaration_Info> getDeclarationInfoByEmpIdAndFinancialYear(Long empId, String financialYear) {
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYear(empId, financialYear);
    }

    @Override
    public IT_Declaration_Info setSaveStatusForSection80c(Long empId, String financialYear) {
        Long deductionUnderSection80cId=1L;
        IT_Declaration_Info itDeclarationInfo=  itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80cId);
        itDeclarationInfo.setIs_submitted(true);
        return itDeclarationInfoRepo.save(itDeclarationInfo);
    }

    @Override
    public Boolean getSaveStatusForSection80c(Long empId, String financialYear) {
        Long deductionUnderSection80cId=1L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80cId).getIs_submitted();
    }

    @Override
    public IT_Declaration_Info setDeclarationAmountForSection80c(Long empId, String financialYear,IT_Declaration_Info itDeclarationInfo) {
        Long deductionUnderSection80cId=1L;
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80cId);

        // sum amount
        itDeclarationInfoObj.setDeclarationAmount(itDeclarationInfo.getDeclarationAmount());
        return itDeclarationInfoRepo.save(itDeclarationInfoObj);
    }

    @Override
    public Double getDeclarationAmountForSection80c(Long empId, String financialYear) {
        Long deductionUnderSection80cId=1L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,deductionUnderSection80cId).getDeclarationAmount();
    }

    @Override
    public IT_Declaration_Info setSaveStatusForSection80d(Long empId, String financialYear) {
        Long deductionUnderSection80dId=3L;
        IT_Declaration_Info itDeclarationInfo=  itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80dId);
        itDeclarationInfo.setIs_submitted(true);
        return itDeclarationInfoRepo.save(itDeclarationInfo);
    }

    @Override
    public Boolean getSaveStatusForSection80d(Long empId, String financialYear) {
        Long deductionUnderSection80dId=3L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80dId).getIs_submitted();
    }

    @Override
    public IT_Declaration_Info setDeclarationAmountForSection80d(Long empId, String financialYear, IT_Declaration_Info itDeclarationInfo) {
        Long deductionUnderSection80dId=3L;
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80dId);

        // sum amount
        itDeclarationInfoObj.setDeclarationAmount(itDeclarationInfo.getDeclarationAmount());
        return itDeclarationInfoRepo.save(itDeclarationInfoObj);
    }

    @Override
    public Double getDeclarationAmountForSection80d(Long empId, String financialYear) {
        Long deductionUnderSection80dId=3L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,deductionUnderSection80dId).getDeclarationAmount();
    }

    @Override
    public IT_Declaration_Info setSaveStatusForSection80e(Long empId, String financialYear) {
        Long deductionUnderSection80eId=1L;
        IT_Declaration_Info itDeclarationInfo=  itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80eId);
        itDeclarationInfo.setIs_submitted(true);
        return itDeclarationInfoRepo.save(itDeclarationInfo);
    }

    @Override
    public Boolean getSaveStatusForSection80e(Long empId, String financialYear) {
        Long deductionUnderSection80eId=1L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80eId).getIs_submitted();
    }


    @Override
    public IT_Declaration_Info setDeclarationAmountForSection80e(Long empId, String financialYear, IT_Declaration_Info itDeclarationInfo) {
        Long deductionUnderSection80eId=1L;
        IT_Declaration_Info itDeclarationInfoObj=itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId,financialYear,deductionUnderSection80eId);

        // sum amount
        itDeclarationInfoObj.setDeclarationAmount(itDeclarationInfo.getDeclarationAmount());
        return itDeclarationInfoRepo.save(itDeclarationInfoObj);
    }

    @Override
    public Double getDeclarationAmountForSection80e(Long empId, String financialYear) {
        Long deductionUnderSection80eId=1L;
        return itDeclarationInfoRepo.findByEmpIdAndFinancialYearAndItDecId(empId, financialYear,deductionUnderSection80eId).getDeclarationAmount();
    }
}
