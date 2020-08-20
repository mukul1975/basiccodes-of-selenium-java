package Roza;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		boolean select=driver.findElement(By.xpath("//input[@value='radio1']")).isSelected();
		
		if(select)
		{
			System.out.println("Selected");
		}
		
		else
		{
			System.out.println("Notselected");	
		}

		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Selenium");
		Select s1 = new Select(driver.findElement(By.id("dropdown-class-example")));
		s1.selectByVisibleText("Option3");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.cssSelector("#openwindow")).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahulshetty");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahulshetty");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("#opentab")).click();
		Set<String>win1=driver.getWindowHandles();
		Iterator<String>it1=win1.iterator();
		String parent1=it1.next();
		String child1=it1.next();
		driver.switchTo().window(child1);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Courses')]")).click();
		driver.switchTo().window(parent1);
		driver.findElement(By.id("displayed-text")).sendKeys("Hidable");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
//		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Jobs')]")).click();
		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Mentorship')]")).click();
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
