package com.cms.IT_DEC.beans;

import com.cms.IT_DEC.dto.user_dto.UserDTO;

public class EmpAndUserTypeResponse {
    private FileAndObjectTypeBean fileAndObjectTypeBean;
    private UserDTO userDTO;

    public FileAndObjectTypeBean getFileAndObjectTypeBean() {
        return fileAndObjectTypeBean;
    }

    public void setFileAndObjectTypeBean(FileAndObjectTypeBean fileAndObjectTypeBean) {
        this.fileAndObjectTypeBean = fileAndObjectTypeBean;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public EmpAndUserTypeResponse() {

    }

    public EmpAndUserTypeResponse(FileAndObjectTypeBean fileAndObjectTypeBean, UserDTO userDTO) {
        this.fileAndObjectTypeBean = fileAndObjectTypeBean;
        this.userDTO = userDTO;
    }
}
