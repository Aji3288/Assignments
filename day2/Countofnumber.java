package week.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countofnumber {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		WebElement table = driver.findElement(By.xpath("//table[@class='attributes-list']"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int size = row.size();
		System.out.println("Row Size : " + size );
		List<WebElement> column = table.findElements(By.tagName("td"));
		int Csize = column.size();
		System.out.println("Column Size : " + Csize );

	}

}
