package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setUp() {
		fileName = "Createlead";
		testName="Createlead Test";
        testDescription="LeafTap application";
        testCategory ="Functional";
        testAuthor ="Christilin";
	}
	
    @Test(dataProvider = "fetchData")
    public void runCreateLead(String username,String password, String companyname,String firstname, String lastname) throws IOException {
        LoginPage lp =new LoginPage(driver);
        lp.enterUserName(username)
        .enterPassword(password)
        .clickLogin()
        .clickCRMSFA()
        .clickLeads()     
        .clickCreateLead()
        .enterCompanyName(companyname)
        .enterFirstName(firstname)
        .enterLastName(lastname)
        .ClickCreateLeadButton()
        .verifyFirstName();
    }
    
    
    
}

