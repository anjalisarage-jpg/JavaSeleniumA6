package org.automationlocatorstatergies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPricesOfAllProducts {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("twotabsearchtextbox");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> priceElements = driver.findElements(By.className("a-price-whole"));
		
		for(WebElement priceElement : priceElements)
		{
			System.out.println(priceElement.getText());
		}
		
		
	}

}
