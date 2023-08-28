package POM_GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Core.Test_CoreTest;
import POM_GmailPage.Gmail_SignInPage;
import POM_Util.testUtil;

public class TC_02_ClickOnSignInButton extends Test_CoreTest {
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("TC_02_ClickOnSignInButton"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
	}
	
	@Test
	public void doClickOnSignIn() throws IOException
	{
		try{
			Thread.sleep(6000);
			Gmail_SignInPage gSIP=new Gmail_SignInPage(driver);
			app_logs.debug("Click on Gmail SignIn Button");
			gSIP.getGmailSignIn().click();
		
		}catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_02_ClickOnSignInButton");
			Assert.assertTrue(false, t.getMessage());
		}
	}

}
