package Roza;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	
	
	@DataProvider
	public Object[][] takedata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Moksudar";
		data[0][1]="Moksudar1";
		data[1][0]="Rokeya";
		data[1][1]="Rokeya1";
		return data;
	}
	@Test(dataProvider="takedata")
	public void ami(String text,String text1)
	{
		System.out.println(text);
		System.out.println(text1);
	}
	

}
