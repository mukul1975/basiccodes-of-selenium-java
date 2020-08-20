package Roza;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public WebDriver driver;
	public void aha() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		
	}
	
	public void screenshot(String name) throws Exception
	{
		TakesScreenshot tsh=((TakesScreenshot)driver);
		File src=tsh.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshot"+name+".png"));
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		screenShot pp=new screenShot();
		pp.aha();
		pp.screenshot("ami1");
		pp.screenshot("ami2");
		
		
	
}
}