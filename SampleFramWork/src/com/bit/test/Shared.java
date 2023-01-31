package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void type(WebElement element, String text) {
		element.sendKeys(text);
	
	}
	public static void type(By by, String text) {
		by.className("className");
	
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void click(List<WebElement> elements, int index) {
		elements.get(index).click();
		
}
	
}
