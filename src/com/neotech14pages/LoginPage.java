package com.neotech14pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class LoginPage extends CommonMethods {

	public WebElement username = driver.findElement(By.id("txtUsername"));
	
	public 	WebElement password = driver.findElement(By.name("txtPassword"));
	
	public WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	
	
}
