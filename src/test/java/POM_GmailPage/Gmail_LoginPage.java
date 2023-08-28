package POM_GmailPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class Gmail_LoginPage {
	
WebDriver driver;
	
	public Gmail_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=Configuration.Email_ID)
	public WebElement myUsername;
	
	@FindBy(xpath=Configuration.ID_Next_Button)
	public WebElement myIDNextButton;
	
	@FindBy(xpath=Configuration.Password)
	public WebElement myPassword;
	
	@FindBy(xpath=Configuration.Password_Next_Button)
	public WebElement myPasswordNextButton;
	
	
	//Returning WebElements using Functions
	public WebElement getUsername()
	{
		return myUsername;
	}
	
	public WebElement getIDNextButton()
	{
		return myIDNextButton;
	}
	
	public WebElement getPassword()
	{
		return myPassword;
	}
	
	public WebElement getPasswordNextButton()
	{
		return myPasswordNextButton;
	}
	

}
