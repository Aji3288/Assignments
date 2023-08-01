package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
    public WelcomePage(ChromeDriver driver) {		
    	this.driver = driver;
	}
	public MyHomePage clickCRMSFA(){
    driver.findElement(By.linkText("CRM/SFA")).click();
    return new MyHomePage(driver);
    
}
    public void clickLogOut() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }
    
}
