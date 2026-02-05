package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAnElementIsSelectedOrNot {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement penCheckBox = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
		WebElement bookCheckBox = driver.findElement(By.xpath("//input[@value='Book']"));
		System.out.println(penCheckBox.isSelected()?
				"pen checkbox is selected" : "pen checkbox is not selected ");
		
		System.out.println(bookCheckBox.isSelected()?
				"book checkbox is selected" : "book checkbox is not selected ");	
	}

}
