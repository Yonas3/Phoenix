package com.yonas.opencart2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {
	
	WebDriver driver;
	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCategories() {
		driver.findElement(By.xpath("//a[(text()=' Catalog')]")).click();
		driver.findElement(By.xpath("//a[text()='Categories']")).click();
	}

	public void clickOnProduct() {
		driver.findElement(By.xpath("//a[(text()=' Catalog')]")).click();
		driver.findElement(By.xpath("//a[text()='Products']")).click();
	}
	
	public void clickOnDemoDropDown() {
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	}
	
	public void clickOnProfile() {
		driver.findElement(By.xpath("//a[text()=' Your Profile']")).click();
	}
	
	public void clickOnCoupons() {
		driver.findElement(By.xpath("//a[contains(text(),'Marketing')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
	}
	
	public void clickOnStatistics() {
		driver.findElement(By.xpath("//a[text()=' Reports']")).click();
		driver.findElement(By.xpath("//a[text()='Statistics']")).click();
	}
	
}
