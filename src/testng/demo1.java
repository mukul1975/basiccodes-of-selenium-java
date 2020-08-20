package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test
	public void durasa()
	{
		System.out.println("nirasa");
	}
	@Test(dependsOnMethods= {"durasa","durasa3"})
	public void durasa1()
	{
		System.out.println("Durasa");
	}
	@AfterTest
	public void gg()
	{
		System.out.println("After Test");
	}

}
