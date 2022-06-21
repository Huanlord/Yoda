package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class computers extends BasePage{

	public computers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
     @FindBy(xpath="//img[@alt=\"Picture for category Desktops\"]")
     WebElement desktops;
     public void clickdesktops()
     {
    	 clickAction(desktops);
     }
     
     @FindBy(xpath="//img[@alt=\"Picture of Build your own computer\"]")
     WebElement buildyourowncomp;
     public void clickbuildyourowncomp()
     {
    	 clickAction(buildyourowncomp);
     }
     
     @FindBy(xpath="//input[@id=\"product_attribute_16_3_6_18\"]")
     WebElement gb320;
     public void click320gb()
     {
    	 clickAction(gb320);
     }
     @FindBy(xpath="//input[@id=\"add-to-cart-button-16\"]")
     WebElement byocaddtocart;
     public void clickbyoaddtocart()
     {
    	 clickAction(byocaddtocart);
     }
     
     @FindBy(xpath="//input[@id=\"product_attribute_16_8_8_22\"]")
     WebElement microsoftoffice;
     public void checkmsoffice()
     {
    	 clickAction(microsoftoffice);
     }
     @FindBy(xpath="//img[@alt=\"Picture of Desktop PC with CDRW\"]")
     WebElement desktopCDRW;
     public void clickdesktopCDRW()
     {
    	 clickAction(desktopCDRW);
     }
     @FindBy(xpath="//img[@alt=\"Picture of Elite Desktop PC\"]")
     WebElement elitedesktop;
     public void clickelitedesktop()
     {
    	 clickAction(elitedesktop);
     }
     
     @FindBy(xpath="//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000204_simple-computer_125.jpeg\"]")
     WebElement simplecomputer;
     public void clicksimplecomputer()
     {
    	 clickAction(simplecomputer);
     }
     @FindBy(xpath="//input[@id=\"add-to-cart-button-75\"]")
     WebElement simplecompaddtocart;
     public void clicksimplecompaddtocart()
     {
    	 clickAction(simplecompaddtocart);
     }
     
}
