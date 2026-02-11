package org.testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.genericLib.BaseTest;
import org.genericLib.Flib;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.CheckoutPage;
import org.pomRepository.CompletedPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListener.class)
public class TC_BuyProduct_003_Test extends BaseTest {
	
	@Test
	public void buyProductMethod() throws EncryptedDocumentException, IOException
	{
		BasePage bp = new BasePage(driver);
		
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesClick().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		//to verify message on adding cart
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product is not added to cart ||");
		
		bp.getShoppingCartLink().click();
		
	    ShoppingCartPage scp = new  ShoppingCartPage(driver);
	    scp.getSmartPhoneCartItem().click();
        scp.getTermsofserviceCheckbox().click();
	    scp.getCheckoutButton().click();
	    
	    // to read data from file using generic method
	   String city = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 0);
	  String address1 = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 1);
	  
	// String pinCode = Flib.getWorkbookCellValue("buyproductcreds", 1, 2);
	// String contact = Flib.getWorkbookCellValue("buyproductcreds", 1, 3);
	  //here we will get decimal values for pin and contact
	//  System.out.println(pinCode);
	//	 System.out.println(contact );
	  
	  
	 String pinCode = Flib.getNumericCellValueMethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 2);
	String contact = Flib.getNumericCellValueMethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 3);
	
	 // return from Flib method used here
	int rn = Flib.generateRandomNo();
	String phoneNo = contact+rn; //(string+int)
	
	 //in excel we can store string,int,boolean,type of data
	// System.out.println(pinCode);
	// System.out.println(phoneNo );
	 
	CheckoutPage cop = new CheckoutPage(driver);
	cop.buyProduct(city, address1, pinCode, phoneNo);
	
	CompletedPage comp = new CompletedPage(driver);
	sa.assertEquals(comp.getorderPlacedMsg().isDisplayed(), true, "Order is not processed||");
	
	sa.assertAll();
	
	}

}
