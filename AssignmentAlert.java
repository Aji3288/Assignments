package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("com-hextom-smartpushmarketing-popup-close-popup-push")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='grid-image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("wk_zipcode")).sendKeys("600063");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();	
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();
		
		

	}

}
