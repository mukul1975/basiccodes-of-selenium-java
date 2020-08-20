package Roza;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class spicejetNtoN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.manage().timeouts().implicitlyWait(TimeUnit,20);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bhopal (BHO)']")).click();
		driver.findElement(By.xpath("(//a[@text='Jaipur (JAI)'] )[2]")).click();
		//We can use the parent child relaship xpath for the step 19 as well
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//		Actions ac = new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//div[@id='divpaxinfo']"))).perform();
		Thread.sleep(2000);	
	
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		Select sa=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		sa.selectByValue("2");
		Thread.sleep(2000);
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		sc.selectByValue("3");
		Thread.sleep(2000);
		Select si=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
		si.selectByValue("1");
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByVisibleText("USD");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
