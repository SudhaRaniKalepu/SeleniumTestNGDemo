package com.sudha.selenium.testng.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartTestCase extends SuccessLogin {
	@Test
	public void addToCart() throws InterruptedException {
		System.out.println("URL from add to cart is::: " + driver.getCurrentUrl());
		 
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();//button[@id='add-to-cart-sauce-labs-backpack']
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();//button[@id='add-to-cart-sauce-labs-backpack']
		System.out.println("added to cart");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		System.out.println("Checkout clicked");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("Address added");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();//button[@id='add-to-cart-sauce-labs-backpack']
		System.out.println("Checkout completed");
		
		System.out.println("............Exiting the browser for TEST CASE AddToCartTestCase.........\n\n\n");
		Thread.sleep(2000);
		driver.quit();

	}

}
