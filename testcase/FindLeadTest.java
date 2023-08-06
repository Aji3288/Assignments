package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class FindLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setUp() {
		fileName = "Findlead";
		testName="Findlead Test";
        testDescription="Findlead application";
        testCategory ="Findlead Functional";
        testAuthor ="Christilin P C";
	}
	
	@Test(dataProvider = "fetchData")
	public void runFindLead(String username,String password,String phonenumber,String companyname) throws InterruptedException, IOException {
		LoginPage find = new LoginPage(driver);
		find.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.enterPhoneNumber(phonenumber)
		.clickFindLead()
		.clickLeadList()
		.clickEdit()
		.clearCompanyName()
		.enterCompanyName(companyname)
		.clickUpdateButton()
		.verifyCompanyName();				
	}

}
