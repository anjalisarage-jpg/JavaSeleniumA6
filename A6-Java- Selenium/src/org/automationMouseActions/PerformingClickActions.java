package org.automationMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickActions {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		WebElement button = driver.findElement(By.xpath("//button[@class='No thanks']"));
		
	//	button.click();  //click() from WebElement
		
		Actions actions = new Actions(driver);
		
		//actions.click(button).perform(); //click(WebElement) from Actions
		actions.moveToElement(button).click().perform(); //click() from Actions
		
		
	}

}
