package Roza;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		

		while (!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("September"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();
		}

		
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();	
			
		if(text.equalsIgnoreCase("17"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
		}
		
		
		
		

	}

}
