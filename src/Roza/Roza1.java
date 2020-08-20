package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roza1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("my");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Toyota car");
		driver.findElement(By.cssSelector("#header-desktop-search-button")).click();
		driver.navigate().back();
    	driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//a[contains(text(),'Coronavirus')]")).click();
    	driver.findElement(By.xpath("//a[@class='_yb_1prvm'][contains(text(),'US')]")).click();
    	driver.findElement(By.xpath("//header[@id='Header']//li[1]//div[1]//a[1]")).click();

    	driver.quit();
		
		

	}

}