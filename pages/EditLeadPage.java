package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod {
	public EditLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
	public EditLeadPage clearCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	public EditLeadPage enterCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}
