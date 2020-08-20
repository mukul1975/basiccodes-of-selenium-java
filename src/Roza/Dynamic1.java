package Roza;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dynamic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> product = driver.findElements(By.xpath("//h4[contains(@class,'product-n')]"));
		String[] itemNeeded= {"Banana","Apple","Betroot","Beans","Cucumber"};
		int j=0;
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
			String actualName=name[0].trim();
			
			List item=Arrays.asList(itemNeeded);
			if(item.contains(actualName))
			{
				j++;
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
				if(j==actualName.length())
				{
					break;
				}
				
			}
		}
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText().contains("Code applied "));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		Select sc=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		sc.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class='chkAgree']")).isSelected());
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
	}
		}
		
	
