package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysToPerformLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.sendKeys("anjali.sarage@gmail.com",Keys.TAB,"Rewati@123",Keys.ENTER);
		
	}

}
