package com.yonas.opencart2.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.yonas.opencart2.pages.AdminDashboardPage;
import com.yonas.opencart2.pages.AdminLoginPage;
import com.yonas.opencart2.pages.AdminProfilePage;

public class TestProfile extends BaseTest {
	
	@Test
	public void testSupportFourm() {
		launchAdminApp();
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.adminLogin("demo", "what");
		
		AdminDashboardPage dashboardPage = new AdminDashboardPage(driver);
		dashboardPage.clickOnDemoDropDown();
		dashboardPage.clickOnProfile();
		
		AdminProfilePage profilePage = new AdminProfilePage(driver);
		profilePage.createProfile("user21","Liya", "Bryant", "Bryant24@opencart", "liya24","liya24" );
		//String expectedEmail = profilePage.getEmailAttribute();
		Assert.assertEquals("Bryant24@opencart", profilePage.getEmailAttribute());
		Assert.assertEquals("Liya", profilePage.getFirstName());
		
	}
	

}
