package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(org.genericLib.MyListener.class)
public class TC_RemoveProductFromCart_002_Test extends BaseTest {

	@Test
	public void removeProductFromCartmethod() throws InterruptedException
	{
		//(Logic for adding product)
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesClick().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		//to verify message on adding cart uses SoftAssert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product is not added to cart ||");
		
		bp.getShoppingCartLink().click();
		
		//calling method which is created to remove product from add to cart from ShoppingCartPage
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.removeSmartPhoneMethod();
		
		//took try and catch to avoid NosuchElement exception
		try {
			if(scp.getSmartPhoneCartItem().isDisplayed()) {
		    Reporter.log("Product is not removed from cart"); //taking if else because we were getting exception
	        
			}
		}
		catch(Exception e)
		{
			Reporter.log("Product is removed from cart ||",true);
		}
		
		// Assert all at the end If any soft assertions fail, assertAll() will throw an AssertionError and fail the test
		
		sa.assertAll();
}
}
