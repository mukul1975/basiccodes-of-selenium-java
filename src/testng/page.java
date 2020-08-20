package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class page {
	
	@Parameters({"user"})
	@Test
	public void facebook(String text) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(text);
	}
	@Parameters({"user"})
	@Test
	public void vv(String text)
	{
		page ff=new page();
		ff.facebook(text);
		
	}
	
	

}
