package Inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) {

		MyChromeDriver mdr = new MyChromeDriver();
		mdr.get();
		
		WebDriver dr = new ChromeDriver();
		dr.get("");
		animal a = new dog();
		a.eat();

	}

}
