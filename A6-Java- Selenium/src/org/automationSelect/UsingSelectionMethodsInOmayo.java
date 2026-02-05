package org.automationSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectionMethodsInOmayo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDownElement = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropDownElement);
		//Selecting an option based on tag text or visible text
		select.selectByVisibleText("doc 3");
		Thread.sleep(2000);
		//selecting an option based on value
		select.selectByValue("def");
		Thread.sleep(2000);
		//selecting an option based on index
		select.selectByIndex(4);
		
	}
}
