package ogr.automation.modularFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// created class to use utility
public class SelectUtility {

	// To select an option by its visible text below visible text passed during runtime of tc
	public void selectByVisibleTextMethod(WebElement DropdownElement, String visibletext) // pass into method to used further
	{
	Select sel=new Select(DropdownElement); // passed webelement which we have to handle in dropdown
	sel.selectByVisibleText(visibletext);
	}
	

}
