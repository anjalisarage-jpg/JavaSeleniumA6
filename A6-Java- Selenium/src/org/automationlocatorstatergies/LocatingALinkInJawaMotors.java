package org.automationlocatorstatergies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingALinkInJawaMotors {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/");
		driver.findElement(By.linkText("Service")).click();
		driver.findElement(By.linkText("Yezdi Motorcycles")).click();
	}

}
