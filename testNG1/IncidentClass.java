package week5.day1.testNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class IncidentClass {
	
	public ChromeDriver driver;
	
		
@BeforeMethod

	public  void precondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev119718.service-now.com");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Welcome@123");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow (driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.findElementByXPath("//input[@id='filter']") .sendKeys("Incidents",Keys.ENTER);
		shadow.findElementByXPath("//mark[text()='Incidents']").click();

	}
@AfterMethod
public void postcondition()

{
	driver.close();
}

}
