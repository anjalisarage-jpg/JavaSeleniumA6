package org.automation.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	
	@DataProvider(name="invalidcreds")
	public String[][] invalidLogicreds() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
		System.out.println(rowCount);
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		String [] []creds= new String [rowCount][cellCount];
		
		for(int i= 1; i<=rowCount; i++) //(i=1 because in excel data start from 1 for row)
		{
			for(int j=0; j<cellCount; j++) //(j=0 because in excel data start from 0 for column)
			{
				creds [i-1][j] =sheet.getRow(i).getCell(j).toString();  //for store data into creds(position :0,0)
			}
			
		}
		return creds;		
	}
	@Test(dataProvider= "invalidcreds", dataProviderClass = org.automation.dataProvider.DataProvider2.class)
     public void invalidLogin(String email, String password) throws InterruptedException
     {
    	 WebDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		driver.get("https://demowebshop.tricentis.com/");
 		driver.findElement(By.linkText("Log in")).click();
 		Thread.sleep(500);
 		
 		driver.findElement(By.id("Email")).sendKeys(email);
 		Thread.sleep(500);
 		driver.findElement(By.id("Password")).sendKeys(password);
 		Thread.sleep(500);
 		driver.findElement(By.xpath("//input[@value='Log in']")).click();
 		Thread.sleep(1000);
 		driver.quit();
     }
     
}
