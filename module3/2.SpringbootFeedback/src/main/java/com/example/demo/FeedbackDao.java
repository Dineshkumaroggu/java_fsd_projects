package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDao {

	@Autowired
	private JdbcTemplate template;
	
	public int addFeedback(Feedback feedback) {
		
		return template.update("insert into feedback (name,mailid,feedback) values (?,?,?)", 
			feedback.getName(),feedback.getMailid(),feedback.getFeedback());
	}
	
}