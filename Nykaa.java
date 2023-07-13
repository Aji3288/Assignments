package week.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title of : " + title);
		driver.findElement(By.xpath("(//div[@id='list-wrapper']//button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='title'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='control-box css-9rrbqm']/label)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[12]")).click();
		Thread.sleep(2000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File location = new File("./snap/shampoo.png");
		FileUtils.copyFile(screenshotAs, location);
		driver.findElement(By.xpath("//div[@class='css-43m2vm']/img")).click();
		Set<String> secondWindow = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(secondWindow);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		WebElement mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
		String text = mrp.getText();
		System.out.println("MRP of the product : " + text);
		driver.findElement(By.xpath("//div[@class='css-vp18r8']/button")).click();
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
		driver.switchTo().frame(0);
		WebElement gta = driver.findElement(By.xpath("(//div[@class='css-1mx04mv e25lf6d3']//span)[1]"));
		String text2 = gta.getText();
		System.out.println("Grand Total amount : " + text2);
		//driver.switchTo().frame(1);
		driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();
		driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img")).click();
		File screenshotAs2 = driver.getScreenshotAs(OutputType.FILE);
		File location1 = new File("./snap/amount.png");
		FileUtils.copyFile(screenshotAs2, location1);
		driver.quit();

	}

}
