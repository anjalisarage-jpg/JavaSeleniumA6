package org.automationlocatorstatergies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingListOfStaticDropDownInDWS {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		List<WebElement> listOfStaticDropDownElements = driver.findElements(By.xpath("//select"));
		System.out.println(listOfStaticDropDownElements.size());
	}

}
