package com.yonas.opencart2.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminProfilePage {
	WebDriver driver;
	
	public  AdminProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	public void createProfile(String userId, String firstName, String lastName, String emailId, String pass, String confirm) {
		WebElement user =driver.findElement(By.id("input-username"));
		user.clear();
		user.sendKeys(userId);
		
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.clear();
		fname.sendKeys(firstName);
		
		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.clear();
		lname.sendKeys(lastName);
		 
		WebElement email = driver.findElement(By.id("input-email"));
		email.clear();
		email.sendKeys(emailId);
		
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.id("input-confirm")).sendKeys(confirm);
		driver.findElement(By.cssSelector(".fa-save")).click();
	}
	
	public String getEmailAttribute() {
		return driver.findElement(By.id("input-email")).getAttribute("value");
		
	}
	public String getFirstName() {
		return driver.findElement(By.id("input-firstname")).getAttribute("value");
	}
	

}
