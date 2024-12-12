package com.cms.IT_DEC.beans;

public class FileAndContentTypeBean {
    private final byte[] file;
    private final String contentType;

    public FileAndContentTypeBean(byte[] file, String contentType) {
        this.file = file;
        this.contentType = contentType;
    }

    public byte[] getFile() {
        return file;
    }

    public String getContentType() {
        return contentType;
    }
}
