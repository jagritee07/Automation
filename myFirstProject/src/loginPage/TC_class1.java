package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_class1 {
	String driverPath = "//C:\\\\Users\\\\jagriti\\\\Desktop\\\\driver/chromedriver.exe";
    public WebDriver driver; 
    // Method 1: Open Brower say chrome			
    @Test		
    public void openBrowser() {				
        driver = new ChromeDriver();				
    }
 // Method 2: Launch Google.com			
    @Test		
    public void launchGoogle() {				
        driver.get("http://www.google.co.in");						
    }		
    // Method 3: Perform a search using "Facebook"			
    @Test		
    public void peformSeachAndClick1stLink() {				
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
    }	
    // Method 4: Verify Google search page title.			
    @Test		
    public void FaceBookPageTitleVerification() throws Exception {				
        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
        Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
    }		

}
