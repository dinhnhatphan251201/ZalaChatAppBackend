package com.javamaster.entity;

import java.util.List;

public class Member {
	private String id;
	private String userId;
	private String nameUser;
	private List<String> messages;
	private String conversationId;
	public Member(String id, String userId, String nameUser, List<String> messages, String conversationId) {
		super();
		this.id = id;
		this.userId = userId;
		this.nameUser = nameUser;
		this.messages = messages;
		this.conversationId = conversationId;
	}
	public Member() {
		super();
	}
	public Member(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", userId=" + userId + ", nameUser=" + nameUser + ", messages=" + messages
				+ ", conversationId=" + conversationId + "]";
	}
	
	
	
}
