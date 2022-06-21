package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class books extends BasePage{

	public books(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//option[text()='Created on']")
	WebElement createdon;
	public void selectcreateon()
	{
		clickAction(createdon);
	}
	

}
