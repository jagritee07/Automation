package automationFramework;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation7 {
public static void main(String[] args) throws InterruptedException {
		
		//creating object of scanner class.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Assignee");
		
		//taking input.
		String input=sc.nextLine();
		
		//switch case.
		switch(input)
		{
		case "John Smith": System.out.println("Task is Wireframes and status is in-progress");
							break;
		case "Mike Trout": System.out.println("Task is Landing Page and status is in-progress");
							break;
		case "Loblab Dan": System.out.println("Task is SEO tags and status is failed qa"); 
							break;
		case "Emily John": System.out.println("Task is Bootstrap 3 and status is in progress");
							break;
		case "Holden Charles": System.out.println("Task is jQuery library and status is deployed");
							break;
		case "Jane Doe": System.out.println("Task is Browser Issues and status is failed qa");
							break;
		case "Kilgore Trout": System.out.println("Task is Bug fixing and status is in-progress");
							break;
		default: System.out.println("No Assignee with that name present");
		}
		String exePath = "//C:\\Users\\jagriti\\Desktop\\driver/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		

		
		//create a new instance of chrome driver.
		WebDriver driver=new ChromeDriver();
		
		//browsing url.
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize() ;
		
		Thread.sleep(5000);
		
		//handling popup.
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		//clicking on table link.
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(3) > a")).click();
		Thread.sleep(2000);
		
		//clicking on table data search link.
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//entering data.
		driver.findElement(By.id("task-table-filter")).sendKeys(input);
		Thread.sleep(2000);
		
		//clicking on filter button.
		driver.findElement(By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(3) > div > div > div > button")).click();
		Thread.sleep(2000);
		
		//entering datas.
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[2]/input")).sendKeys("jacobs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[2]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")).sendKeys("Brigade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")).sendKeys("Kathaniko");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")).clear();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
