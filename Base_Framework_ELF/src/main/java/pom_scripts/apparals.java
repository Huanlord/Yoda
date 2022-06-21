package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class apparals extends BasePage{

	public apparals(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000018_50s-rockabilly-polka-dot-top-jr-plus-size_125.jpg\"]")
	WebElement pokadot;
	public void  clickpolkadot()
	{
		clickAction(pokadot);
	}
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button-5\"]")
	WebElement polkadotaddtocart;
	public void clickpolkadotaddtocart()
	{
		clickAction(polkadotaddtocart);
	}
	

}
