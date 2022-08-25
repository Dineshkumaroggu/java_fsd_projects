package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Maintest {
   
	
	private Login login;
	
	@Before
	public void setup() {
		login= new Login();
		System.out.println("Login Initiated");
	}
	
	@After
	public void tearDown() {
		login=null;
		System.out.println("Login Closed");
	}
	@Test
	public void bothcorrect() {
		 assertEquals(true,login.auth("admin","root"));
	}
	
	@Test
	public void WrongUsername() {
		 assertEquals(false,login.auth("my","root"));
		
	}
	
	@Test
	public void WrongPassword() {
		 assertEquals(false,login.auth("admin","password"));
	}
	
	@Test 
	public void WrongUsernameandPassword() {
		 assertEquals(false,login.auth("myid","password"));
	}

}
