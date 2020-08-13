package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation5 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.seleniumeasy.com/test/");
		 driver.manage().window().maximize() ;
		 System.out.println("successful launch");

		 Thread.sleep(2000);
		 //removing light box
		 driver.findElement(By.id("at-cv-lightbox-close")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(3) > a")).click();
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul/li[2]/a")).click();
		 WebElement input=driver.findElement(By.id("task-table-filter"));
		 input.sendKeys("in progress");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div > div > button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")).sendKeys("Kathaniko");;
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
