package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnLogicalAndandOr {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aarushi/Downloads/XpathLogicalAnd%20(1).html");
		//locating element using xpath by logical or
		WebElement firstNameTextBox = driver.findElement(By.xpath("//input[contains(@id,'f-name') or contains(@name,'first')]"));
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys("Anjali");
		//locating element using xpath by logical and
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='F' and @name='gender']"));
		femaleRadioButton.click();
		
		
		
	}

}
