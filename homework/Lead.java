package week2.day1.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demosalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.partialLinkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aji");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Christilin");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aji");
	    driver.findElement(By.name("departmentName")).sendKeys("Testing");
	    driver.findElement(By.name("description")).sendKeys("Senior Officer");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajichristilin@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println(driver.getTitle());	 
	    	   

}

}
