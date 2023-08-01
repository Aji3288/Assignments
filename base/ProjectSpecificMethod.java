package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class ProjectSpecificMethod {
	public ChromeDriver driver;
	
    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

}
