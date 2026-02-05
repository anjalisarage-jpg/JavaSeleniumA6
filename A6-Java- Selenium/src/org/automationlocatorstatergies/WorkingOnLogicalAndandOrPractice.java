package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnLogicalAndandOrPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aarushi/Downloads/XpathLogicalAnd%20(1).html");
		//Using LogicalOr
		WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='l-name' or @name='last']"));
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys("Dharaskar");
		//Using LogicalAnd
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='M' and @name='gender']"));
		maleRadioButton.click();
		
		
	}

}
