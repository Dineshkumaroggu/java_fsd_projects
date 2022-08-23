package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private FeedbackDao dao;
	
	@PostMapping("/feedback")
	public String userRegister(@RequestParam("name") String name,  @RequestParam("mailid") String mailid , @RequestParam("feedback") String feedback) {
	Feedback f = new Feedback(name,mailid,feedback);
	int data= dao.addFeedback(f);
	if(data>0) {
		return "Feedback added succesfully!";
	}
	else {
		return "Unable to add the feedback";
	}
		
	}
//	@PostMapping("/feedback")
//	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback) {
//		
//		int x=dao.addFedback(feedback);
//		System.out.println(x);
//		if(x>0)
//			return new ResponseEntity<String>("Data inserted",HttpStatus.OK);
//		else
//			return new ResponseEntity<String>("Error in inserting",
//					HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}