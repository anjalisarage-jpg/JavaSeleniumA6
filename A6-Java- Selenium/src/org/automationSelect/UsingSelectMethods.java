package org.automationSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
	    WebElement dayDropDown = driver.findElement(By.id("day"));
	   Select select = new Select(dayDropDown);
	   
	   //verifying date drop down is single-select or multi-select
	   if(select.isMultiple())
		   System.out.println("Multi- select dropdown");
	   else
		   System.out.println("Single- select dropdown");
	   
	   //fetching all the options of the date dropdown
	  List<WebElement> allOptions = select.getOptions();
	  
	  //selecting all the options 1 by 1 using selectByIndex() in loop
	  for(int index = 0; index< allOptions.size(); index++)
	  {
		  Thread.sleep(250);
		  select.selectByIndex(index);
	  }
	
	}

}
