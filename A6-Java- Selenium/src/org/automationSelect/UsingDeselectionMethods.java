package org.automationSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectionMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(dropdown);
		
		if(select.isMultiple())
			System.out.println("It is multiselect-dropdown");
		else
			System.out.println("It is multiselect-dropdown");
		
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option: allOptions)
		{
			String text = option.getText();
			select.selectByVisibleText(text);
		}
		
		Thread.sleep(2000);
		
		//deselect an option based on index
		select.deselectByIndex(1);
		Thread.sleep(2000);
		
		//deselect an option based on visible text
		select.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		//select an option based on index
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		//deselect an option based on value
		select.deselectByValue("volvox");
		Thread.sleep(2000);
		
		//deselecting all options
		select.deselectAll();
		Thread.sleep(2000);
		
		
	}

}
