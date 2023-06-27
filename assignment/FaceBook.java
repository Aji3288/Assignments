package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aji");
		driver.findElement(By.name("lastname")).sendKeys("Christilin");
		driver.findElement(By.xpath("(//input[contains(@name,'reg')])[1]")).sendKeys("9884067228");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("ajigodwin");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select drop1 =new Select(day);
		drop1.selectByIndex(2);	
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select drop2 = new Select (month);
		drop2.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select drop3=new Select (year);
		drop3.selectByValue("1988");
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		
		
	}

}
