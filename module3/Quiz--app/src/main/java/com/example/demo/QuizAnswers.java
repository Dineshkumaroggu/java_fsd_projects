package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answers")
public class QuizAnswers {

	@Autowired
	private AnswersRepo repo;

	@Autowired
	private QuizService service;
	@Autowired
	private QuestionsRepo repo1;

	int qid;
	int count=0;
	ArrayList<String> finalresult = new ArrayList<String>();

	@PostMapping("/")
	public ResponseEntity<Object> addAnswers(@RequestBody Answers a) {
		Answers answer = repo.save(a);
		qid = answer.getQuizid();
		if (answer != null)
		{
			ArrayList<String> uans = new ArrayList<String>();
			uans.add(answer.getAnswer1());
			uans.add(answer.getAnswer2());
			uans.add(answer.getAnswer3());
			
			List<Quizz> resp = service.findque(qid);
			
			// created an arraylist to store which questions comes under the given quiz id
			ArrayList<Integer> questionsid = new ArrayList<Integer>();

			// saveing all the question id's in the arraylist
			resp.forEach(e -> questionsid.add(e.getQuestionid()));
			System.out.println(questionsid);
			
			
			List<Questions> findall = repo1.findAllById(questionsid);
			ArrayList<String> ans = new ArrayList<String>();
			findall.forEach((e)->ans.add(e.getAnswer()));
			
			

			for(int i=0; i<ans.size(); i++)
			{
				if(ans.get(i).equalsIgnoreCase(uans.get(i)))
				{
					count++;
					
				}
			}
			finalresult.clear();
			finalresult.add("Your Final result is: "+count+" Out of "+questionsid.size());
			finalresult.add("Correct Ans: "+ans);
			System.out.println(ans);
			count=0;
		}
			
			return new ResponseEntity<Object>(finalresult, HttpStatus.CREATED);
			
		
	}



}
