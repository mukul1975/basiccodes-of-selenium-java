package Roza;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		if(driver.getTitle().contains("Practice Page"))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertFalse(false);
//		}
//		driver.findElement(By.xpath("//input[@value='radio1']")).click();
//		driver.findElement(By.xpath("//input[@value='radio1']")).isSelected();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
//		driver.findElement(By.id("autocomplete")).sendKeys("Rahul");
//		
//		Select sc=new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
//		sc.selectByVisibleText("Option1");
//		sc.selectByIndex(2);
//		sc.selectByValue("option3");
//		driver.findElement(By.id("checkBoxOption2")).click();
//		driver.findElement(By.id("openwindow")).click();
//		Set<String>win=driver.getWindowHandles();
//		Iterator<String>its=win.iterator();
//		String parent=its.next();
//		String child=its.next();
//		driver.switchTo().window(child);
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(parent);
//		driver.findElement(By.id("opentab")).click();
//		Set<String>win1=driver.getWindowHandles();
//		Iterator<String>its1=win1.iterator();
//		String parent1=its1.next();
//		String child1=its1.next();
//		driver.switchTo().window(child1);
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.switchTo().window(parent1);
//		driver.findElement(By.id("name")).sendKeys("Atik");
//		driver.findElement(By.cssSelector("#alertbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		driver.findElement(By.id("displayed-text")).sendKeys("Rana");
//		driver.findElement(By.id("hide-textbox"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.switchTo().defaultContent();
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footer1=footer.findElement(By.xpath("//td[1]//ul[1]"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
//		for(int i=1;i<footer1.findElements(By.tagName("a")).size();i++)
//		{
//			String context=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			footer1.findElements(By.tagName("a")).get(i).sendKeys(context);
//		}
		
		int i=1;
		while (i<footer1.findElements(By.tagName("a")).size())
		{
			String context=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer1.findElements(By.tagName("a")).get(i).sendKeys(context);
			i++;
		}
		
		Set<String>win1=driver.getWindowHandles();
		Iterator<String> its=win1.iterator();
		
		while(its.hasNext())
		{
			driver.switchTo().window(its.next());
			System.out.println(driver.getTitle());
			
		}
		}
	}


