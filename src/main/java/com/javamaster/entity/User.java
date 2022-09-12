package com.javamaster.entity;

import java.util.List;

public class User {
	private String id;
	private String fullName;
	private String phoneNumber;
	private List<String> members;
	private List<String> conversations;
	public User(String id, String fullName, String phoneNumber, List<String> members, List<String> conversations) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.members = members;
		this.conversations = conversations;
	}
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}
	public List<String> getConversations() {
		return conversations;
	}
	public void setConversations(List<String> conversations) {
		this.conversations = conversations;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", members=" + members
				+ ", conversations=" + conversations + "]";
	}
	
	
	
	
	
}
