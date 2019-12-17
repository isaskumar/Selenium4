package com.selenium4.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Location {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\semmalai\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void location() {
		driver.get("https://www.google.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@id='hplogo']"));
		
		System.out.println("Height is "+logo.getRect().getDimension().getHeight());
	    System.out.println("Width is "+logo.getRect().getDimension().getWidth());
	    System.out.println("Location X is "+logo.getRect().getX());
	    System.out.println("Location Y is "+logo.getRect().getY());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
