package org.automationMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement draggable = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		Actions actions =new Actions(driver);
		actions.dragAndDrop(draggable, droppable).perform();
	}

}
