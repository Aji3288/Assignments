package week29623;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("pills-home-tab")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//a[text()='30'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		WebElement name = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]"));			
	    System.out.println(name.getText());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[1]")).click();
	    Thread.sleep(3000);
	    WebElement seat = driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])[1]"));
	    System.out.println(seat.getText());
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();
		WebElement seatsSelected = driver.findElement(By.id("seatnos"));
		WebElement totalFare = driver.findElement(By.id("ticketfare"));
		System.out.println("SeatsSelected  = " + seatsSelected.getText() );
		System.out.println("TotalFare  =  " + totalFare.getText());
		WebElement boardingPoint = driver.findElement(By.id("boardingpoint_id"));
		Select BP = new Select(boardingPoint);
		BP.selectByIndex(4);
		WebElement droppingPoint = driver.findElement(By.id("droppingpoint_id"));
		Select DP = new Select(droppingPoint);
		DP.selectByVisibleText("Madiwala-05:15");
		System.out.println(driver.getTitle());
	    driver.close();					
		
	}

}
