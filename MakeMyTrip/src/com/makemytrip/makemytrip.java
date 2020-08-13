package com.makemytrip;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class makemytrip {
	public WebDriver driver; 
	    // Method 1: Open Brower say chrome			
	    @BeforeSuite	
	    public void openBrowser() throws IOException {	
	    	Properties prop=new Properties();
			FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\data.properties");
			prop.load(fis);
			
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    	driver.get(prop.getProperty("url"));
	    	System.out.println("successfully launched makemytrip");
	    	
	    	
	    }
	   @Test(priority=1)
	    public void autopopup() {
		   
	    	Actions act = new Actions(driver);
			act.moveByOffset(913, 477).doubleClick().build().perform();
			System.out.println("handled autopopup");
	    }
	    
	    @Test(priority=2)
	    public void flightsearchfrom() throws IOException, InterruptedException {
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\search.properties");
	    	prop.load(fis);
	    	driver.findElement(By.cssSelector(prop.getProperty("source"))).click();
	    	WebElement input1= driver.findElement(By.cssSelector(prop.getProperty("from")));
	    	input1.sendKeys(prop.getProperty("place"));
	    	input1.sendKeys(Keys.ENTER);
	    	Thread.sleep(1000);
	    	input1.sendKeys(Keys.DOWN);
	    	input1.sendKeys(Keys.ENTER);
	    	
	    }
	    @Test(priority=3)
	    public void flightsearchto() throws IOException, InterruptedException {
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\search.properties");
	    	prop.load(fis);
	    	driver.findElement(By.cssSelector(prop.getProperty("destination"))).click();
	    	WebElement input2= driver.findElement(By.cssSelector(prop.getProperty("to")));
	    	input2.sendKeys(prop.getProperty("palce2"));
	    	input2.sendKeys(Keys.ENTER);
	    	Thread.sleep(1000);
	    	
	    	input2.sendKeys(Keys.DOWN);
	    	input2.sendKeys(Keys.ENTER);
	    	
	    	
	    }
	    @Test(priority=4)
	    public void getdatepicker() throws Exception {
	      driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
	   	  Thread.sleep(1000);
	   	  
	   	  String flag = "False";
	   	 

	   	  while(flag=="False") {
	   	   
	   	   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).size()>0) {
	   	    
	   	   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).click(); 
	   	   flag="True";
	   	   Thread.sleep(1000);
	   	   }
	   	   
	   	   else {
	   	    Thread.sleep(1000);
	   	    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	   	   }
	    }
	    }
	    @Test(priority=5)
	   	public void h() throws IOException{
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\search.properties");
	    	prop.load(fis);
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[4]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/div/div[1]/ul/li[3]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/div/div[2]/ul/li[2]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/button")).click();
	    	
	   		  
	   		  
	   	  }
	    @Test(priority=6)
	    public void search() {
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
	    	System.out.println("the choices have been selected");
	    	String CurrentUrl = driver.getCurrentUrl();
	    	String MainWindow=driver.getWindowHandle();
			 for (String handle : driver.getWindowHandles()) {

				    driver.switchTo().window(handle);}
	    	
	    }
	    
	    @Test(priority=7)
	    public void u() throws IOException, InterruptedException {
	    	
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\filter.properties");
	    	prop.load(fis);
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[1]/div/span[1]/label/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[2]/div/span[2]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[2]/div/span[4]/label/span")).click();
			driver.findElement(By.cssSelector("#section--wrapper > div.fli-intl-rhs.pull-left.end > div:nth-child(2) > div > p > a")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[2]/div/div/span[1]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[2]/div/div/span[2]/label/span")).click();
			Thread.sleep(5000);
			WebElement sliderprice=driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[3]/div/div/div/div/div/div[4]"));
	    	Actions action = new Actions(driver);
		    //move slider using dragAndDropBy method
		    action.dragAndDropBy(sliderprice, -90, 0).build().perform();
		    driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
		    /*driver.findElement(By.xpath(prop.getProperty("airindia"))).click();
	    	
	    	//driver.findElement(By.xpath(prop.getProperty("indigo"))).click()
	    	//driver.findElement(By.xpath(prop.getProperty("nonstop"))).click();
	    	
	    	
	    	driver.findElement(By.xpath(prop.getProperty("morningdept"))).click();
	    	driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	//WebElement sliderprice=driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[3]"));
	    	// Actions action = new Actions(driver);
		     // move slider using dragAndDropBy method
		     //action.dragAndDropBy(sliderprice, -10, 0).build().perform();
		      * */
		      
		     
	    	
	    	
	    }

	    @Test(priority=8)
	    public void company() throws IOException{
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\INFI\\MakeMyTrip\\company.properties");
	    	prop.load(fis);
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath(prop.getProperty("airindia"))).click();
	    	 driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath(prop.getProperty("airasia"))).click();
	    	 driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath(prop.getProperty("goair"))).click();
	    	 driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath(prop.getProperty("indigo"))).click();
	    	 driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath(prop.getProperty("spicejet"))).click();
	    	 driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	//driver.findElement(By.xpath(prop.getProperty("vistara"))).click();
	    	// driver.findElement(By.xpath(prop.getProperty("clearall"))).click();
	    	
	   
	    	
	    
	  
	    	
	    
	    
	

}
}



