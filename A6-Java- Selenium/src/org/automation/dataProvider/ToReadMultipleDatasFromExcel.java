package org.automation.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
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
	for(String[] arr :creds)  //used to fetch 1 array from creds)
	{
		for(String data : arr) //used to fetch 1 data from array)
		{
			System.out.print(data+" ,");
		}
		System.out.println();
	}
	
	}

}
