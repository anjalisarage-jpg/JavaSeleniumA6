package org.genericLib;

import static org.genericLib.FrameWorkConstants.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 * The class Flib is mainly used to interact with the File and fetch the Test data
 * needed for Automating Application
 * 
 * @author Aarushi
 */

public class Flib {
	/**
	 * This method accepts the key and it will fetch the value of the respective key
	 * in the given properties file
	 * @param key[String]
	 * @return value[String]
	 * 
	 */
	//created propPath variable to fetch data property file for both main and test resources
	public static String getPropertyValue(String propPath,String key)
	{
		File file= new File(propPath);
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop= new Properties();
		try {
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
		
	}
	
	/**
	 * This method accepts the sheetName, rowIndex, cellIndex to fetch a cell value
	 * from the given workbook
	 * 
	 * @param sheetName[String]
	 * @param rowIndex[int]
	 * @param cellIndex[int]
	 * @return[String]
	 */
	//created excelPath variable to fetch data excel file for both main and test resources
	public static String getWorkbookCellValue(String excelPath,String sheetName, int rowIndex, int cellIndex)
	{
		File file = new File(excelPath);
		FileInputStream fis= null;
		Workbook wb = null;
		try {
			fis= new FileInputStream(file);
     		wb= WorkbookFactory.create(fis);	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return value;
	}
	
 // read number type of data to read it creating method for phone and pincode
	//created excelPath variable to fetch data excel file for both main and test resources
	public static String getNumericCellValueMethod(String excelPath,String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis	=new FileInputStream(excelPath); //to read data from which file
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowNo);
	   Cell cell = row.getCell(cellNo);
	   
	 //here we are getting phone and pin in decimal but we want it in int 44057.0
	  double data = cell.getNumericCellValue();
	  
	  //hence we are converting data into inttype by typecast operator
	  int data1= (int) data;
	  //still as we have to send this data in sendkeys hence we want it in string format hence we are using method of String valueOf(int)
	  // to convert data1 into String format
	  //use wrapperclass valueof in string
	  String value = String.valueOf(data1);
	  return value; //return string value 
	}
	//want to access nsm of random class nextInt(origin,boundry)
	public static int generateRandomNo()
	{
		Random random = new Random();
	    int rn = random.nextInt(1000, 9999); // this will return 4 digit from origin to boundry uses nextInt(origin,boundry)
		return rn;
	}
}
