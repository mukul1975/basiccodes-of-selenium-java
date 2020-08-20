package Roza;



import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshot2 extends screenshot1{

	@Test
	public void cleartrip() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:\\cleartrip.com");
		takescreenshot(driver);
		
		
		
	


}
}