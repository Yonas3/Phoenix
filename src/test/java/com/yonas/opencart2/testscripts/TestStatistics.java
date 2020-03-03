package com.yonas.opencart2.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.yonas.opencart2.pages.AdminDashboardPage;
import com.yonas.opencart2.pages.AdminLoginPage;
import com.yonas.opencart2.pages.StatisticsPage;

public class TestStatistics extends BaseTest{
	
	@Test
	public void verifyStatistics() {
		
		launchAdminApp();
		AdminLoginPage login = new AdminLoginPage(driver);
		login.adminLogin("stat", "password");
		
		AdminDashboardPage dashboard = new AdminDashboardPage(driver);
		dashboard.clickOnStatistics();
		
		StatisticsPage statistics = new StatisticsPage(driver);
		
		Assert.assertEquals("8744633.5498", statistics.getTotalOrderSales());
		String sales =statistics.getTotalOrderSales();
		System.out.println(sales);
		
	}

}
