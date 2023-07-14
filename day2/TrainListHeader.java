package week.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainListHeader {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).click();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).click();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]"));
		List<WebElement> tableHead = table.findElements(By.tagName("th"));
		int headerSize = tableHead.size();
		System.out.println("TableHeadCount : " + headerSize);	
		List<WebElement> column = driver.findElements(By.tagName("td"));
		int colSize = column.size();
		System.out.println("ColumnCount : " + colSize);
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowSize = rows.size();
		System.out.println("Train Rows : "+ rowSize);
		driver.findElement(By.linkText("Train Name")).click();
		List<WebElement> tnames = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr//td[2]"));
		List<String> lst = new ArrayList<String>();
			for (int i = 1; i <rowSize-1; i++) {
			String names = tnames.get(i).getText();
			lst.add(names);
		Set<String> removedup = new LinkedHashSet<String>(lst);
		int setsize = removedup.size();
		System.out.println(setsize);
		if (rowSize == setsize) {
			System.out.println("duplicate");
		} else {
			System.out.println("No duplicate");
		} 
		System.out.println(lst);
		System.out.println(removedup);

		}
			
	}	
	}


