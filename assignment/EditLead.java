package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("firstName")).sendKeys("Aji");
        driver.findElement(By.linkText("Find Leads")).click();	
        driver.findElement(By.linkText("10264")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
        driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
        driver.close();
       
	}

}
