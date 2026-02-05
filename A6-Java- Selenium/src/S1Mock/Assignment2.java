package S1Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 17");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath
	    ("//span[contains(text(),'iPhone 17 Pro 256 GB') and contains(text(), 'Silver')]/../../../..//button[@aria-label='Add to cart']")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
		WebElement priceElement = driver.findElement
	    (By.xpath("//span[contains(@class,'a-price a-')]"));
		String price = priceElement.getText();
		System.out.println("Price: "+price);
	}
}
