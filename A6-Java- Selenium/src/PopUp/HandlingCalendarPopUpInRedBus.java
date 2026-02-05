package PopUp;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarPopUpInRedBus {
	
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String monthtemp = ldt.getMonth().toString(); //ex: DECEMBER
		String month = monthtemp.charAt(0)+monthtemp.substring(1).toLowerCase(); //ex: December
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("date-box")).click();
		driver.findElement
		(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+date+"']")).click();
		driver.findElement(By.id("return-box")).click();
		driver.findElement
		(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+(date+1)+"']")).click();
	}

}
