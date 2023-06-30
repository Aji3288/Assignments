package week29623;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pvrcinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@style='position: relative;']")).click();
		WebElement city = driver.findElement(By.xpath("(//label[text()='City']/following::select)[1]"));
		Select drop1 = new Select(city);
		drop1.selectByVisibleText("Chennai");
		WebElement genre = driver.findElement(By.xpath("(//label[text()='Genre']/following::select)[1]"));
        Select drop2 = new Select(genre);
        drop2.selectByValue("{\"id\":46,\"name\":\"ANIMATION\"}");
        WebElement language = driver.findElement(By.xpath("(//label[text()='Language']/following::select)[1]"));
        Select drop3 = new Select(language);
        drop3.selectByIndex(1);
        driver.findElement(By.xpath("(//div[@class='form-group'])[4]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'movie')])[2]/img")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Thread.sleep(3000);
        WebElement cinema = driver.findElement(By.name("cinemaName"));
        Select mall = new Select(cinema);
        mall.selectByIndex(1);
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();       
        driver.findElement(By.xpath("//span[text()='July 2023']")).click();
        driver.findElement(By.xpath("//span[text()='6']")).click();    
        WebElement timings = driver.findElement(By.name("timings"));
        Select time = new Select(timings);
        time.selectByIndex(4);
        driver.findElement(By.name("noOfTickets")).sendKeys("3");
        driver.findElement(By.name("name")).sendKeys("Aji");
        driver.findElement(By.name("email")).sendKeys("ajichristilin@gmail.com");
        driver.findElement(By.name("mobile")).sendKeys("7695865490");
        WebElement food = driver.findElement(By.name("food"));
        Select FR = new Select(food);
        FR.selectByVisibleText("No");
        driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
        driver.findElement(By.xpath("//div[@class='form-group col-sm-6']/label")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("((//li[@style='margin-top: 15px;'])[3]//following::button[1])[1]")).click();
        driver.findElement(By.xpath("//button[text()='×']")).click();       
        System.out.println(driver.getTitle());             
        
	}
        
        
	}


