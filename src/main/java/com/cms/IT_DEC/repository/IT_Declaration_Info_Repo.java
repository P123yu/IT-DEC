package com.cms.IT_DEC.repository;

import com.cms.IT_DEC.model.IT_Declaration_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IT_Declaration_Info_Repo extends JpaRepository<IT_Declaration_Info,Long> {
    List<IT_Declaration_Info> findByEmpIdAndFinancialYear(Long empId, String financialYear);
    IT_Declaration_Info findByEmpIdAndFinancialYearAndItDecId(Long empId, String financialYear,Long itDecId);
}
