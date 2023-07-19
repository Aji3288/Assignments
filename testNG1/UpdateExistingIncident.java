package week5.day1.testNG1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends IncidentClass  {
@Test
	public  void runUpdateExistingIncident() throws IOException {
		
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.get("https://dev119718.service-now.com");
		 * driver.findElement(By.id("user_name")).sendKeys("admin");
		 * driver.findElement(By.id("user_password")).sendKeys("Welcome@123");
		 * driver.findElement(By.id("sysverb_login")).click(); Shadow shadow = new
		 * Shadow (driver); shadow.setImplicitWait(10);
		 * shadow.findElementByXPath("//div[text()='All']").click();
		 * shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incidents",Keys.
		 * ENTER); shadow.findElementByXPath("//mark[text()='Incidents']").click();
		 */
		Shadow shadow = new Shadow (driver); 
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//span[@class='list_header_cell_container']/i)[1]")).click();
		driver.findElement(By.xpath("//div[@id='context_list_headerincident']/div[4]")).click();
		String text = driver.findElement(By.xpath("(//a[contains(@aria-label,'Open record:')])")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(@aria-label,'Open record:')]")).click();
		WebElement urg = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select urgency =new Select (urg);
		urgency.selectByVisibleText("1 - High");
		WebElement st = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select state = new Select (st);
		state.selectByVisibleText("In Progress");
		driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
		driver.findElement(By.xpath("//a[contains(@aria-label,'Open record:')]")).click();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	    File locations = new File ("./snap/Verified.png");
	    FileUtils.copyFile(screenshotAs, locations);	
	    
	}
}
