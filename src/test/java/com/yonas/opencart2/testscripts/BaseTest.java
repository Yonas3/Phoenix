package com.yonas.opencart2.testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver = null;
	String browser = "chrome";
	String url = "https://demo.opencart.com";

	@BeforeMethod
	public void launchBrowser() {
		if (browser.equals("chrome")) {                    // make sure start ./src
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();                   
		} else if (browser.equals("firefox")) {            // saved in local file
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println(" browser doesn't match");
			Assert.fail("browser doesn't match");
		}
		driver.get(url);
		driver.manage().window().maximize();
		// waiting synchronization
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		// driver.quit(); // close all the browser thats is open by selenium
	}

	public void launchAdminApp() {
		driver.get(url+ "/admin");
	}

}