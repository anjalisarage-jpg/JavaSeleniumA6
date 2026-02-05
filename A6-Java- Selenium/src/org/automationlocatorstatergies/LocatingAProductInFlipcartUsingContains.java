package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAProductInFlipcartUsingContains {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Motorola Edge 60 pro");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath
		("//div[contains(text(),'Pantone Sparkling Grape, 256 GB)')]")).click();
		
		
		

	}

}
