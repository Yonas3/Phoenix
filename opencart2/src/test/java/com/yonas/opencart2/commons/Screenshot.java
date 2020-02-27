package com.yonas.opencart2.commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	WebDriver driver;
	public Screenshot(WebDriver tdriver) {
		this.driver = tdriver;
	}
	public void screenshot() {
		// Include extra ( TakesScreenshot and driver)
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\yonas\\Pictures\\Screenshots\\opencart.png");

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
