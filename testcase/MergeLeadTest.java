package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificMethod {	
	@Test		
	public void runMergeLead() throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUserName()
        .enterPassword()
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
