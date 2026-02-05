package org.automation.assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert {
	
	@Test
	public void validLogin() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedWelcomepageTitle = "Demo Web Shop";
		String expectedLoginpageTitle = "Demo Web Shop. Login";
		
		Assert.assertEquals(driver.getTitle(),expectedWelcomepageTitle, "Welcome Page is not displayed ||");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		
		Assert.assertEquals(driver.getTitle(), expectedLoginpageTitle, "Login Page is not displayed ||");
		
		driver.findElement(By.id("Email")).sendKeys("GitaBai@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys("Gita@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		driver.quit();
	}

}
