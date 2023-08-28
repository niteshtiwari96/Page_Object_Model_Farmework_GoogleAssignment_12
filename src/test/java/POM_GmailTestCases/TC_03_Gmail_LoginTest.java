package POM_GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Core.Test_CoreTest;
import POM_GmailPage.Gmail_LoginPage;
import POM_Util.testUtil;

public class TC_03_Gmail_LoginTest extends Test_CoreTest {
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("TC_03_Gmail_LoginTest"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
	}
	
	
	
	@Test(dataProvider="getData")
	public void doGmailLogin(String email,String pass) throws InterruptedException, IOException
	{
		try{
		Thread.sleep(6000);
		Gmail_LoginPage gLP=new Gmail_LoginPage(driver);
		app_logs.debug("Enter Username");
		gLP.getUsername().sendKeys(email);
		app_logs.debug("Click on user next button");
		gLP.getIDNextButton().click();
		app_logs.debug("Enter Password");
		gLP.getPassword().sendKeys(pass);
		app_logs.debug("Click on pass next button");
		gLP.getPasswordNextButton().click();
		
		}catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_03_Gmail_LoginTest");
			Assert.assertTrue(false, t.getMessage());
		}
	}
	
	
	@DataProvider
	public static Object[][] getData()
	{
		return testUtil.getData("TC_03_Gmail_LoginTest");
	}
}	
	