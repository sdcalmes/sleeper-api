package com.sdcalmes.sleeper;

/**
 * The type Sleeper error.
 */
public class SleeperError extends Exception {

    private int statusCode;
    private String message;
    private String requestUrl;

    /**
     * Gets request url.
     *
     * @return the request url
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Sets request url.
     *
     * @param requestUrl the request url
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * Gets status code.
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    /**
     * Sets status code.
     *
     * @param statusCode the status code
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
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
