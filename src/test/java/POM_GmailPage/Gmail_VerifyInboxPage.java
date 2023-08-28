package POM_GmailPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class Gmail_VerifyInboxPage {

    WebDriver driver;
	
	public Gmail_VerifyInboxPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Configuration.unreadSection)
	public List<WebElement> myUnreadSection;
	
	@FindBy(xpath=Configuration.readSection1)
	public List<WebElement> myReadSection1;
	
	@FindBy(xpath=Configuration.readSection2)
	public List<WebElement> myReadSection2;

	public List<WebElement> getUnreadSection()
	{
		 return myUnreadSection;
	}
	
	public List<WebElement> getReadSection1()
	{
		 return myReadSection1;
	}
	
	public List<WebElement> getReadSection2()
	{
		 return myReadSection2;
	}
	
}
