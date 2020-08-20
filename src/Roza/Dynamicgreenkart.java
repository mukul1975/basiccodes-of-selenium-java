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


public class Dynamicgreenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.getTitle());
//		Assert.assertTrue(driver.getTitle().contains("GreenKart - veg and fruits kart"));
		String[] productNeeded= {"Brocolli","Orange","Onion","Grapes","Apple","Orange","Cucumber"};
		int j=1;
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			String[] text=products.get(i).getText().split("-");
			String formatedName=text[0].trim();
			
			List actualProduct=Arrays.asList(productNeeded);
			
			if (actualProduct.contains(formatedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				j++;
				 
				if(j==formatedName.length())
				{
					break;
				}
				
				
			}
		}
		
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
//	Assert.assertTrue(driver.findElement(By.cssSelector(".promoInfo")).isDisplayed());
		
		if(driver.findElement(By.cssSelector(".promoInfo")).getText().contains("Code applied ..!"))
		{
			System.out.println("TestCasePass");
		}
		else
		{
			System.out.println("TestCaseFailed");	
		}
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Select sc=new Select(driver.findElement(By.xpath("//select[contains(@style,'width:')]")));
		sc.selectByValue("India");
		driver.findElement(By.xpath("//input[contains(@type,'checkbo')]")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@type,'checkbo')]")).isSelected());
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		}
	}
	
	
