package com.bookree.adminbookree.domain.exception;

public class ErrorResponse {

    private String error;
    private String path;

    public ErrorResponse(String error, String path) {
        this.error = error;
        this.path = path;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
