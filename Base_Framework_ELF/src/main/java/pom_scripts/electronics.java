package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class electronics extends BasePage {

	public electronics(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//img[@alt=\"Picture for category Camera, photo\"]")
     WebElement cameraphoto;
	 public void clickcameraphoto()
	 {
		 clickAction(cameraphoto);
	 }
	 
	 @FindBy(xpath="//img[@alt=\"Picture of 1MP 60GB Hard Drive Handycam Camcorder\"]")
	 WebElement Handycam;
	 public void click1mpHandycam()
	 {
		 clickAction(Handycam);
	 }
	 
	 @FindBy(xpath="//input[@value=\"Add to compare list\"]")
	 WebElement addtocomparelist;
	 public void clickaddtocomparelist()
	 {
		 clickAction(addtocomparelist);
	 }
	 
	 @FindBy(xpath="//input[@value=\"Email a friend\"]")
	 WebElement emailafriend;
	 public void clickemailafriend()
	 {
		 clickAction(emailafriend);
	 }
	 
	 @FindBy(xpath="//img[@alt=\"Picture for category Cell phones\"]")
	 WebElement cellphones;
	 public void clickcellphones()
	 {
	     clickAction(cellphones);	 
	 }
	 
	 @FindBy(xpath="//img[@alt='Picture of Smartphone']")
	 WebElement smartphone;
	 public void clicksmartphone()
	 {
		 clickAction(smartphone);
	 }
	 
	 @FindBy(xpath="//input[@id=\"add-to-cart-button-43\"]")
	 WebElement smartphoneaddtocart;
	 public void clicksmartphoneaddtocart()
	 {
		 clickAction(smartphoneaddtocart);
	 }
	 @FindBy(xpath="//input[@id=\"add-to-wishlist-button-43\"]")
	 WebElement smartphoneaddtowishlist;
	 public void clicksmartphoneaddtowishlist()
	 {
		 clickAction(smartphoneaddtowishlist);
	 }
}
