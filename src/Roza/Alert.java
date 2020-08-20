package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Text="RozaRoha";
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(Text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		to confirm
		driver.findElement(By.id("name")).sendKeys("Rozy");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2500);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	

	}

}
