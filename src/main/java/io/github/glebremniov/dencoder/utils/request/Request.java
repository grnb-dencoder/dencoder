package io.github.glebremniov.dencoder.utils.request;

import java.io.Serializable;

public class Request implements Serializable {
    
    private String message;
    private String secret;

    public Request() {
    }

    public Request(String message, String secret) {
        this.message = message;
        this.secret = secret;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Request{" +
                "message='" + message + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
