package week7.day1.Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTextChange {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		String text = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		System.out.println(text);
		WebElement textChange = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		textChange.click();
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(textChange));
		String text2 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println(text2);

	}

}
