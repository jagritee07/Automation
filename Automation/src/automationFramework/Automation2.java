package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation2 {
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
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/ul/li[1]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#sandbox-container1 > div > input")).sendKeys("01/01/2001");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#datepicker > input:nth-child(1)")).sendKeys("07/07/1998");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#datepicker > input:nth-child(3)")).sendKeys("06/01/2020");
		 Thread.sleep(3000);
		 
		 
	}
}

