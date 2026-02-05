package org.capturingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebpage {
	
	public static void main(String[] args) throws IOException {
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yamaha-motor-india.com/");
	
	//step1: Downcasting coverted driver ref variable into TakesScreenshotType
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	//step2: Abstract method in TakesScreenshot<<I>> to get screenshot of webpage
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	//step3: FleHandler class copy sc from src to desc file
	File dest = new File("C:\\Users\\Aarushi\\Desktop\\Screenshots\\screenshot"+timestamp+".png");
	FileHandler.copy(src, dest);
	
	}

}
