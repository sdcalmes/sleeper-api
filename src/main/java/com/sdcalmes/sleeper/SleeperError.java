package com.sdcalmes.sleeper;

public class SleeperError extends Exception {

    private int statusCode;
    private String message;
    private String requestUrl;

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SleeperError{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                '}';
    }
}
