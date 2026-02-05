package Stayvista;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.stayvista.com/");
		WebElement popUp = driver.findElement(By.id("secondaryButton"));
		popUp.click();
		Thread.sleep(20000);
	  WebElement frameElement = driver.findElement(By.id("wiz-iframe-intent"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//img[@alt=\"close-btn\"]")).click();
	
	Actions action= new Actions(driver);
	WebElement holiday = driver.findElement(By.xpath("//span[text()='Holiday Getaways']"));
	action.moveToElement(holiday).scrollByAmount(0, 400);

	}

}
