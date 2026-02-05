package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlOfFossilPage {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fossil.com/");
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		String url = driver.getCurrentUrl();
		System.out.println("URL : "+url);
	}
}


