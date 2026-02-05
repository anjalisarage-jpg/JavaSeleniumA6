package org.parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Virat 
{
	
   @Test
   public void launchWiki()
   {

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Virat_Kohli");

}
}