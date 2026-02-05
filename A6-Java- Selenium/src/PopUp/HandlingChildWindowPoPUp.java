package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPoPUp {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//fetching parent windowId
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		//fetching all the window ids
		Set<String> allWindowIds = driver.getWindowHandles();
		//removing parent windowId from all windowIds
		//so only child window id will be available in the set
		allWindowIds.remove(parentWindowId);
		for(String childWindowId : allWindowIds)
		{
			driver.switchTo().window(childWindowId);
		}
		driver.findElement(By.id("nextStep")).click();
	}

}
