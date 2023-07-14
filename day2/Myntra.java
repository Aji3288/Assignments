package week.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver  driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement smooth = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(smooth).perform();
        driver.findElement(By.xpath("(//div[@class='desktop-backdropStyle']//li/ul/li[7])[1]")).click();
        String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
        System.out.println("Total count of " + text);
        String text2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
        System.out.println("Categories count of - " + text2);
        driver.findElement(By.xpath("(//label[contains(@class,'common')])[1]")).click();
        driver.findElement(By.xpath("//div[@class='brand-more']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/div[3]/div[2]/ul/li[2]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click(); 
        List<WebElement> duke = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']//h3"));
        for (int i = 0; i < duke.size(); i++) {
			
        	String brandName = duke.get(i).getText();
        	
        	if (brandName.contains("Duke")) {
        		
        		System.out.println("All Brand Name Verifyed");
			}
        	
        	else {
				
        		System.out.println("Brand Name Not Verifyed");
			}
		}
        
        WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(sort).perform();
        driver.findElement(By.xpath("(//label[@class='sort-label '])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='results-base']/li[1]//img")).click();
       Set<String> windowHandles = driver.getWindowHandles();
       List<String> window = new ArrayList <String> (windowHandles);
       driver.switchTo().window(window.get(1));
       File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
       File locations = new File ("./snap/Myntra.png");
       FileUtils.copyFile(screenshotAs, locations);
       driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[2]/span[2]")).click();
       driver.quit();                           
	}
}
                               
        
        
