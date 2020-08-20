package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@Test(dataProvider="getdata")
	public void input(String text,String text1,String text2,String text3)
	{
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][4];
		data[0][0]="MUKUL";
		data[0][1]="ROSY";
		data[0][2]="RUPA";
		data[0][3]="SHILA";
		
		data[1][0]="MOKSUDAR";
		data[1][1]="ROKEYA";
		data[1][2]="ROZA";
		data[1][3]="ROHA";
		
		data[2][0]="Hazzaz";
		data[2][1]="MOKSUDA";
		data[2][2]="SAIFUL";
		data[2][3]="KAMRUN";
		return data;
	}

}
