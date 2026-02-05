package ogr.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	//Declaration
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhonesClick;
	@FindBy(partialLinkText = "Camera, photo") private WebElement cameraPhotoClick;
	
	// initialization
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCellPhonesClick() {
		return cellPhonesClick;
	}

	public WebElement getCameraPhotoClick() {
		return cameraPhotoClick;
	}


	
}
