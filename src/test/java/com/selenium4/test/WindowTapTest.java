package com.selenium4.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowTapTest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\semmalai\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void openNewTap() {
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://selenium.dev/");
	}
	
	@Test
	public void openNewWindow() {
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://selenium.dev/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
