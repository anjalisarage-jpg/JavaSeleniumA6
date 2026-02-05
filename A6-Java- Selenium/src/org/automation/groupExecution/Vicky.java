package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vicky {
	@Test(groups = "Bollywood")
	public void launchVicky()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Vicky_Kaushal");
		Reporter.log("launching Vicky Page", true);
	}
}
