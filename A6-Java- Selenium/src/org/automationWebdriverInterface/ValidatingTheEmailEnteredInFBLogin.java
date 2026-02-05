package org.automationWebdriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnteredInFBLogin {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String email= "anjali.sarage@facebook.com";
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.clear();
		
		//fetching class attribute value
		System.out.println(emailTextBox.getAttribute("class"));
		emailTextBox.sendKeys(email);
		
		//fetching the value attribute's value for validation
		String enteredEmail = emailTextBox.getAttribute("value");
		if(email.equals(enteredEmail))
			System.out.println("email has been successfully entered");
		else
			System.out.println("email has not been entered");
	}

}
