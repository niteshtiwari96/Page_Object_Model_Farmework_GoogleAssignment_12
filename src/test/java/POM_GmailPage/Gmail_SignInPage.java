package POM_GmailPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class Gmail_SignInPage {
	
    WebDriver driver;
	
	public Gmail_SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Configuration.Sign)
	public WebElement myGmailSignIn;
	

	public WebElement getGmailSignIn()
	{
		 return myGmailSignIn;
	}
}
