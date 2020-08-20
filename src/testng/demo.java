package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class demo {
	@Parameters({"user"})
	@Test (groups= {"Black"})
	public void durasa2(String pa)
	{
		System.out.println(pa);
	}
	@Test
	public void durasa3()
	{
		System.out.println("Vorosa");
	}
	
	@Test
	public void ad()
	{
		System.out.println("ad");
	}

}
