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


public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http:\\amazon.com");
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtext')]"))).click().keyDown(Keys.SHIFT).sendKeys("computer");
		ac.moveToElement(driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtext')]"))).doubleClick().build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[2]"))).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[2]"))).contextClick().build().perform();
		Thread.sleep(2000);
		String context1=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).sendKeys(context1);
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String parent=it.next();
		String child=it.next();
//		Assert.assertTrue(driver.switchTo().window(child).getTitle().contains("Amazon.com Best Sellers: The most popular items on Amazon"));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]"))).click().build().perform();
		
		
		
		
		
		
	}

}
