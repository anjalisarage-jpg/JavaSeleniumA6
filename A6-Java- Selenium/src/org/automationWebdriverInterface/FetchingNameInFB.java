
package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingNameInFB {
	
	public static void main(String[] args) {
		
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	     WebElement facebookElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	   String facebookProduct = facebookElement.getText();
	   System.out.println(facebookProduct);
	 String faceBookTagname = facebookElement.getTagName();
	 System.out.println(faceBookTagname);
	}

}
