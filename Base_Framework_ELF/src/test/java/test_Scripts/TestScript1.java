package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Registerpage;
import pom_scripts.WelcomePage;

public class TestScript1 extends Base_Test {
	
	@Test(dataProvider="testdata")
	public void testscript1(String fname,String lname,String email,String password)
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.clickRegister();
		Registerpage rp = new Registerpage(driver);
		rp.clickmalecheckbox();
		rp.enterfnamevalue(fname);
		rp.enterlnamevalue(lname);
		rp.enteremailvalue(email);
		rp.enterpassword(password);
		rp.enterconfirmpassword(password);
		rp.Clickregbutton();
		
	}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet 1");
		return testdata;
	}

	

}
