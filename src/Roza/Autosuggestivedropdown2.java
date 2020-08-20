package Roza;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestivedropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://ksrtc.in/oprs-web/guest/home.do#");
//		driver.findElement(By.xpath("//div[@class='carousel-item active']//li[1]//a[1]")).click();
//		
//		Actions ac=new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//div[@class='carousel-item active']//li[1]//a[1]"))).click().build().perform();

		
		driver.get("https://amazon.com");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		String text=driver.findElement(By.id("twotabsearchtextbox")).getText();
		int i=0;
		while(! text.equalsIgnoreCase("computer mouse"))
		{
			i++;
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			text=driver.findElement(By.id("twotabsearchtextbox")).getText();
			System.out.println(text);
			
			if (i>5)
			{
				break;
			}
			if(i>5)
			{
				System.out.println("Text not foumd");
			}
			
		}
				
	}

}
