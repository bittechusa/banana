package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	ChromeDriver driver = null;
	
	public ChromeDriver getDriver() {
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		}
	
	public void closeBrowser() {
		driver.quit();
	}

}
