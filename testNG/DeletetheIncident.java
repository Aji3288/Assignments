package week5.day1.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class DeletetheIncident {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
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
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//span[@class='list_header_cell_container']/i)[1]")).click();
		driver.findElement(By.xpath("//div[@id='context_list_headerincident']/div[4]")).click();
		String text = driver.findElement(By.xpath("(//a[contains(@aria-label,'Open record:')])")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(@aria-label,'Open record:')]")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-destructive']")).click();
		shadow.findElementByXPath("//input[@placeholder='Search']") .sendKeys("Incidents",Keys.ENTER);
		String text2 = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
		if(text2.equals("No records to display"))
		{
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Deleted not yet done");
		}
	}

}		
		
		


