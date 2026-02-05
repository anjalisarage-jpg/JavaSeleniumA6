package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
		@FindBy(id= "Email") private WebElement loginEmailTB;
		@FindBy(id= "Password") private WebElement loginPasswordTB;
		@FindBy(id= "RememberMe") private WebElement rememberMeCheckbox;
		@FindBy(linkText= "Forgot password?") private WebElement forgotPasswordLink;
		@FindBy(xpath= "//input[@value='Log in']") private WebElement loginButton;	
		
		//Initialization(took constructor)
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getLoginEmailTB() {
			return loginEmailTB;
		}

		public WebElement getLoginPasswordTB() {
			return loginPasswordTB;
		}

		public WebElement getRememberMeCheckbox() {
			return rememberMeCheckbox;
		}

		public WebElement getForgotPasswordLink() {
			return forgotPasswordLink;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		
}
