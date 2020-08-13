package automationFramework;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://webdriveruniversity.com/index.html");
		 System.out.println("successful launch");
		 
		 
		 
		 //contact-list
		 driver.findElement(By.id("contact-us")).click();
		 String MainWindow=driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
		 
		 driver.findElement(By.name("first_name")).sendKeys("Jagriti");
		 Thread.sleep(1000);
		 driver.findElement(By.name("last_name")).sendKeys("Kumari");
		 Thread.sleep(1000);
		 driver.findElement(By.name("email")).sendKeys("jk147@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.name("message")).sendKeys("good learning page");
		 Thread.sleep(1000);
		 driver.findElement(By.id("form_buttons")).submit();
		 driver.close();
		 
		 
		 
		 driver.switchTo().window(MainWindow);
		 
		 
		 
		 
		 driver.findElement(By.id("login-portal")).click();
		 
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
		 
		 driver.findElement(By.id("text")).sendKeys("webdriver");
		 Thread.sleep(1000);
		 driver.findElement(By.id("password")).sendKeys("webdriver");
		 Thread.sleep(1000);
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(1000);
		 
		 driver.switchTo().alert().accept();
		 driver.close();
		 
		 driver.switchTo().window(MainWindow);
		 
		 
		 
		 /*driver.findElement(By.id("button-clicks")).click();
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
		 
		 driver.findElement(By.id("button1")).click();
		 
		 
		 
		 /*driver.findElement(By.id("myModalClick")).click();
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.xpath("/html/body/div[2]")).click();
		 driver.findElement(By.id("button2")).click();
		 
		 driver.switchTo().alert().dismiss();
		 */
		 
		 driver.findElement(By.id("to-do-list")).click();
		 
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}
		 driver.findElement(By.id("plus-icon")).click();
		 driver.findElement(By.xpath("//*[@id=\"container\"]/input")).sendKeys("webdriver");
		 driver.findElement(By.cssSelector("#container > ul > li:nth-child(1) > span > i")).click();
		 Thread.sleep(2000);
		 driver.close();
		 
		 driver.switchTo().window(MainWindow);
		 
		 driver.findElement(By.id("dropdown-checkboxes-radiobuttons")).click();
		 for (String handle : driver.getWindowHandles()) {

			    driver.switchTo().window(handle);}

			Select Java = new Select(driver.findElement(By.id("dropdowm-menu-1")));
			Thread.sleep(1000);
			Java.selectByVisibleText("Python");
			Select Eclipse = new Select(driver.findElement(By.id("dropdowm-menu-2")));
			Thread.sleep(1000);
			Eclipse.selectByVisibleText("JUnit");
			Thread.sleep(1000);
			WebElement option1 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
			option1.click();
			WebElement option2 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
			option2.click();
			Thread.sleep(1000);
			WebElement radio1 = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(5)"));
			radio1.click();
			Thread.sleep(1000);
			WebElement radio2 = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
			radio2.click();
			Thread.sleep(1000);
			Select fruit = new Select(driver.findElement(By.id("fruit-selects")));
			Thread.sleep(1000);
			fruit.selectByVisibleText("Apple");
			Thread.sleep(1000);
			fruit.selectByVisibleText("Pear");
			driver.close();
		 
		 
	
		  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

		 
		 
		 
		 

		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		 
		 
