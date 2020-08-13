package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {
	WebDriver driver;

	public RediffHomePagePF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	/*By search=By.id("srchword");
	By submit=By.xpath("//*[@id=\"queryTop\"]/input");*/
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"queryTop\"]/input")
	WebElement submit;
	
	
	
	
	public WebElement Search() {
		return search;
	}
	public WebElement Submit() {
		return submit;
	}

}
