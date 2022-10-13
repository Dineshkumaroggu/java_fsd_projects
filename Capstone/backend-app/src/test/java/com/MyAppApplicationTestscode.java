package com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyAppApplicationTestscode {
	
	WebDriver driver;
	
@Test (priority=0)	
  public void testing() {
	  

		long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("http://localhost:4200/home");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for main page load = "+(totalTime*0.001)+" Seconds"); 
  }
	   



@Test (priority=1)	
public void signup() {
	  
	     driver.get("http://localhost:4200/signUp");
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("u1");
	    driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("u1");
	    driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/form/input[3]")).click();
	    System.out.println("sucessfully signUp ");
   }

   
@Test (priority=2)	
  public void signin() {
	  
	     driver.get("http://localhost:4200/login");
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/input[3]")).click();
	    System.out.println("sucessfully logged in");
     }
  
	  
	  
@Test (priority=4)	
public void adminhome() {
	  

		long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("http://localhost:4200/adminHome");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for admin home page load = "+(totalTime*0.001)+" Seconds"); 
}
	   

@Test (priority=5)	
public void userhome() {


	long start = System.currentTimeMillis();
	driver.manage().window().maximize();
  driver.get("http://localhost:4200/userHome");
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for user home page load = "+(totalTime*0.001)+" Seconds"); 
}
 

@Test (priority=6)	
public void loadusers() {


	long start = System.currentTimeMillis();
	driver.manage().window().maximize();
  driver.get("http://localhost:4200/allusers");
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for allusers page load = "+(totalTime*0.001)+" Seconds"); 
}
 


@Test (priority=7)	
public void approve() {


	long start = System.currentTimeMillis();
	driver.manage().window().maximize();
  driver.get("http://localhost:4200/approve");
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for approve page load = "+(totalTime*0.001)+" Seconds"); 
}
 




  @BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Mycompany\\java-fsd\\practice\\phase5\\required\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
  

	@AfterMethod
	public void afterMethod() {
		//driver.close();
		 driver = null;
	}
}
