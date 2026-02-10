package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(org.genericLib.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest {
	
	@Test
	public void addToCartMethod()
	{
		BasePage bp = new BasePage(driver);
	//	bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesClick().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		//to verify message on adding cart
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product is not added to cart ||");
		
		sa.assertAll();
	}

}
