package demoTest;

import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;

public class Samplemethod extends BaseClass_Utilities {
	@Test
	public void method1()
	{
	System.out.println("method1");	
	}
	
	@Test(groups="smoke")
	public void method2()
	{
		System.out.println("method 2");
	}
	
	@Test(groups="smoke")
	public void method3()
	{
		System.out.println("Smoke Method");
	}
}
