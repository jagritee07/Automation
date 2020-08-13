package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation6 {

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
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[1]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[1]/ul/li[3]/a")).click();
		 Thread.sleep(2000);
		 WebElement slider1=driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action = new Actions(driver);
	     // move slider using dragAndDropBy method
	     action.dragAndDropBy(slider1, 30, 0).build().perform();
	     
	     Thread.sleep(2000);
		 WebElement slider2=driver.findElement(By.xpath("//*[@id=\"slider2\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action1 = new Actions(driver);
	     // move slider using dragAndDropBy method
	     action1.dragAndDropBy(slider2, 60, 0).build().perform();
	     
	     
	     Thread.sleep(2000);
		 WebElement slider3=driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action2 = new Actions(driver);
	     // move slider using dragAndDropBy method
	     action2.dragAndDropBy(slider3, -90, 0).build().perform();
	     
	     
	     
	     Thread.sleep(2000);
		 WebElement slider4=driver.findElement(By.xpath("//*[@id=\"slider4\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action3 = new Actions(driver);
	     // move slider using dragAndDropBy method
	     action3.dragAndDropBy(slider4, 70, 0).build().perform();
	     
	     
	     
	     Thread.sleep(2000);
		 WebElement slider5=driver.findElement(By.xpath("//*[@id=\"slider5\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action4 = new Actions(driver);
	     // move slider  using dragAndDropBy method
	     action4.dragAndDropBy(slider5, 80, 0).build().perform();
	     
	     
	     Thread.sleep(2000);
		 WebElement slider6=driver.findElement(By.xpath("//*[@id=\"slider6\"]/div/input"));
		  // Creating Object for a Actions class
	     Actions action5 = new Actions(driver);
	     // move slider  using dragAndDropBy method
	     action5.dragAndDropBy(slider6, 50, 0).build().perform();
	     
	   /*//web element
	     WebElement slider = driver.findElement(By.xpath("//*[@id=\\\"slider6\\\"]/div/input"));

	            // Creating Object for a Actions class
	      Actions action5 = new Actions(driver);

	            //Moves the mouse from its current position to the given offset.
	     action5 .clickAndHold(slider).moveByOffset(100,0).release().perform();  */
	     
	     
		 
		

	}

}
