package org.automation.basics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;

public class LaunchingAllBrowsers {
	public static void main(String[] args) {
		
		WebDriver driver;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the browser name that you want to launch: ");
		String browserName=scanner.next();
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		} else {
			System.setErr(null);
		}
	}
	
}
