package Roza;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/19754/scorecard/1214671/bangladesh-vs-zimbabwe-2nd-t20i-zimbabwe-in-bangladesh-2019-20");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='col-b']"));
		int raw=table.findElements(By.xpath("div[class=\"wrap batsmen\"]")).size();
		
		
		int count=table.findElements(By.cssSelector("div[class='wrap batsmen'] div:nth-child(3)")).size();
		int sum=0;
		for(int i=0;i<count-3;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='wrap batsmen'] div:nth-child(3)")).get(i).getText();
			int valueint=Integer.parseInt(value);
			sum=sum+valueint;
		}
		
		System.out.println(table.findElement(By.xpath("//div[@id='gp-inning-00']//div[contains(@class,'wrap extras')]")).getText());
		
		
		System.out.println(sum);
	}

}
