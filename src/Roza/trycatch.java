package Roza;

import org.apache.http.impl.client.AIMDBackoffManager;

public class trycatch {
	
	//input[Qname='pass']
			//*[@name='pass']
			//input[contains(@name,'pass')]
			//input[text()='khn']
			/*
			 * #id
			 * .class
			 * input[name='pass']
			 * *[name='pass']
			 * [name*='pass']
			 * [name='pass']
			 * Select sc=new Select(driver.findelement(by.xpath(""));
			 * sc.select by id();
			 * sc.selectByvisibaletext("jhjhjh");
			 * sc.selectbyvalue(87)
			 * 
			 * driver.manage().timeouts().implicitelywait(5,timeunit.second);
			 * WebDriverWait w=new WebDriverWait(driver,5);
			 * w.untils(ExpectedConditions.visibilyOfElementLocated(by.xpath))
			 * 
			 * Actions ac=new Actions(driver);
			 * ac.movetoelement(driver.findelement(by.xpath(""))).build().perform();
			 * 
			 * Set<String>win=driver.getWindowhandles();
			 * Iterator <String>it=win.Iterator();
			 * String Home=it.next();
			 * String login=it.next();
			 * driver.switchto().Window(login);
			 * driver.switchto().window(Home);
			 * 
			 * driver.Switchto().frame(driver.findelement(by.xpath("")));
			 * driver.SwitchTo().frame by index();
			 * driver.switchTo().frame by Id();
			 * driver.SwitchTo().defaultcontent();
			 * 
			 * 
			 * TakesScreenshot ts=((TakesScreenshot)driver);
			 * File src=ts.getScreenshotAs(OutputType.File);
			 * FileUtils.copyfile(src.newFile("D://screen.png"));
			 * 
			 * 
			 * 
			 * 
			 */
	
	String name;
	int age;
	String country;
	
	
	public trycatch(String name,int age, String country)
	{
		this.name=name;
		this.age=age;
		this.country=country;
		
	}
	

	public static void main(String[] args)   {
		
		trycatch jj=new trycatch("MUKUL",42,"Bangladesh");
		System.out.println(jj.name+" "+jj.age+" "+jj.country);
		
		/* Object is the super class of Throwable class and Throwable class the parent class of error and Exception class. 
		 * And in the Exception class there are different kind of exception there. Tha main difference between Throws and 
		 * Throw key word is Throw keyword is used to throw the Exception deliberately. Or to generate the custom 
		 * exception Throw keyword is used. 
		 */
		
		try {
			int p=9/0;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("MMM");
			System.out.println("NNN");
			System.out.println("OOO");
			System.out.println("PPP");
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("saiful");
		System.out.println("saiful");
		System.out.println("saiful");
		
		
		
		
		
	}
	

	}
	

