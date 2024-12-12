package com.cms.IT_DEC.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@MappedSuperclass
public class BaseModel {
    @Column(updatable = false)
    private LocalDate createdDate;
    @Column(insertable = false)
    private LocalDate modifiedDate;
}