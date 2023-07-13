package week.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Respectivevalues {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int rowSize = row.size();
		System.out.println("Rowsize : " + rowSize);
		List<WebElement> col = table.findElements(By.tagName("td"));
		int colSize = col.size();
		System.out.println("Columnsize : " + colSize);
		/*List<WebElement> libraryNames = driver.findElements(By.xpath("//div[@class='render']/table//tbody/tr/td[1]"));
		for (int i = 0; i < libraryNames.size(); i++) {
			System.out.println(libraryNames.get(i).getText());
					}	*/	
		for (int j = 1; j <=4; j++) {			
			String text2 = driver.findElement(By.xpath("//div[@class='render']/table//tbody/tr[2]/td["+j+"]")).getText();
			System.out.println(text2);			
		}
									
		}
	
	}


	


