package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week6.ReadExcel;



public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String fileName;
	public static ExtentReports extent;
	public static ExtentTest test1,node;
	public String testName,testDescription,testCategory,testAuthor;
    @BeforeSuite
    public void startReport() {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("reports/result.html");
        reporter.setAppendExisting(true);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }
    @BeforeClass
    public void testDetails() {
        test1= extent.createTest(testName,testDescription);
        test1.assignCategory(testCategory);
        test1.assignAuthor(testAuthor);
    }
    @AfterSuite
    public void stopReport() {
        extent.flush();
    }
    
    public void reportStep(String stepDesc, String status) throws IOException {
        
        if(status.equalsIgnoreCase("pass")) {
            node.pass(stepDesc, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
        }
        else if(status.equalsIgnoreCase("fail")) {
        	node.fail(stepDesc, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
        }
    }
    public int takeSnap() throws IOException {
        int  random = (int) (Math.random()*999999+100000);
        File source = driver.getScreenshotAs(OutputType.FILE);
        File desc =new File("snaps/img"+random+".png");// img1095493.png img 1234.png
        FileUtils.copyFile(source, desc);
        return random;       
   }
    
    
    @BeforeMethod
    public void launchBrowser() {
    	node = test1.createNode(testName);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
    @DataProvider(name="fetchData")
    public String[][] getData() throws IOException {
         String[][] readData = ReadExcel.readData(fileName);//ctrl+2+l    
        return readData;
        
    }

}
