package com.yonas.opencart2.testscripts;

import org.testng.annotations.Test;

import com.yonas.opencart2.pages.AdminCouponsPage;
import com.yonas.opencart2.pages.AdminDashboardPage;
import com.yonas.opencart2.pages.AdminLoginPage;

public class TestCoupon extends BaseTest {
	
	@Test
	public void VerifyEditCoupoun() {
		
		launchAdminApp();
		AdminLoginPage adminLogin = new AdminLoginPage(driver);
		adminLogin.adminLogin("you", "password");
		
		AdminDashboardPage adminDashboard= new AdminDashboardPage(driver);
		adminDashboard.clickOnCoupons();
		
		AdminCouponsPage adminCoupon = new AdminCouponsPage(driver);
		adminCoupon.editCoupon("OPEN23", "O23P", "10%");
		
		
		
	}

}
