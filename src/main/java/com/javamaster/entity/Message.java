package com.javamaster.entity;

import java.util.Date;

public class Message {
	private String id;
	private String sender;
	private String content;
	private String conversationId;
	private String senderName;
	private Date createAt;
	public Message(String id, String sender, String content, String conversationId, String senderName) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
		this.conversationId = conversationId;
		this.senderName = senderName;
		this.createAt = new Date();
	}
	
	public Message(String id, String sender, String content, String conversationId, String senderName, Date createAt) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
		this.conversationId = conversationId;
		this.senderName = senderName;
		this.createAt = createAt;
	}
	public Message() {
		super();
	}
	public Message(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", sender=" + sender + ", content=" + content + ", conversationId="
				+ conversationId + ", senderName=" + senderName + ", createAt=" + createAt + "]";
	}
	
	
	
}
