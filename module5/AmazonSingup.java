package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSingup {

	public static void main(String[] args) {

	String path= "D:\\Mycompany\\java-fsd\\practice\\phase5\\required\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);

	
	WebDriver driver= new ChromeDriver();
	
	
	String url="https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&prevRID=X0PWH6ZFC1NW9PMJWVG3&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
	driver.get(url);
	
	
	driver.manage().window().maximize();

	
	
	

	

	WebElement name=driver.findElement(By.name("customerName"));
	name.sendKeys("Dinesh");	
	
	WebElement email=driver.findElement(By.name("email"));
	email.sendKeys("abc@gmail.com");
	
	WebElement pass=driver.findElement(By.name("password"));
	pass.sendKeys("abc@123");
	
	WebElement repass=driver.findElement(By.name("passwordCheck"));
	repass.sendKeys("abc@123");
	
	WebElement login=driver.findElement(By.id("continue"));
	login.submit();
	
	
	}

}
