package com.cms.IT_DEC.dto.document_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


public class DocumentDTO {
    private Long docId;
    private String itemName;
    private String docType;
    private String docPath;
    private String compressed;
    private long empId;
    private String empGroup;
    private String empOrg;
    private String docTags;
    private String location;
    private String itemType;
    private String createdByRole;
    private LocalDate createdDate;
    private String docCaption;
    private String docDescription;

    public DocumentDTO() {
    }

    public DocumentDTO(Long docId, String itemName, String docType, String docPath, String compressed, long empId, String empGroup, String empOrg, String docTags, String location, String itemType, String createdByRole, LocalDate createdDate, String docCaption, String docDescription) {
        this.docId = docId;
        this.itemName = itemName;
        this.docType = docType;
        this.docPath = docPath;
        this.compressed = compressed;
        this.empId = empId;
        this.empGroup = empGroup;
        this.empOrg = empOrg;
        this.docTags = docTags;
        this.location = location;
        this.itemType = itemType;
        this.createdByRole = createdByRole;
        this.createdDate = createdDate;
        this.docCaption = docCaption;
        this.docDescription = docDescription;
    }

    public String getDocDescription() {
        return docDescription;
    }

    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public String getDocCaption() {
        return docCaption;
    }

    public void setDocCaption(String docCaption) {
        this.docCaption = docCaption;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByRole() {
        return createdByRole;
    }

    public void setCreatedByRole(String createdByRole) {
        this.createdByRole = createdByRole;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDocTags() {
        return docTags;
    }

    public void setDocTags(String docTags) {
        this.docTags = docTags;
    }

    public String getEmpOrg() {
        return empOrg;
    }

    public void setEmpOrg(String empOrg) {
        this.empOrg = empOrg;
    }

    public String getEmpGroup() {
        return empGroup;
    }

    public void setEmpGroup(String empGroup) {
        this.empGroup = empGroup;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getCompressed() {
        return compressed;
    }

    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Override
    public String toString() {
        return "DocumentDTO{" +
                "docId=" + docId +
                ", itemName='" + itemName + '\'' +
                ", docType='" + docType + '\'' +
                ", docPath='" + docPath + '\'' +
                ", compressed='" + compressed + '\'' +
                ", empId=" + empId +
                ", empGroup='" + empGroup + '\'' +
                ", empOrg='" + empOrg + '\'' +
                ", docTags='" + docTags + '\'' +
                ", location='" + location + '\'' +
                ", itemType='" + itemType + '\'' +
                ", createdByRole='" + createdByRole + '\'' +
                ", createdDate=" + createdDate +
                ", docCaption='" + docCaption + '\'' +
                ", docDescription='" + docDescription + '\'' +
                '}';
    }
}
