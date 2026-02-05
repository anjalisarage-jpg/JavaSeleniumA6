package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise ear buds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement priceElement = driver.findElement(By.xpath
	    ("//span[contains(text(),'VS404')]/../../../..//span[@class='a-price-whole']"));
		String price = priceElement.getText();
		System.out.println("price : "+price);
	}
}
