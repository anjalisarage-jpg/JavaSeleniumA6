package org.automationScrollingEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingInDemoQA {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement target1 = driver.findElement(By.id("draggable"));
		WebElement target2 = driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		
	//	actions.scrollToElement(target1).scrollByAmount(0, 300).pause(1000).perform();
		ScrollOrigin scrollorigin = ScrollOrigin.fromElement(target1);
		actions.scrollFromOrigin(scrollorigin, 0, 250).perform();

	

		
		
	
		
	}

}
