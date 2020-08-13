package automationFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {
	public static void highLightElement(WebDriver driver, WebElement element) throws InterruptedException
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'background: black; border: 2px solid red;');", element);
	 
	
	Thread.sleep(500);
	
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	}
	

}
