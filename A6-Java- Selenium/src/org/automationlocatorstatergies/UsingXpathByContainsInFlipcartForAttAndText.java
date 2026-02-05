package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContainsInFlipcartForAttAndText {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("washing machine");
		driver.findElement(By.xpath("//button[contains(@title,\"Search for Product\")]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'LG 8.5 kg 5 Star with Roller')]")).click();
		
	}

}
