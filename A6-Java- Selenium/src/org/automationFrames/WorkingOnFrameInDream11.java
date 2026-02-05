
package org.automationFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFrameInDream11 {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		
		//1.Using frame(int index)
		//driver.switchTo().frame(0);
		
		//2.Using frame(String nameOrId)
		//driver.switchTo().frame("send-sms-iframe");
		
		//3.Using frame(WebElement frameElement)
		WebElement frameElement = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("regEmail")).sendKeys("9657722407");
		driver.findElement(By.linkText("GET APP LINK")).click();
		
		//4. defaultContent(); main page
		//used to bring control back to main page or default content
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
		
	}
	
	

}
