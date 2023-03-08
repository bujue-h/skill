package com.bujue.skill.Exception;

public class ApplicationException extends RuntimeException {
    private String errorCode;

    public ApplicationException() {
    }

    public ApplicationException(String msg) {
        super(msg);
    }

    public ApplicationException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    public ApplicationException(String msg, Throwable innerException) {
        super(msg, innerException);
    }

    public ApplicationException(String errorCode, String msg, Throwable innerException) {
        super(msg, innerException);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
