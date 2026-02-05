package PopUp;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDynamicXpath {
	
	public static void main(String[] args) {
		 
    LocalDateTime ldt = LocalDateTime.now();
    int date = ldt.getDayOfMonth(); //getDayMonth give dates
  
    String monthTemp = ldt.getMonth().toString(); //getMonth give 1to 12 but as calling tostring method will get DECEMBER
    
    //System.out.println(monthTemp); //DECEMBER 
    //Customized DECEMBER as per webpage December which give charAt(0)=D and substring other letter,lowercase will give all other letters in lowercase
   String month = monthTemp.charAt(0)+monthTemp.substring(1).toLowerCase();
   
   //WebDriver driver= new ChromeDriver();
   //driver.manage().window().maximize();
  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 //  driver.get("https://www.redbus.com/");
  // driver.findElement(By.id("date-box")).click();
   //driver.findElement(By.xpath("//div[text()='December']/../..//span[text()='24']"));
   
   //dynamic xpath(created month and date variable for date and month)
	System.out.println("//div[text()='"+month+"']/../..//span[text()='"+date+"']");	

	}
	

}
