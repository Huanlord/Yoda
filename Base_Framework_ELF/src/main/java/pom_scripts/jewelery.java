package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class jewelery extends BasePage {

	public jewelery(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//img[@alt=\"Picture of Black & White Diamond Heart\"]")
	WebElement blackandwhitediamondheart;
	public void clickblackandwhitediamond()
	{
		clickAction(blackandwhitediamondheart);
	}
	
	@FindBy(xpath="//img[@alt=\"Picture of Create Your Own Jewelry\"]")
	WebElement createyourownjewel;
	public void clickcreateyourwonjewel()
	{
		clickAction(createyourownjewel);
	}
	

	
}
