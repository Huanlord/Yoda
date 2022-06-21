package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;
import pom_scripts.books;
import pom_scripts.hompage;

public class TestScript5 extends Base_Test {
	
	@Test(dataProvider="testdata")
	public void testscript5(String email,String password)
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.enterValueInEmail(email);
		lp.enterValueInPwd(password);
		lp.clickLoginButton();
		test.log(LogStatus.INFO, "User is logged in");
		hompage hp = new hompage(driver);
		hp.booksClick();
	    books bks = new books(driver);
	    bks.selectcreateon();
		
	}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet 6");
		return testdata;

}
}
