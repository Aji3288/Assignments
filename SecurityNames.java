package week.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecurityNames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'table table-bordered')])[1]"));
		List<WebElement> row = table.findElements(By.xpath
				("(//table[contains(@class,'table table-bordered')])[1]//tbody/tr/td[1]"));
		int size = row.size();
		System.out.println(size);		
		for (int i = 0; i < row.size(); i++) {
			String text = row.get(i).getText();
			System.out.println(text);
		}
			Set<String> removedup = new LinkedHashSet<String>();
		int setsize = removedup.size();
		System.out.println(setsize);
		if (size == setsize) {
			System.out.println("duplicate");// 
		} else {
			System.out.println("No duplicate");
		} 
		

	}

}
