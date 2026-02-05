package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
    // Declaration all common things in application or webelements
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath ="//span[text()='Shopping cart']") private WebElement shoppingCartLink;
	@FindBy(xpath="//span[text()='Wishlist']") private WebElement wishlistLink;
	@FindBy(partialLinkText="BOOKS") private WebElement booksLink;
	@FindBy(partialLinkText="COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLink;
	@FindBy(linkText ="Log out") private WebElement logoutLink;
	
	//Initialization driver is use to launch chrome browser and pageFactory class use 
	//same browser session connect webelemnts to browser and which is passed from tc and delclared in Basetest
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization or Getters
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public void setComputersLink(WebElement computersLink) {
		this.computersLink = computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	

	
}
