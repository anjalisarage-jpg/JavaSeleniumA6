package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//Declaration
	@FindBy(id= "gender-male") private WebElement maleRadioButton;
	@FindBy(id= "gender-female") private WebElement femaleRadioButton;
	@FindBy(id= "FirstName") private WebElement FirstNameTB;
	@FindBy(id= "LastName") private WebElement LastNameTB;
	@FindBy(id= "Email") private WebElement EmailTB;
	@FindBy(id= "Password") private WebElement PasswordTB;
	@FindBy(id= "ConfirmPassword") private WebElement ConfirmPasswordTB;
	@FindBy(id= "register-button") private WebElement registerbuttonLink;
	
	//Initialization
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getEmailTB() {
		return EmailTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getConfirmPasswordTB() {
		return ConfirmPasswordTB;
	}

	public WebElement getRegisterbuttonLink() {
		return registerbuttonLink;
	}
	

	
}
