package week5.day1.testNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.sukgu.Shadow;

public class AssigntheIncident {

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
		driver.findElement(By.className("section_view")).click();
		driver.findElement(By.xpath("//div[@id='context_labelMenu']/div[8]")).click();
		driver.findElement(By.className("section_view")).click();
		driver.findElement(By.xpath("//div[@id='context_labelMenu']/div[3]")).click();
		driver.findElement(By.xpath("//button[@data-for='sys_display.incident.assignment_group']//span[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Software",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Software']")).click();	
		driver.switchTo().window(lstwindow.get(0));
		WebElement frame1 = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//textarea[@aria-label='Work notes'])[3]")).sendKeys("Incident updated");
		driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
			
	}

}						
										
		


