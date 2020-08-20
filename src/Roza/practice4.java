package Roza;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
//		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.spicejet.com/"));
		
//		driver.manage().timeouts().implicitlyWait(TimeUnit,20);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.xpath("//a[@text='Bhopal (BHO)']")).click();
		driver.findElement(By.xpath("(//a[@text='Jaipur (JAI)'] )[2]")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")).getText().contains("September 2020"))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".ui-state-default"));
		
		for(int i=0; i<dates.size();i++)
		{
			String date=driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(date.contains("25"))
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//div[@class='picker-second']//button[@class='ui-datepicker-trigger']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div[@class='ui-datepicker-title']")).getText().contains("January 2021"))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> Rdates=driver.findElements(By.cssSelector(".ui-state-default"));
		
		for(int i=0;i<Rdates.size();i++)
		{
			String Rdate=driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			
			if(Rdate.contains("22"))
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		
		Select Asc=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		Asc.selectByVisibleText("2");
		Select Csc=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Child']")));
		Csc.selectByVisibleText("2");
		Select Fsc=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Infant']")));
		Fsc.selectByVisibleText("1");
		Select Inrsc=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
		Inrsc.selectByVisibleText("USD");
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_StudentDiscount']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
		
		

	}

}
