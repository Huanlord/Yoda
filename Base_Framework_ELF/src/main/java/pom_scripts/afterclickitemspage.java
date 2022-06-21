package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class afterclickitemspage extends BasePage {

	public afterclickitemspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath=  "//input[contains(@class,'qty')]")
	WebElement qtyinput;
	public void clearqtyinput()
	{
		qtyinput.clear();
	}
	
	@FindBy(xpath=  "//input[contains(@class,'qty')]")
	WebElement enterqty;
	public void enterqtyinput(String qty)
	{
		enter_value(enterqty, qty);
	}
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button-14\"]")
	WebElement addtocrt;
	public void clickaddtocrt()
	{
		clickAction(addtocrt);
	}
	@FindBy(xpath="//span[@title='Close']")
	WebElement closebutton;
	public void clickclosebutton()
	{
		clickAction(closebutton);
	}
    @FindBy(xpath="//input[@value=\"Add to wishlist\"]")
    WebElement addtowishlist;
    public void clickaddtowishlist()
    {
    	clickAction(addtowishlist);
    }
    
	
	
	
	
	

}
