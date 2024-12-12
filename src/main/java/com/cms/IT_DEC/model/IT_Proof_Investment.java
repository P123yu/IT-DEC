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

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor


@Entity
public class IT_Proof_Investment  extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentProfId;
    private Double revisedAmount;
    private Long empId;
    private String financialYear;
    private Long itDecId;
    private String remarks;
    private String landLordName;
    private String landLordPanNo;
    private String hrRejectionRemarks;
    private String additionalInformation;
    private String hrSignaturePlace;
    private LocalDate hrSignatureDate;
    private Long fileEntryId;

    private Boolean status;  // integer
    private Boolean isSubmitted;

    public Long getDocumentProfId() {
        return documentProfId;
    }

    public void setDocumentProfId(Long documentProfId) {
        this.documentProfId = documentProfId;
    }

    public Double getRevisedAmount() {
        return revisedAmount;
    }

    public void setRevisedAmount(Double revisedAmount) {
        this.revisedAmount = revisedAmount;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public Long getItDecId() {
        return itDecId;
    }

    public void setItDecId(Long itDecId) {
        this.itDecId = itDecId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLandLordName() {
        return landLordName;
    }

    public void setLandLordName(String landLordName) {
        this.landLordName = landLordName;
    }

    public String getLandLordPanNo() {
        return landLordPanNo;
    }

    public void setLandLordPanNo(String landLordPanNo) {
        this.landLordPanNo = landLordPanNo;
    }

    public String getHrRejectionRemarks() {
        return hrRejectionRemarks;
    }

    public void setHrRejectionRemarks(String hrRejectionRemarks) {
        this.hrRejectionRemarks = hrRejectionRemarks;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
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

    public Long getFileEntryId() {
        return fileEntryId;
    }

    public void setFileEntryId(Long fileEntryId) {
        this.fileEntryId = fileEntryId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(Boolean submitted) {
        isSubmitted = submitted;
    }


    public IT_Proof_Investment() {

    }

    public IT_Proof_Investment(Long documentProfId, Double revisedAmount, Long empId, String financialYear, Long itDecId, String remarks, String landLordName, String landLordPanNo, String hrRejectionRemarks, String additionalInformation, String hrSignaturePlace, LocalDate hrSignatureDate, Long fileEntryId, Boolean status, Boolean isSubmitted) {
        this.documentProfId = documentProfId;
        this.revisedAmount = revisedAmount;
        this.empId = empId;
        this.financialYear = financialYear;
        this.itDecId = itDecId;
        this.remarks = remarks;
        this.landLordName = landLordName;
        this.landLordPanNo = landLordPanNo;
        this.hrRejectionRemarks = hrRejectionRemarks;
        this.additionalInformation = additionalInformation;
        this.hrSignaturePlace = hrSignaturePlace;
        this.hrSignatureDate = hrSignatureDate;
        this.fileEntryId = fileEntryId;
        this.status = status;
        this.isSubmitted = isSubmitted;
    }
}
