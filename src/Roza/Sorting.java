package Roza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> Rawcount=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String>orginalList=new ArrayList<String>();
		for(int i=0; i<Rawcount.size(); i++)
		{
			orginalList.add(Rawcount.get(i).getText());
		}
		
		ArrayList<String>copiedList=new ArrayList<String>();
		for(int i=0;i<orginalList.size();i++)
		{
			copiedList.add(orginalList.get(i));
		}
		Collections.sort(copiedList);
//		Assert.assertTrue(orginalList.equals(orginalList));
		
	}
	

}
