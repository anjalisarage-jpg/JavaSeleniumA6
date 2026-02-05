package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sundeep {
	@Test(groups = {"Karnataka","Telgu","Tamil"})
	public void launchSundeep()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sundeep_Kishan");
		Reporter.log("launching Sundeep Page", true);
	}
}
