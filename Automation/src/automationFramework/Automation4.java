package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation4 {

	public static void main(String[] args) throws InterruptedException {
		//launching the url in chrome using chromedriver
				String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver", exePath);
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.seleniumeasy.com/test/");
				 driver.manage().window().maximize() ;
				 System.out.println("successful launch");

				 Thread.sleep(2000);
				 //removing light box
				 driver.findElement(By.id("at-cv-lightbox-close")).click();
				//clicing on input button.
				 driver.findElement(By.className("dropdown-toggle")).click();
				Thread.sleep(3000);
				//clicking on checkbox option
				driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")).click();
				Thread.sleep(3000);
				//Single checkbox demo
				driver.findElement(By.id("isAgeSelected")).click();
				driver.findElement(By.cssSelector("#txtAge")).getText();
				
				//multiple checkbox demo
				WebElement option1 = driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label > input"));
				option1.click();
				WebElement option2 = driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(4) > label > input"));
				option2.click();
				Thread.sleep(3000);
				WebElement getall = driver.findElement(By.id("check1"));
				getall.click();
				Thread.sleep(3000);
				WebElement getall2 = driver.findElement(By.id("check1"));
				getall2.click();
				
				//going back to main window
				driver.get("https://www.seleniumeasy.com/test/");
				//clicking on input button.
				 driver.findElement(By.className("dropdown-toggle")).click();
				Thread.sleep(3000);
				//going to  single radio button
				driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a")).click();
				
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(3) > input[type=radio]")).click();
				driver.findElement(By.id("buttoncheck")).click();
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton")).getText();
				
				//going to multiple radio button
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(2) > label:nth-child(2) > input[type=radio]")).click();
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label:nth-child(3) > input[type=radio]")).click();
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button")).click();
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > p.groupradiobutton")).getText();
				
				//going back to main window
				driver.get("https://www.seleniumeasy.com/test/");
				//clicking on input button.
				 driver.findElement(By.className("dropdown-toggle")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[4]/a")).click();
				Select day = new Select(driver.findElement(By.id("select-demo")));
				Thread.sleep(1000);
				day.selectByVisibleText("Wednesday");
				driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.selected-value")).getText();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
