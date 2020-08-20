package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String Label=driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		sc.selectByVisibleText(Label);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Label);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		
		if(text.contains(Label))
		{
		System.out.println("Allart msg is correct");	
		}
		else
		{
			System.out.println("Allart msg is incorrect");	
		}
	}
	

}
