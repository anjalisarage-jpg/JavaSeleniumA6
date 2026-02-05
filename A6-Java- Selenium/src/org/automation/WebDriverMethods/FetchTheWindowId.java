package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheWindowId {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
	}

}
