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

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro" );
        driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        String text = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']//span)[1]")).getText();
        System.out.println("Price : " + text);
        WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
        String text2 = ratings.getText();
        System.out.println("Customer ratings : " + text2);
        driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-star-small')])[1]")).click();
        String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]")).getText();
        System.out.println("5 star ratings : " + text3);
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List <String> list = new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));
        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        File location = new File("./snap/Amazon.png");
        FileUtils.copyFile(screenshotAs, location);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("(//span[text()=' There was a problem retrieving the contents of your cart. ']/following::input)[1]")).click();
        String text4 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]")).getText();
        System.out.println("Cart subtotal is : " + text4);            
                 
	}

}
