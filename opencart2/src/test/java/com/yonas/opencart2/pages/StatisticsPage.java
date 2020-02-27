package com.yonas.opencart2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatisticsPage {
	
	WebDriver driver;
	
	public StatisticsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTotalOrderSales() {
		return driver.findElement(By.xpath("//div[@class='panel-body']/div//tbody/tr/td[2]")).getText();
	}

}
