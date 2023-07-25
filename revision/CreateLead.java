package week6.revision;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.testNG.BaseClassNG;


public class CreateLead extends BaseClass {
	@BeforeTest
	public void setUp() {
		
		fileName = "CreateLead";
	}
	 @Test(dataProvider = "fetchData")
	    public void runCreateLead(String CompanyName,String FirstName,String LastName,String PhoneNumber) {
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
	        driver.findElement(By.name("submitButton")).click();
	    }
		/*
		 * @DataProvider(name="fetchData") public String[][] getData() throws
		 * IOException { String[][] readData = ReadExcel1.readData("CreateLead"); return
		 * readData; }
		 */

}






