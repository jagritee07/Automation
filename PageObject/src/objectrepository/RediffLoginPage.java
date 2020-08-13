package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPage {
	WebDriver driver;
	By username=By.id("login1");
	By password=By.id("password");
	By signin=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	By home=By.linkText("rediff.com");
	public RediffLoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement EmailId() {
		return  driver.findElement(username);
	}
	public WebElement password() {
		return  driver.findElement(password);
	}
	public WebElement Signin() {
		return  driver.findElement(signin);
	}
	public WebElement Home() {
		return  driver.findElement(home);
	}
	
	
}
