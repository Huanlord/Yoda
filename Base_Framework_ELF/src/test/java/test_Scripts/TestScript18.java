package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;
import pom_scripts.afterlogin;
import pom_scripts.computers;
import pom_scripts.hompage;

public class TestScript18 extends Base_Test{
	
	@Test(dataProvider="testdata")
	public void testscript18(String email,String password)
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.enterValueInEmail(email);
		lp.enterValueInPwd(password);
		lp.clickLoginButton();
		hompage hp = new hompage(driver);
		hp.computersClick();
		computers cp = new computers(driver);
		cp.clickdesktops();
		cp.clickdesktopCDRW();
		test.log(LogStatus.INFO, "user is not able to add to cart");
		
	}
	@DataProvider(name = "testdata")
  	public Object[][] getTestData() throws IOException {
  		Object [][]testdata=ReadExcel.getMultipleData("Sheet 5");
  		return testdata;

}
	
}