package POM_GmailPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class Gmail_GoogleAppsPage {

WebDriver driver;
	
	public Gmail_GoogleAppsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Configuration.Google_apps_button)
	public WebElement mygoogleApps;
	
	@FindBy(name=Configuration.swich_to_frames)
	public WebElement mySwitchToFrame;
	
	@FindBy(partialLinkText=Configuration.Gmail_app)
	public WebElement myGmailApp;
	
	
	
	//Returning WebElements using Functions
	public WebElement getgoogleApps()
	{
		return mygoogleApps;
	}
	
	public WebElement getSwitchToFrame()
	{
		return mySwitchToFrame;
	}
	
	public WebElement getGmailApp()
	{
		return myGmailApp;
	}
	
	

	/*public void clickOnAddProfilePicture()
	{
		myAddProfilePicture.click();
	}
	
	*/
	
}
