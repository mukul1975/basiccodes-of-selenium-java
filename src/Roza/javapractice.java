package Roza;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.impl.client.AIMDBackoffManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class javapractice {
	
	//input[Qname='pass']
			//*[@name='pass']
			//input[contains(@name,'pass')]
			//input[text()='khn']
			/*
			 * #id
			 * .class
			 * input[name='pass']
			 * *[name='pass']
			 * [name*='pass']
			 * [name='pass']
			 * Select sc=new Select(driver.findelement(by.xpath(""));
			 * sc.select by id();
			 * sc.selectByvisibaletext("jhjhjh");
			 * sc.selectbyvalue(87)
			 * 
			 * driver.manage().timeouts().implicitelywait(5,timeunit.second);
			 * WebDriverWait w=new WebDriverWait(driver,5);
			 * w.untils(ExpectedConditions.visibilyOfElementLocated(by.xpath))
			 * 
			 * Actions ac=new Actions(driver);
			 * ac.movetoelement(driver.findelement(by.xpath(""))).build().perform();
			 * 
			 * Set<String>win=driver.getWindowhandles();
			 * Iterator <String>it=win.Iterator();
			 * String Home=it.next();
			 * String login=it.next();
			 * driver.switchto().Window(login);
			 * driver.switchto().window(Home);
			 * 
			 * driver.Switchto().frame(driver.findelement(by.xpath("")));
			 * driver.SwitchTo().frame by index();
			 * driver.switchTo().frame by Id();
			 * driver.SwitchTo().defaultcontent();
			 * 
			 * 
			 * TakesScreenshot ts=((TakesScreenshot)driver);
			 * File src=ts.getScreenshotAs(OutputType.File);
			 * FileUtils.copyfile(src.newFile("D://screen.png"));
			 * 
			 * 
			 * 
			 * 
			 */
	
	
	
		
	
	
	
		
	public static void main(String[] args)    {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<link.size();i++)
		{
			String linkname=link.get(i).getText();
			System.out.println(linkname);
		}
		
		
		
		}
	
		}
		
			
	
	
	

