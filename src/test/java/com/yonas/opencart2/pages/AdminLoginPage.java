package com.yonas.opencart2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {

	WebDriver driver;

	// constructor to initialize WebDriver
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void adminLogin(String user, String password) {
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys(user);
		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
