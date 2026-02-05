package org.automation.KeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		Thread.sleep(2000);
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		
		Actions actions=new Actions(driver);
		actions.sendKeys(usernameTextBox, "Admin").sendKeys(passwordTextBox, "admin123").keyDown(Keys.ENTER)
		.perform();
		
	//	actions.moveToElement(usernameTextBox).sendKeys("Admin").
	//	moveToElement(passwordTextBox).click().sendKeys("admin123").keyDown(Keys.ENTER).perform();
		
	}

}
