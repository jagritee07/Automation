package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {
	public static void main(String[] args) throws InterruptedException {
		//launching the url in chrome using chromedriver
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.seleniumeasy.com/test/");
		 System.out.println("successful launch");

		 Thread.sleep(2000);
		 //removing light box
		 driver.findElement(By.id("at-cv-lightbox-close")).click();
		
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

