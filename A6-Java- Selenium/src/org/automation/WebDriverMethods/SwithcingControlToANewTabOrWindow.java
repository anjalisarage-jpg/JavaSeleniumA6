package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithcingControlToANewTabOrWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://manamchocolate.com/");
		
		//open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ferrerorocher.com/us/en/");
		
		//to open a new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://lepure.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://fantasiechocolate.com/");
	}
}
