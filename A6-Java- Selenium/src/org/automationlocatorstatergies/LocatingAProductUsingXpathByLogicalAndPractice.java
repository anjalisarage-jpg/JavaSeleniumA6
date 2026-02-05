package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAProductUsingXpathByLogicalAndPractice {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Fastrack women watches");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath
	("//span[contains(text(),'Fastrack Vyb') and contains(text(), 'Silver & Pink Dial')]")).click();
	}
}
