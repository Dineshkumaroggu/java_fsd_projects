package com.example.demo;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quizz {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int quizid;
	private Integer questionid;
	
	
	
	public Quizz(int id, int quizid, Integer questionid) {
		super();
		this.id = id;
		this.quizid = quizid;
		this.questionid = questionid;
	}



	public Quizz() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Integer getQuizid() {
		return quizid;
	}



	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}



	public Integer getQuestionid() {
		return questionid;
	}



	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}



	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quizid=" + quizid + ", questionid=" + questionid + "]";
	}
	
	
}
	

	