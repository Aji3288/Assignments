package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage(ChromeDriver driver) {
        this.driver=driver;
    }
	
    public CreateLeadPage enterCompanyName(String companyname) {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
        return this;
        
    }
    public CreateLeadPage enterFirstName(String firstname) {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
        return this;
        
    }
    public CreateLeadPage enterLastName(String lastname) {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
        return this;
    }
    public ViewLeadPage ClickCreateLeadButton() {
        driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
    }
}
