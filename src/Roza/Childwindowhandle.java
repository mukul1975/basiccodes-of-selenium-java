package Roza;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/window-parent.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[@class='row']/div[@class='col-md-7 col-md-offset-1']/div[@id='body_content']/table/tbody/tr/td/span[1]/a[2]")).click();
		System.out.println(driver.getTitle());
		Set<String>WID=driver.getWindowHandles();
		Iterator<String>IT=WID.iterator();
		String parent=IT.next();
		String child=IT.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.switchTo().window(parent);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		
		
	}

}
