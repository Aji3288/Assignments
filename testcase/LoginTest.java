package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		fileName = "Login";
		testName="Login Test";
        testDescription="LeafTap application Login";
        testCategory ="Smoke";
        testAuthor ="Aji";
	}
    @Test(dataProvider = "fetchData")
    public void runLogin(String username,String password) throws IOException {
        System.out.println(driver);
        LoginPage lp =new LoginPage(driver);
        lp.enterUserName(username)
        .enterPassword(password)
        .clickLogin();
    }
}

