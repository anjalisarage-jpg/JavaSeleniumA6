package ogr.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingCartPage {
	
	//Declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartItem;
	
	@FindBy(name ="updatecart") private WebElement updateCartButtonItem;
	@FindBy(name = "continueshopping") private WebElement continueShoppingButton;
	@FindBy(id ="termsofservice") private WebElement termsofserviceCheckbox;
	@FindBy(id ="checkout") private WebElement checkoutButton;

	//initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getUpdateCartButtonItem() {
		return updateCartButtonItem;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsofserviceCheckbox() {
		return termsofserviceCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	//Operational method/ Business Logic to remove product from shopping cart and creating NSM
	
	public void removeSmartPhoneMethod() throws InterruptedException
	{
		smartPhoneCartItem.click(); //can access in same class as it is private
		Thread.sleep(500);
		updateCartButtonItem.click();
		
		
	}
	
	
}
