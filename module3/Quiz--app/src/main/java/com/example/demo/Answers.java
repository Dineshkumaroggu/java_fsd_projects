package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String answer1;
	private String answer2;
	private String answer3;
	private int quizid;
	
	
	
	
	public Answers(int id, String name, String answer1, String answer2, String answer3, int quizid) {
		super();
		this.id = id;
		this.name = name;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.quizid = quizid;
	}




	public Answers() {
		super();
		// TODO Auto-generated constructor stub
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




	public String getAnswer1() {
		return answer1;
	}




	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}




	public String getAnswer2() {
		return answer2;
	}




	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}




	public String getAnswer3() {
		return answer3;
	}




	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}




	public int getQuizid() {
		return quizid;
	}




	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}




	@Override
	public String toString() {
		return "Answers [id=" + id + ", name=" + name + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3="
				+ answer3 + ", quizid=" + quizid + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
