package com.example.demo;

public class Login{
	
	public boolean auth(String userid,String password) {
		if(userid=="admin"& password=="root") {
			return true;
		}
		else {
			return false;
		}
	}
}
