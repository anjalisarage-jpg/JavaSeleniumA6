package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByText {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		WebElement emailLabel=driver.findElement(By.xpath("//label[text()='Email:']"));
		String text=emailLabel.getText();
		System.out.println(text);
		
	}

}
