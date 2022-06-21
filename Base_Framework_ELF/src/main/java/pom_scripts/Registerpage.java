package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends BasePage{

	public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   
	@FindBy(xpath="//input[@value='M']")
	WebElement malecheckbox;
	public void clickmalecheckbox()
	{
		clickAction(malecheckbox);
	}
	
	@FindBy(xpath="//input[@value='F']")
	WebElement femalecheckbox;
	public void clickfemalecheckbox()
	{
	     clickAction(femalecheckbox);	
	}
	 
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement firstname;
	public void enterfnamevalue(String fname)
	{
		enter_value(firstname, fname);
	}
	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement lastname;
	public void enterlnamevalue(String lname)
	{
		enter_value(lastname, lname);
	}
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement Email;
	public void enteremailvalue(String email)
	{
		enter_value(Email, email);
	}
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password;
	public void enterpassword(String pwd)
	{
		enter_value(password, pwd);
	}
	
	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement confirmpassword;
	public void enterconfirmpassword(String pwd)
	{
		enter_value(confirmpassword, pwd);
	}
	
	@FindBy(xpath="//input[@name='register-button']")
	WebElement registerbutton;
	public void Clickregbutton()
	{
		clickAction(registerbutton);
	}
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	WebElement continuebutton;
	public void clickcontinuebutton()
	{
		clickAction(continuebutton);
	}
	

}
