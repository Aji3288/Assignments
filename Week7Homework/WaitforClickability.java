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

public class WaitforClickability {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		WebElement Clickability = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		Clickability.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(Clickability));
		Thread.sleep(2000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File location = new File ("snap/Clickability.png");
		FileUtils.copyFile(screenshotAs, location);
		//After hide the messages
		Thread.sleep(7000);
		File screenshotAs1 = driver.getScreenshotAs(OutputType.FILE);
		File location1 = new File ("snap1/clickability.png");
		FileUtils.copyFile(screenshotAs1, location1);
		System.out.println(driver.getTitle());
		

	}

}
