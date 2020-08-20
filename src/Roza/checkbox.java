package Roza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
//		input[@type='checkbox']
//		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
//		List<WebElement> check=Driver.findElements(By.xpath("input[@type='checkbox']"));
//	
//		for(int i=0; i<Driver.findElements(By.xpath("input[@type='checkbox']")).size();i++)
//		{
//			String text=Driver.findElements(By.xpath("input[@type='checkbox']")).get(i).getText();
//			if(text.equalsIgnoreCase("Senior Citizen"))
//			{
//				Driver.findElements(By.xpath("input[@type='checkbox']")).get(i).click();
//				break;
//			}
				
		

	}

}