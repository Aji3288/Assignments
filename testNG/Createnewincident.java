package week5.day1.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Createnewincident {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev119718.service-now.com");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Welcome@123");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow (driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//input[@id='filter']") .sendKeys("Incidents",Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Incidents']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		String incidentNumber = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number is : " + incidentNumber);
		driver.findElement(By.id("incident.short_description")).sendKeys("Create New Incident");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();		 
		shadow.findElementByXPath("//input[@placeholder='Search']").sendKeys(incidentNumber,Keys.ENTER);
		String text = driver.findElement(By.xpath("//a[contains(@aria-label,'Open record:')]")).getText();
		if(incidentNumber.equals(text)) 
		{
		System.out.println("Incident number is created"); 
		}
		else 
			
		{
		System.out.println("Incident number is not created"); 
		}
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
