package org.automationassignments;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			String expectedUrl= "https://www.suzukimotorcycle.co.in/";
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yamaha-motor-india.com/");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.suzukimotorcycle.co.in/");
		    driver.switchTo().newWindow(WindowType.WINDOW);
		    driver.get("https://www.java.com/en/");
		    
		    // capturing Window Id or handle's of all the tabs
		    
		    Set<String> allWindowIds=driver.getWindowHandles();
		    for(String windowId : allWindowIds)
		    {
		    	driver.switchTo().window(windowId);
		    	Thread.sleep(2000);
		    	String actualUrl = driver.getCurrentUrl();
		    	//condition to break loop and stop switching
		    	if(expectedUrl.equals(actualUrl))
	             {
		    		 driver.close();
	            	 break;
		    		//System.out.println("open the window");
	             }
		    	else
		    	{
		    		driver.close();
		    	}
		}
		

	}


}
