package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginButtonUsingLocator {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anjali.sarage@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rewati@123");
		driver.findElement(By.name("login")).click();
		
		
	}

}
