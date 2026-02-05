package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPromptAlertInDemoQA {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement button = driver.findElement(By.id("promtButton"));
		Actions actions= new Actions(driver);
		actions.scrollToElement(button).scrollByAmount(0, 200).perform();
		button.click();
		Alert alert= driver.switchTo().alert();
		
		System.out.println("Alert Message: "+alert.getText());
		alert.sendKeys("Chandrashekhar");
		alert.accept(); //OK
		//alert.dismiss(); //Cancel
	}

}
