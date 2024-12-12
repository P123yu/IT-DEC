//package com.cms.IT_DEC.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class IT_Dec_File {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//    private Long employeeId;
//    private String name;
//
//
//}


package com.cms.IT_DEC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IT_Dec_File {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;
    private Long itDecId;
    private Long itDecDocId;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(Long employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public Long getItDecId() {
//        return itDecId;
//    }
//
//    public void setItDecId(Long itDecId) {
//        this.itDecId = itDecId;
//    }
//
//
//
//    public Long getItDecDocId() {
//        return itDecDocId;
//    }
//
//    public void setItDecDocId(Long itDecDocId) {
//        this.itDecDocId = itDecDocId;
//    }
//
//    public IT_Dec_File() {
//
//    }
//
//
//    public IT_Dec_File(Long id, Long employeeId, Long itDecId, String name, Long itDecDocId) {
//        this.id = id;
//        this.employeeId = employeeId;
//        this.itDecId = itDecId;
//        this.itDecDocId = itDecDocId;
//    }
}

