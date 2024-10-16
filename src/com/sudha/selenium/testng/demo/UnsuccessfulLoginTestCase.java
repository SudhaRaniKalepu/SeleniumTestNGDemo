package com.sudha.selenium.testng.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UnsuccessfulLoginTestCase extends Navigation {

	@Test
	public void unsuccessfulLogin() throws InterruptedException {
		System.out.println("Driver in Unsuccessful is " + driver);
		System.out.println("URL is ::: " + Url);
		driver.get(Url);
		driver.findElement(By.id("user-name")).sendKeys("tandard_user");
		driver.findElement(By.name("password")).sendKeys("ecret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(1000);
		
		System.out.println("............Exiting the browser for TEST CASE UnsuccessfulLoginTestCase.........\n\n\n");
		Thread.sleep(2000);
		driver.quit();

	}
}