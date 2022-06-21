package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		super(driver);
	}
	
	@FindBy(className  ="email")
	WebElement emailTF;
	public void enterValueInEmail(String email) {
		
		enter_value(emailTF, email);
	}
	
	@FindBy(className = "password")
	WebElement pwdTF;
	public void enterValueInPwd(String pwd) {
		enter_value(pwdTF, pwd);
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement LoginButton;
	public void clickLoginButton() {
		clickAction(LoginButton);
	}

}
