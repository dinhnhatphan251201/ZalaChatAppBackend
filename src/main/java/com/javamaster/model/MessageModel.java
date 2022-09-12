package com.javamaster.model;

public class MessageModel {

    private String message;
    private String fromLogin;

    public String getMessage() {
        return message;
    }
    
    

    public MessageModel(String message, String fromLogin) {
		super();
		this.message = message;
		this.fromLogin = fromLogin;
	}



	public void setMessage(String message) {
        this.message = message;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
