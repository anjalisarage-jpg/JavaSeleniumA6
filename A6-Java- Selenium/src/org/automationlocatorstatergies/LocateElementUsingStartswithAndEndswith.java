package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementUsingStartswithAndEndswith {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("TV");
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search')]")).click();
		//driver.findElement(By.xpath("//img[starts-with(@alt,'Thomson Alpha QLED 8')]")).click();
		driver.findElement(By.xpath("//span[ends-with(text(),'| Sports Mode | Bezel - Less Design')]")).click();
		//driver.findElement(By.xpath
//("//div[ends-with(text(),'Smart Linux TV 2025 Edition with 36W Sound Output | W...')]")).click();
	}

}
