package org.automationlocatorstatergies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingLinksCountInDWS {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// if href attribute present in <a> tag then its is considered as link
		
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		System.out.println(links.size());
		
	}

	
	}


