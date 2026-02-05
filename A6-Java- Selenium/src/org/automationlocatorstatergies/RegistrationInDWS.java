package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Anjali");
		driver.findElement(By.id("LastName")).sendKeys("Sarage");
		driver.findElement(By.id("Email")).sendKeys("anjali.sarage@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rewati@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rewati@123");
		driver.findElement(By.id("register-button")).click();
		
	}
}
