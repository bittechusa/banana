package com.bit.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) {
		BaseTest b = new BaseTest();
		ChromeDriver driver= b.getDriver();
		CoreStep s = new CoreStep();
		s.password(driver);
	}

}
