package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {
	
	public FindLeadPage(ChromeDriver driver) {
		this.driver = driver;		
	}
	public FindLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	public FindLeadPage clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public ViewLeadPage clickLeadList() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		return new ViewLeadPage(driver);			
	}
	public FindLeadPage enterFirstName() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aji");
		return this;
	}
	public FindLeadPage clickFindLeads() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public FindLeadPage gettextLeadID() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(leadID);
		return this;
	}
	public MergeLeadPage clickLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);
	}
	public FindLeadPage enterFirstName1() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Princila");
		return this;
	}
	public FindLeadPage clickFindLeads1() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;	
	}
	public MergeLeadPage clickLeadID1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);		
	}
	public FindLeadPage enterLeadId() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public FindLeadPage clickFindLeads2() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public FindLeadPage gettextLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}	
	
	
}
