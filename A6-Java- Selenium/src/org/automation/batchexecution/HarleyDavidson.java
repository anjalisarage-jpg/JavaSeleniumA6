package org.automation.batchexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HarleyDavidson {

	@Test
	public void launchingHarley()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://harley-davidson-uae.com/");
		Reporter.log("Launching Harley", true);
	}
}
