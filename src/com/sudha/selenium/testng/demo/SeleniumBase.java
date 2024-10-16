package com.sudha.selenium.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumBase {
		
	public WebDriver driver;
	String Url = "https://www.saucedemo.com";

	@BeforeTest(alwaysRun = true)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Sudha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
	
