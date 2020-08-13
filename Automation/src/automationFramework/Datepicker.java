package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) throws InterruptedException {
		//launching the url in chrome using chromedriver
				String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver", exePath);
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://dev2qa.com/demo/datepicker/jquery-ui-1.12.1.custom/index.html");
				 driver.manage().window().maximize() ;
				 

}
}

