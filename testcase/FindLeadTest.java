package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class FindLeadTest extends ProjectSpecificMethod {
	
	@Test
	public void runFindLead() throws InterruptedException {
		LoginPage find = new LoginPage(driver);
		find.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhone()
		.enterPhoneNumber()
		.clickFindLead()
		.clickLeadList()
		.clickEdit()
		.clearCompanyName()
		.enterCompanyName()
		.clickUpdateButton()
		.verifyCompanyName();				
	}

}
