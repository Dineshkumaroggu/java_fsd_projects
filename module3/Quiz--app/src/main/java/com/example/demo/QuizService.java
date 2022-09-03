package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService<questionsid> {
	
	@Autowired
	private QuizRepo repo;
	
	public List<Quizz> findque(int quizid) {
		List<Quizz> questionss = repo.findByQuizid(quizid);
		return questionss;
	}
	
	
	
	

	
	

	
	
	

}
