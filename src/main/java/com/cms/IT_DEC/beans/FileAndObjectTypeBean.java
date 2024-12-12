package com.cms.IT_DEC.beans;

import com.cms.IT_DEC.dto.employee_dto.EmpResDTO;

public class FileAndObjectTypeBean {
    FileAndContentTypeBean fileAndContentTypeBean;
    EmpResDTO empResDTO;

    public FileAndContentTypeBean getFileAndContentTypeBean() {
        return fileAndContentTypeBean;
    }

    public void setFileAndContentTypeBean(FileAndContentTypeBean fileAndContentTypeBean) {
        this.fileAndContentTypeBean = fileAndContentTypeBean;
    }

    public EmpResDTO getEmpResDTO() {
        return empResDTO;
    }

    public void setEmpResDTO(EmpResDTO empResDTO) {
        this.empResDTO = empResDTO;
    }

    public FileAndObjectTypeBean() {
    }

    public FileAndObjectTypeBean(FileAndContentTypeBean fileAndContentTypeBean, EmpResDTO empResDTO) {
        this.fileAndContentTypeBean = fileAndContentTypeBean;
        this.empResDTO = empResDTO;
    }
}
