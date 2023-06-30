package week29623;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		WebElement results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(results.getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("s-result-sort-select_4")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		System.out.println("Name = " + name.getText());
		WebElement discountedPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println("Price = " + discountedPrice.getText());
		System.out.println(driver.getTitle());
		driver.close();
						
	}

}
