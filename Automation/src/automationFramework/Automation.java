package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		//launching the url in chrome using chromedriver
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.get("https://www.seleniumeasy.com/test/");
		 driver.manage().window().maximize() ;
		 System.out.println("successful launch");

		 Thread.sleep(2000);
		 //removing light box
		 driver.findElement(By.id("at-cv-lightbox-close")).click();
		 //going to input forms
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
		 //click on simple form
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();
		 //single input field
		 driver.findElement(By.id("user-message")).sendKeys("jagriti");
		 driver.findElement(By.cssSelector("#get-input > button")).click();
		 String value=driver.findElement(By.xpath("//*[@id=\"display\"]")).getText();
		//Assertion.
			//Assert.assertEquals("jagriti",value);
			
			//validation using if statement.
			if((value).contains("jagriti")){
			    System.out.println("pass");
			}
			else{
			    System.out.println("not pass");
			}
		 //two input field
		 driver.findElement(By.id("sum1")).sendKeys("3");
		 driver.findElement(By.id("sum2")).sendKeys("2");
		 driver.findElement(By.cssSelector("#gettotal > button")).click();
		 String values=driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).getText();
		 //validation using if statement
		    if((values).contains("5")){
			    System.out.println("pass");
			    }
		    else{
		    	System.out.println("not pass");
		    	}
		 
		 //getting the main window again
		 driver.get("https://www.seleniumeasy.com/test/");
		 //date-picking
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a")).click();
		 //bootstrap date picking
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/ul/li[1]/a")).click();
		 Thread.sleep(3000);
		 //entering the date
		 driver.findElement(By.cssSelector("#sandbox-container1 > div > input")).sendKeys("01/01/2001");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#datepicker > input:nth-child(1)")).sendKeys("07/07/1998");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#datepicker > input:nth-child(3)")).sendKeys("06/01/2020");
		 Thread.sleep(3000);
		 
		 //getting the main window again
		 driver.get("https://www.seleniumeasy.com/test/");
		 //clicing on input button.
		 driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		
		//clicking on the link.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		//selecting single value.
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span")).click();
		 Thread.sleep(2000);
		 WebElement input=driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
		 input.sendKeys("Aus");
		 Thread.sleep(2000);
		 input.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 //selecting multiple values.
		 WebElement input2=driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div.panel-body > span > span.selection > span > ul > li > input"));
		 input2.sendKeys("ala");
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.ENTER);
		 input2.sendKeys("ari");
		 Thread.sleep(2000);
		 input2.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 //selecting disabled values.
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]")).click();
		 Thread.sleep(2000);
		 WebElement input3=driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
		 input3.sendKeys("gu");
		 Thread.sleep(2000);
		 input3.sendKeys(Keys.ENTER);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
			
		 
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
