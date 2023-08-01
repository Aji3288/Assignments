package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage(ChromeDriver driver) {
        this.driver=driver;
    }
	
    public CreateLeadPage enterCompanyName() {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        return this;
        
    }
    public CreateLeadPage enterFirstName() {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aji");
        return this;
        
    }
    public CreateLeadPage enterLastName() {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Christilin");
        return this;
    }
    public ViewLeadPage ClickCreateLeadButton() {
        driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
    }
}
