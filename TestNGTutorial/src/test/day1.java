package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("hello world");//automation
		
	}

}
