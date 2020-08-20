package Roza;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().deleteAllCookies();
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> footer1=footer.findElements(By.tagName("a"));
		driver.findElement(By.xpath("//input[@class='radioButton']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Saiful Alam Khan");
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		sc.selectByIndex(1);
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		driver.findElement(By.id("openwindow")).click();
		Set<String>win1=driver.getWindowHandles();
		Iterator<String>it=win1.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		
//		driver.close();
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.xpath("//fieldset[@class='pull-right']//input[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();

//		for (int i=1; i<footer1.size();i++)
//		{
//			String context=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			footer1.get(i).sendKeys(context);
//		}
		
//		int i=1;
//		while(i<footer1.size())
//		{
//			
//			String context=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			footer1.get(i).sendKeys(context);	
//			i++;
//		}
//		
//		Set<String>win=driver.getWindowHandles();
//		Iterator<String>its=win.iterator();
//		
//		while(its.hasNext())
//		{
//			driver.switchTo().window(its.next());
//			System.out.println(driver.getTitle());
//		}
//		driver.quit();
		
	}
		}
		
	


