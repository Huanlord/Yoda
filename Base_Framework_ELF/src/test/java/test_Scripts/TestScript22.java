package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript22 extends Base_Test{
	@Test(dataProvider="testdata")
	public void testscript21(String email,String password)
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.enterValueInEmail(email);
		lp.enterValueInPwd(password);
		lp.clickLoginButton();
	}
	@DataProvider(name = "testdata")
  	public Object[][] getTestData() throws IOException {
  		Object [][]testdata=ReadExcel.getMultipleData("Sheet 7");
  		return testdata;
	}

}
