package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingEmailTextBoxUsingXpathByAtrribute {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("KGF");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		
	}

}
