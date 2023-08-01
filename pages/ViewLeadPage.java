package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	public ViewLeadPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public ViewLeadPage verifyFirstName() {
        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        System.out.println(text);
        if(text.contains("Aji")) {
            System.out.println("Lead is Created");
        }
        else {
            System.out.println("Lead is not created");
        }
        return this;
    }
    public EditLeadPage clickEdit() {
    	driver.findElement(By.linkText("Edit")).click();
    	return new EditLeadPage(driver);
    }
    public ViewLeadPage verifyCompanyName() {
        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(text);
        if(text.contains("TCS")) {
            System.out.println("CompanyName is Created");
        }
        else {
            System.out.println("CompanyName is not created");
        }
        return this;
}
}
