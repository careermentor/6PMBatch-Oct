package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario11 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		Assert.assertEquals("Hello", "Hello World");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(groups="Smoke")
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(groups="Sanity")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test(groups={"Sanity","Regression"})
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	@Test
	public void seventh_testcase()
	{
		System.out.println("this is seventh test case");
	}
}
