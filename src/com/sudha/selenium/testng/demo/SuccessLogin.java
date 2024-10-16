package com.sudha.selenium.testng.demo;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class SuccessLogin extends Navigation {
	
	@BeforeTest
	public void successLogin() throws InterruptedException{
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();

	Thread.sleep(1000);
	}
	
}
