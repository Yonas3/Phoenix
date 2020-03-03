package com.yonas.opencart2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AdminCouponsPage {
	
	WebDriver driver;
	
	public AdminCouponsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void editCoupon(String coupN, String newCode, String discountPercent) {
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a")).click();
		WebElement couponName = driver.findElement(By.id("input-name"));
		couponName.clear();
		couponName.sendKeys(coupN);
		
		WebElement code =driver.findElement(By.id("input-code"));
		code.clear();
		code.sendKeys(newCode);
		
		WebElement discount = driver.findElement(By.id("input-discount"));
		discount.clear();
		discount.sendKeys(discountPercent);
	
		driver.findElement(By.name("logged")).click();
		
		driver.findElement(By.cssSelector("#input-product")).click();
		driver.findElement(By.xpath("//div[@id='tab-general']//div[8]//li[4]")).click();
		
		WebElement enabled = driver.findElement(By.id("input-status"));	
		Select select = new Select(enabled);
		select.selectByVisibleText("Enabled");

		
	
		
	}
}
