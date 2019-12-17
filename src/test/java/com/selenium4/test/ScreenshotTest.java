package com.selenium4.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\semmalai\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void takeScreenshotTest() throws IOException {
		WebElement logo = driver.findElement(By.xpath("//img[@id='hplogo']"));
		
		File file = logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
