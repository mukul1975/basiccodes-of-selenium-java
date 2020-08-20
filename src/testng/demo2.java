package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo2 {
	
	@Test
	public void three()
	{
		System.out.println("threeone");
	}
	
	@Test(groups= {"Black"})
	public void threetwo()
	{
		System.out.println("ThreeTwo");
	}
	@BeforeSuite
	public void hh()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void hk()
	{
		System.out.println("After Suite");
	}


}
