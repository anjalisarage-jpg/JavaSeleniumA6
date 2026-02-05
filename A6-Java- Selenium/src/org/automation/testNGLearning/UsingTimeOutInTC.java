package org.automation.testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTimeOutInTC 
{
	@Test(timeOut= 5000)
	public void launchTrimphTiger()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcycles.in/motorcycles/adventures/tiger");
		
	}

}
