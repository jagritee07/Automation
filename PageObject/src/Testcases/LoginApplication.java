package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffHomePagePF;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPagePF;

public class LoginApplication {
	@Test
	public void Login() {

   	 System.setProperty("webdriver.chrome.driver", "//C:\\\\Users\\\\jagriti\\\\Desktop\\\\driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 RediffLoginPagePF rd= new RediffLoginPagePF(driver);
		 rd.EmailId().sendKeys("mkh@rediffmail.com");
		 rd.password().sendKeys("ujh234");
		 rd.Signin().click();
		 rd.Home().click();
		 
		 RediffHomePagePF rh = new RediffHomePagePF(driver);
		 rh.Search().sendKeys("flower");
		 rh.Submit().click();
		
	}
	

}
