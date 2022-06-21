package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.afterlogin;
import pom_scripts.apparals;
import pom_scripts.hompage;

public class TestScript16 extends Base_Test{
	@Test
	public void testscript16()
	{
	    hompage hp = new hompage(driver);
	    hp.apparalsClick();
	    apparals ap = new apparals(driver);
	    ap.clickpolkadot();
	    ap.clickpolkadotaddtocart();
	    afterlogin al = new afterlogin(driver);
	    al.clickshoppingcart();
	}
	
	

}
