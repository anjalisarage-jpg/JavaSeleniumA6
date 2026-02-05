package Stayvista;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.stayvista.com/");
		
	    driver.findElement(By.xpath("//span[text()='Explore']")).click();
	   driver.findElement(By.xpath("//p[text()='Travel Guide']")).click();  
	  // driver.navigate().refresh();
	   driver.findElement(By.xpath("//div[text()='Goa']")).click();
	   // driver.navigate().refresh();
	 // driver.findElement(By.xpath("//h1[text()='Places to Explore in Goa']")).getText();
	 // driver.navigate().refresh();
	  String homeText = driver.findElement(By.xpath("//div[text()='Home']")).getText();
	  System.out.println(homeText);
	   WebElement northGoaText = driver.findElement(By.xpath("//h3[text()='North goa']"));
	  Actions action = new Actions(driver);
	  action.scrollToElement(northGoaText).scrollByAmount(0, 300).perform();
	 String text = driver.findElement(By.xpath("//h3[text()='North goa']")).getText();
	 System.out.println(text);
	}

}
