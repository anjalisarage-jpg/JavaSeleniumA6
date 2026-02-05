package org.automationMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerormingMouseHoverEventInDWS {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronicsLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
		
		Actions actions= new Actions(driver);
		
		actions.moveToElement(electronicsLink).perform();
		Thread.sleep(2000);
		
		//actions.moveToLocation(450, 200).perform();
		//actions.moveByOffset(455-585, 201-202).perform();
		actions.moveByOffset(-130, -1).perform();
		
		
		
	}

}
