package S1Mock;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("file:///C:/Users/Aarushi/Downloads/Assign%20(1).html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String actualUrl = "https://www.swiggy.com/";
		
		Set<String> allTabs = driver.getWindowHandles();
		
		for(String WindowId:allTabs)
		{
			driver.switchTo().window(WindowId);
			String currentUrl = driver.getCurrentUrl();
			

			if( actualUrl.equals(currentUrl))
			{
				
				driver.manage().window().maximize();
				Thread.sleep(5000);			
				driver.close();
				break;
			}
			
		}
	}

}
