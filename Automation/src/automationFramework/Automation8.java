package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Automation8 {
	public static void main(String[] args) throws InterruptedException {
		
		
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.seleniumeasy.com/test/");
		 driver.manage().window().maximize() ;
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 System.out.println("successful launch");

		 Thread.sleep(2000);
		 //removing light box
		 driver.findElement(By.id("at-cv-lightbox-close")).click();
		 //selecting listbox
		 WebElement listbox=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[3]/a"));
		 //highlight the element and click
		 Helper.highLightElement(driver,listbox );
		 listbox.click();
		 WebElement bootstrp=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[3]/ul/li[1]/a"));
		 //highlight the element and click
		 Helper.highLightElement(driver,bootstrp );
		 bootstrp.click();
		 WebElement search=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[1]/div/input"));
		 //highlight the element and click
		 Helper.highLightElement(driver,search );
		 search.sendKeys("bootstrap-duallist ");
		 WebElement searchbtn=driver.findElement(By.cssSelector("#listhead > div.col-md-2 > div > a"));
		 //highlight the element and click
		 Helper.highLightElement(driver,searchbtn );
		 searchbtn.click();
		 WebElement arrowbtn=driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div > div.list-arrows.col-md-1.text-center > button.btn.btn-default.btn-sm.move-right"));
		 //highlight the element and click
		 Helper.highLightElement(driver,arrowbtn );
		 arrowbtn.click();
		 WebElement newlist=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[6]"));
		 String pass=newlist.getText();
		 Helper.highLightElement(driver,newlist );
		 
		 if(pass.contentEquals("bootstrap-duallist")) {
			 System.out.println("value passed to right successfully");
		 }else
			 System.out.println("value not passed to right ");
		 WebElement search1=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[2]/div/input"));
		 //highlight the element and click
		 Helper.highLightElement(driver,search1);
		 search1.sendKeys("Cras justo odio");
		 WebElement searchbtn2=driver.findElement(By.xpath("//*[@id=\"listhead\"]/div[1]/div/a"));
		 //highlight the element and click
		 Helper.highLightElement(driver,searchbtn2);
		 searchbtn2.click();
		 WebElement arrowbtn2=driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div > div.list-arrows.col-md-1.text-center > button.btn.btn-default.btn-sm.move-left"));
		 //highlight the element and click
		 Helper.highLightElement(driver,arrowbtn2 );
		 arrowbtn2.click();
		 WebElement newlist1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div/ul/li[1]"));
		 String pass2=newlist1.getText();
		 Helper.highLightElement(driver,newlist1 );
		 if(pass2.contentEquals("Cras justo odio")) {
			 System.out.println("value passed to left successfully");
		 }else
			 System.out.println("value not passed to left ");
		 
		 //driver close
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}
}

