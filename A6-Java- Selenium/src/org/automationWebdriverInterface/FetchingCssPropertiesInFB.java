package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingCssPropertiesInFB {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
		System.out.println("BG color: "+loginButton.getCssValue("background-color"));
		System.out.println("Text color: "+loginButton.getCssValue("color"));
		System.out.println("Text size: "+loginButton.getCssValue("font-size"));
	}
}

