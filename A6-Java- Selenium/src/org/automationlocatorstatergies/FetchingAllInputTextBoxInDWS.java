package org.automationlocatorstatergies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAllInputTextBoxInDWS {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		List<WebElement> allInputTextBoxElements = driver.findElements(By.xpath
				("//input[@type='password' or @type='text']"));
		System.out.println(allInputTextBoxElements.size());
	}

}
