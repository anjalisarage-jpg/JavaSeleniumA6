package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfAProductInFlipcart {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000",Keys.ENTER);
		WebElement priceElement = driver.findElement(By.xpath
				("(//div[contains(text(),\"I Kall I1\")]/../..//div[contains(text(),'₹')])[1]"));
		String price = priceElement.getText();
		System.out.println("price: "+price);
		
	}
}
