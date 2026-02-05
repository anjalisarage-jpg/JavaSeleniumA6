package org.automation.testNGLearning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test()
	{
		Reporter.log("test case 1 executed", true);
	}
	
	@Test
	public void m1()
	{
	  Reporter.log("test case 2 executed", true);
	}
	
	@Test
	public void method1()
	{
		Reporter.log("test case 3 executed", true);
	}

}
