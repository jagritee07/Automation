package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	WebDriver driver;
	/*By username=By.id("login1");
	By password=By.id("password");
	By signin=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	By home=By.linkText("rediff.com");*/
	public RediffLoginPagePF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")
	WebElement signin;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement EmailId() {
		return  username;
	}
	public WebElement password() {
		return  password;
	}
	public WebElement Signin() {
		return  signin;
	}
	public WebElement Home() {
		return  home;
	}
	
	
}
