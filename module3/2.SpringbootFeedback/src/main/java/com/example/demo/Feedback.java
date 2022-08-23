package com.example.demo;


import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan @org.springframework.data.relational.core.mapping.Table(name="feedback")
public class Feedback {

	@org.springframework.data.annotation.Id @Generated(value = { "" })
	private int id;
	private String name;
	private String mailid;
	private String feedback;
    


	public Feedback(String name, String mailid, String feedback) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.feedback = feedback;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", mailid=" + mailid + ", feedback=" + feedback + "]";
	}

	

}
