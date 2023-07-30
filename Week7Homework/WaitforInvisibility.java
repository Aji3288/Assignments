package week7.day1.Homework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforInvisibility {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File Location = new File ("snap/Invisibility.png");
		FileUtils.copyFile(screenshotAs, Location);
		WebElement invisibility = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		invisibility.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(invisibility));
		//Text Invisibility (I am about to hide)
		Thread.sleep(5000);
		File screenshotAs1 = driver.getScreenshotAs(OutputType.FILE);
		File Location1 = new File ("./snap1/invisibility.png");
		FileUtils.copyFile(screenshotAs1, Location1);
		String title = driver.getTitle();
		System.out.println(title);				
	}

}
