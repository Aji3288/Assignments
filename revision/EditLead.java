package week6.revision;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.testNG.BaseClassNG;



public class EditLead extends BaseClass{
	@BeforeTest
	public void setUp() {
		
		fileName = "EditLead";
	}
@Test(dataProvider = "fetchData")
	public  void runEditLead(String PhoneNumber,String CompanyName) throws InterruptedException {	
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.name("submitButton")).click();
		
}

/*
 * @DataProvider(name="fetchData") public String[][] getData() throws
 * IOException { String[][] readData = ReadExcel1.readData("EditLead"); return
 * readData;
 * 
 * }
 */
}






