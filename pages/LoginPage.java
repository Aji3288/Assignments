package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
		
	public LoginPage(ChromeDriver driver) {
        this.driver=driver;
    }
	
    public LoginPage enterUserName(String uname) throws IOException {
        
        try {
            driver.findElement(By.id("username")).sendKeys(uname);
            reportStep(uname+"Username Entered Sucessfully","pass");
        } catch (Exception e) {
            reportStep(uname+"Username Not Entered"+e,"fail");
        }
        
        return this;
       }
    
    public LoginPage enterPassword(String pwd) throws IOException {
    try {
        driver.findElement(By.id("password")).sendKeys(pwd);
        reportStep(pwd+"Password Entered Sucessfully","pass");
    } catch (Exception e) {
        reportStep(pwd+"Password Not Entered"+e,"fail");
    }
    return this;
    }
    
    public WelcomePage clickLogin() throws IOException {
    try {
        driver.findElement(By.className("decorativeSubmit")).click();
        reportStep("Login Button Sucessfully","pass");
    } catch (Exception e) {
        reportStep("Login Button Not clicked"+e,"fail");
    }
    return new WelcomePage(driver);
}
}
    
