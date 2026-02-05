package ogr.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletedPage {

	
	//Declaration
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement orderPlacedMsg;
	
	//initialization
	public CompletedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getorderPlacedMsg()
	{
		return orderPlacedMsg;
	}

}