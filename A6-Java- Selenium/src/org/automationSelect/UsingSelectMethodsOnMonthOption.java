package org.automationSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethodsOnMonthOption {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select select = new Select(monthDropdown);
		
		//fetching all the options of the month dropdown
		List<WebElement> allOptions = select.getOptions();
		
		//selecting all the options 1 by 1 using selectByvisibleText() in loop
		for(WebElement option: allOptions)
		{
			Thread.sleep(500);
			String text = option.getText();
			select.selectByVisibleText(text);
		}
	}

}
