package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class four {
	@Parameters({"user1"})
	@Test
	public void fourone(String as)
	{
		System.out.println(as);
	}
	@Parameters({"user"})
	@Test(groups= {"Black"})
	public void fourtwo(String pp)
	{
		System.out.println(pp);
	}
	
	@BeforeTest
	public void da()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void tt()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void tr()
	{
		System.out.println("After class");
	}


}
