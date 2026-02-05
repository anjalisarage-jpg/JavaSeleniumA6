package ogr.automation.modularFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void browserSetUp()
	{
	String browserValue = Flib.getPropertyValue("chrome");
    String url = Flib.getPropertyValue("url");
    
    if(browserValue.equalsIgnoreCase("chrome")) 
    {
    	driver= new ChromeDriver();
    }
    else if(browserValue.equalsIgnoreCase("firefox"))
    {
    	driver= new FirefoxDriver();
    }
    else
    {
    	driver= new EdgeDriver();
    }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login()
	{
		String email= Flib.getPropertyValue("email");
		String password= Flib.getPropertyValue("password");
		
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();  //bp.getLoginLink() return webelement selenium uses same same driver and browser perform click action
		
		LoginPage lp = new LoginPage(driver);
		lp.getLoginEmailTB().sendKeys(email);
		lp.getLoginPasswordTB().sendKeys(password);
		lp.getLoginButton().click();
		
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.id("Email")).sendKeys(email);
		//driver.findElement(By.id("Password")).sendKeys(password);
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void logout()
	{
		
		
	   BasePage bp = new BasePage(driver);
	   
	   bp.getLogoutLink().click();
		//driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
	}
}
