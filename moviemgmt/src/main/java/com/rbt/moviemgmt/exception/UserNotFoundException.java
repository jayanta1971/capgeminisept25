package com.rbt.moviemgmt.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends RuntimeException {
    private int errorCode;
    private HttpStatus status;

    public UserNotFoundException(int errorCode, String message, HttpStatus status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }
}