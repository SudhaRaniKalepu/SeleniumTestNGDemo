package com.sudha.selenium.testng.demo;

import org.testng.annotations.*;

public class Navigation extends SeleniumBase {
	
	@BeforeTest
	public void urlNavigation() throws InterruptedException {
	driver.get(Url);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(1000);
	}
}
