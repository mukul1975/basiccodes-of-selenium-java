package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);

//		WebElement From=driver.findElement(By.xpath("//input[@type='text']"));
//		From.sendKeys(Keys.ARROW_DOWN);
//		From.sendKeys(Keys.ARROW_DOWN);
//		From.sendKeys(Keys.ENTER);

	}

}
