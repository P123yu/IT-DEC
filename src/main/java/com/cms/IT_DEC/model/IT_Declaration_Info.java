package com.cms.IT_DEC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Entity
public class IT_Declaration_Info extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itInfoId;
    private Long empId;
    private Long itDecId;
    private Double declarationAmount;  // total amount of declaration
    private String signaturePlace;
    private LocalDate signatureDate;
    private String hrSignaturePlace;
    private LocalDate hrSignatureDate;
    private String financialYear;
    private Integer taxRegime;
    private Boolean is_submitted; // status  // integer


    // house loan info

    private String instituteName;
    private Double loanAmount;
    private LocalDate loanDate;
    private Double interest;

    public Long getItInfoId() {
        return itInfoId;
    }

    public void setItInfoId(Long itInfoId) {
        this.itInfoId = itInfoId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getItDecId() {
        return itDecId;
    }

    public void setItDecId(Long itDecId) {
        this.itDecId = itDecId;
    }

    public Double getDeclarationAmount() {
        return declarationAmount;
    }

    public void setDeclarationAmount(Double declarationAmount) {
        this.declarationAmount = declarationAmount;
    }

    public String getSignaturePlace() {
        return signaturePlace;
    }

    public void setSignaturePlace(String signaturePlace) {
        this.signaturePlace = signaturePlace;
    }

    public LocalDate getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(LocalDate signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getHrSignaturePlace() {
        return hrSignaturePlace;
    }

    public void setHrSignaturePlace(String hrSignaturePlace) {
        this.hrSignaturePlace = hrSignaturePlace;
    }

    public LocalDate getHrSignatureDate() {
        return hrSignatureDate;
    }

    public void setHrSignatureDate(LocalDate hrSignatureDate) {
        this.hrSignatureDate = hrSignatureDate;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public Integer getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(Integer taxRegime) {
        this.taxRegime = taxRegime;
    }

    public Boolean getIs_submitted() {
        return is_submitted;
    }

    public void setIs_submitted(Boolean is_submitted) {
        this.is_submitted = is_submitted;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }




    public IT_Declaration_Info(){
    }



    public IT_Declaration_Info(Long itInfoId, Long empId, Long itDecId, Double declarationAmount, String signaturePlace, LocalDate signatureDate, String hrSignaturePlace, LocalDate hrSignatureDate, String financialYear, Integer taxRegime, Boolean is_submitted, String instituteName, Double loanAmount, LocalDate loanDate, Double interest) {
        this.itInfoId = itInfoId;
        this.empId = empId;
        this.itDecId = itDecId;
        this.declarationAmount = declarationAmount;
        this.signaturePlace = signaturePlace;
        this.signatureDate = signatureDate;
        this.hrSignaturePlace = hrSignaturePlace;
        this.hrSignatureDate = hrSignatureDate;
        this.financialYear = financialYear;
        this.taxRegime = taxRegime;
        this.is_submitted = is_submitted;
        this.instituteName = instituteName;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
        this.interest = interest;
    }
}
