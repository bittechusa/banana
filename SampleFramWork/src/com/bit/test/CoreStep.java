package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreStep {
	ChromeDriver driver;
	public void typeUserId() {
		Shared.type(driver.findElement(ObjectPer.emailTextBox),TestData.UserId);
	}
		
	public void password() {
		Shared.type(driver.findElement(ObjectPer.passwordTextBox),TestData.Password);
		}
	
	public void typeFirstName() {
		Shared.type(driver.findElement(By.id("First Name")), "Kasif");
	}
	public void clickOnLogInButton() {
		Shared.click(driver.findElement(ObjectPer.loginButton));
	}
	public CoreStep(ChromeDriver x) {
		driver = x;
	}

}
