package ogr.automation.modularFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReference {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	loginLink.click();
	Thread.sleep(500);
	
	WebElement emailTB = driver.findElement(By.id("Email"));
	emailTB.sendKeys("GitaBai@gmail.com");
	Thread.sleep(500);
	
	WebElement passwordTB = driver.findElement(By.id("Password"));
	
	// To refresh the web page before storing webelement
	driver.navigate().refresh();
	
	//Because old address is used, we get 'StaleElementException'
	passwordTB.sendKeys("Gita@123");
	Thread.sleep(500);
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
	loginButton.click();
	
}	
	

}
