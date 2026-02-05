package org.automationMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aarushi/Downloads/DragDrop.html");
		WebElement osloDrag = driver.findElement(By.xpath("//div[text()='Oslo']"));
		WebElement norwayDrop = driver.findElement(By.id("box101"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(osloDrag, norwayDrop).perform();
		
		WebElement washingtonDrag = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement usDrop = driver.findElement(By.id("box103"));
		actions.dragAndDrop(washingtonDrag, usDrop).perform();
		
		WebElement stockholmDrag = driver.findElement(By.xpath("//div[text()='Stockholm']"));
		WebElement swedanDrop = driver.findElement(By.id("box102"));
		actions.dragAndDrop(stockholmDrag, swedanDrop).perform();
		
		WebElement copenhagenDrag = driver.findElement(By.xpath("//div[text()='Copenhagen']"));
		WebElement denmarkDrop=driver.findElement(By.id("box104"));
		actions.dragAndDrop(copenhagenDrag, denmarkDrop).perform();
		
	}

}
