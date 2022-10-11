package com.simplilearn.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest_firefox {
	
WebDriver driver;


@Test
public void search() {
	
	
	long start = System.currentTimeMillis();
	driver.manage().window().maximize();
    driver.get("https://www.flipkart.com");
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for page load = "+(totalTime*0.001)+" Seconds"); 
	
    
    //login
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7893773899");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("******");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
    System.out.println("sucessfully logged in");
   
    //searching iphone13
    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone 13");
    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
    System.out.println("sucesfully searched iphone 13");
    
   //scroll down
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,1000)", "");
    System.out.println("Sucesfully scrolled");
    
   
    
    
    //scroll upto end of page
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    System.out.println("Reached to bottom of page");
	
}





  @BeforeMethod
	public void beforeMethod() {
		
	  System.setProperty("webdriver.gecko.driver", "D:\\Mycompany\\java-fsd\\practice\\phase5\\required\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
  

	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}
