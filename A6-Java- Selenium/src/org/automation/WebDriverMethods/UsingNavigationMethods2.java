package org.automation.WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods2 {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jawayezdimotorcycles.com/");
		Thread.sleep(3000);
		URL url = new URL("https://www.suzukimotorcycle.co.in/");
		driver.navigate().to(url);
		
	}

}
