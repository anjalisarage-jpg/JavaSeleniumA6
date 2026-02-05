package org.automation.javascriptcodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingClickandSendkeysActionsUsingJS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		WebElement radioButton = driver.findElement(By.id("radio1"));
		WebElement disabledTextBox = driver.findElement(By.id("tb2"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",radioButton);
		jse.executeScript("arguments[0].click()",radioButton );
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value= 'Anjali'", disabledTextBox);
	}
}
