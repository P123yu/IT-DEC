package com.cms.IT_DEC.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Entity
public class IT_Declaration_Master extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itDecId;
    private String declarationName;
    private String description;
    private String additionalInformation;

    public Long getItDecId() {
        return itDecId;
    }

    public void setItDecId(Long itDecId) {
        this.itDecId = itDecId;
    }

    public String getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(String declarationName) {
        this.declarationName = declarationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }


    public IT_Declaration_Master() {
    }

    public IT_Declaration_Master(Long itDecId, String declarationName, String description, String additionalInformation) {
        this.itDecId = itDecId;
        this.declarationName = declarationName;
        this.description = description;
        this.additionalInformation = additionalInformation;
    }
}
