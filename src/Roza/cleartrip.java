package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
//		driver.switchTo().alert().accept();
		Select sa = new Select(driver.findElement(By.id("Adults")));
		sa.selectByValue("2");
		Select sc = new Select(driver.findElement(By.id("Childrens")));
		sc.selectByValue("2");
		Select ai = new Select(driver.findElement(By.id("Infants")));
		ai.selectByValue("1");
		driver.findElement(By.xpath("//strong[contains(text(),'More options:')]")).click();
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Indian Airlines");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'cWood-medium f12 mb0 mt0 pb15 pt10')]")));
		

	}

}
