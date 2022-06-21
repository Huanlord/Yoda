package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.Registerpage;
import pom_scripts.WelcomePage;
import pom_scripts.afterclickitemspage;
import pom_scripts.afterlogin;
import pom_scripts.hompage;
import pom_scripts.jewelery;

public class TestScript4 extends Base_Test {
	 
	@Test(dataProvider="testdata")
	public void testscript4(String email,String password)
	{
		WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(password);
		  lp.clickLoginButton();
		  hompage hp = new hompage(driver);
		  hp.jewelryClick();
		  jewelery jw = new jewelery(driver);
		  jw.clickblackandwhitediamond();
		  afterclickitemspage acip = new afterclickitemspage(driver);
		  acip.clickaddtowishlist();
		  acip.clickclosebutton();
		  afterlogin al = new afterlogin(driver);
		  al.clickwishlist();
		  al.checkaddtcart();
		  al.clickaddtocart();
		 
		 
	}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet 2");
		return testdata;

}
}
