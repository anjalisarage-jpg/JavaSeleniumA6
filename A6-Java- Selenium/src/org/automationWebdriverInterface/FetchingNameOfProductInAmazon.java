package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingNameOfProductInAmazon {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending lighters");
		driver.findElement(By.id("nav-search-submit-button")).click();	
		WebElement productElement = driver.findElement(By.xpath
				("//span[contains(text(),'Dragon') and contains(text(), 'Pack of 1')]"));
		String productName = productElement.getText();
		System.out.println(productName);
	}

}
