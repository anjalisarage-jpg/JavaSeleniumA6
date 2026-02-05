package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTheSizeAndLocationInFB {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	     //fetching size of emailTextBox
		WebElement emailTextBox = driver.findElement(By.id("email"));
		Dimension emailTextBoxSize = emailTextBox.getSize();
		//System.out.println("EmailTBSize: "+emailTextBoxSize);
		//System.out.println("EmailTBHeight: "+emailTextBoxSize.getHeight());
		//System.out.println("EmailTBWidth: "+emailTextBoxSize.getWidth());
		
		//fetching size of passwordTextBox
		WebElement passwordTextbox = driver.findElement(By.id("passContainer"));
		//Dimension passwordTextBoxSize = passwordTextbox.getSize();
		//System.out.println("PasswordTBSize:"+passwordTextBoxSize);
		//System.out.println("PasswordTBHeight:"+passwordTextBoxSize.getHeight());
		//System.out.println("PasswordTBWidth:"+passwordTextBoxSize.getWidth());
		
		//fetching size using rect method
		Rectangle emailTextDO = emailTextBox.getRect();
		System.out.println("EmailTextBoxHeight:"+emailTextDO.getHeight());
		System.out.println("EmailTextBoxWidth:"+emailTextDO.getWidth());
		System.out.println("EmailTextBoxXaxis:"+emailTextDO.getX());
		System.out.println("EmailTextBoxYaxis:"+emailTextDO.getY());
		Dimension emailTextDOR = emailTextDO.getDimension();
		System.out.println("DimensionOfETB: "+emailTextDOR);
		Point emailTextPOR = emailTextDO.getPoint();
		System.out.println("PointOfETB:"+emailTextPOR);
		
		//fetching location using rect method
		Rectangle passwordTextboxDO = passwordTextbox.getRect();
		System.out.println("PasswordTextBoxHeight:"+passwordTextboxDO.getHeight());
		System.out.println("PasswordTextBoxWidth:"+passwordTextboxDO.getWidth());
		System.out.println("PasswordTextBoxXaxis:"+passwordTextboxDO.getX());
		System.out.println("PasswordTextBoxYaxis:"+passwordTextboxDO.getY());
		Dimension passwordTextboxDOR = passwordTextboxDO.getDimension();
		System.out.println("DimentionOfPTB:"+passwordTextboxDOR);
		Point passwordTextboxPOR = passwordTextboxDO.getPoint();
		System.out.println("PointOfETB"+passwordTextboxPOR);
	}

}
