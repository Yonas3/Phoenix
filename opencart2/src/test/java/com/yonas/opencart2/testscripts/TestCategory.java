package com.yonas.opencart2.testscripts;

import org.testng.annotations.Test;

import com.yonas.opencart2.pages.AdminDashboardPage;
import com.yonas.opencart2.pages.AdminLoginPage;

public class TestCategory extends BaseTest {
	
	@Test(groups = {"smoke"})
	public void verifyDeleteCat() {
		launchAdminApp();
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.adminLogin("user12", "password");
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnCategories();
		
		AdminDashboardPage adminDashboard = new AdminDashboardPage(driver);
		adminDashboard.clickOnCoupons();
	}

}
