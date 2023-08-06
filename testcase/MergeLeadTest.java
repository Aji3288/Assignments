package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setUp() {
		fileName = "MergeLead";
		testName="MergeLead Test";
        testDescription="MergeLead application";
        testCategory ="MergeLead Functional";
        testAuthor ="Aji Christilin P C";
	}
	
	@Test(dataProvider = "fetchData")		
	public void runMergeLead(String username,String password) throws InterruptedException, IOException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUserName(username)
        .enterPassword(password)
        .clickLogin()
        .clickCRMSFA()
        .clickLeads() 
        .clickMergeLead()
        .clickFromLead()
        .enterFirstName()
        .clickFindLeads()
        .gettextLeadID()
        .clickLeadID()
        .clickToLead()
        .enterFirstName1()
        .clickFindLeads1()
        .clickLeadID1()
        .clickMerge()
        .clickFindLead()
        .enterLeadId()
        .clickFindLeads2()
        .gettextLead();
		
	}

}
