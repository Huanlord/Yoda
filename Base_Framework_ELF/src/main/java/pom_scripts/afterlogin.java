package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class afterlogin extends BasePage {

	public afterlogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shoppingcart;
	public void clickshoppingcart()
	{
		clickAction(shoppingcart);
	}
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement wishlist;
	public void clickwishlist()
	{
		clickAction(wishlist);
	}
	@FindBy(xpath="//input[@name='addtocart']")
    WebElement checkaddtocart;
    public void checkaddtcart()
    {
    	clickAction(checkaddtocart);
    }
    @FindBy(xpath="//input[@name='addtocartbutton']")
    WebElement addtocrt;
    public void clickaddtocart()
    {
    	clickAction(addtocrt);
    }
    
    @FindBy(xpath= "//input[@name=\"updatecart\"]")
    WebElement updatecart;
    public void clickupdatecart()
    {
    	clickAction(updatecart);
    }
	
}
