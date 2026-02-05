package org.ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
  @Test
  public void testCase1() {
	  Reporter.log("This is @Test method 1", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is @BeforeMethod ", true);
  }
  
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is @BeforeClass ", true);
  }
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("This is @BeforeTest method", true);
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is @BeforeSuite method ", true);
  }
  
  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is @AfterSuite method ", true);
  }
  
  @Test
  public void testCase2() {
	  Reporter.log("This is @Test method 2", true);
  }
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("This is @AfterTest method ", true);
  }
  
  @AfterClass
  public void afterClass() {
	  Reporter.log("This is @Afterclass method ", true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is @AfterMethod method ", true);
  }
  
  @Test
  public void testCase3() {
	  Reporter.log("This is @Test method 3", true);
  }
  
  
}
