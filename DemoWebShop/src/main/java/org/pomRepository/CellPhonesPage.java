package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
	
	@FindBy(xpath= "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement cellPhoneAddToCartButton;
	
	@FindBy(xpath ="//p[contains(text(),'The product has been added to your ')]")
	private WebElement productAddedToCartMsg;

	//initialization
	public CellPhonesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCellPhoneAddToCartButton() {
		return cellPhoneAddToCartButton;
	}

	public WebElement getProductAddedToCartMsg() {
		return productAddedToCartMsg;
	}
	

	
}
