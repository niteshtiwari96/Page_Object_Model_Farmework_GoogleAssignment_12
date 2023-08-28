package POM_GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Core.Test_CoreTest;
import POM_GmailPage.Gmail_GoogleAppsPage;
import POM_Util.testUtil;

public class TC_01_GoogleAppsPageTest extends Test_CoreTest {
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("TC_01_GoogleAppsPageTest"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
		
	}
	
	@Test
	public void doGoogleApps() throws IOException
	{
		try{
			Thread.sleep(3000);
			Gmail_GoogleAppsPage gAP=new Gmail_GoogleAppsPage(driver);
			app_logs.debug("Click on google Apps");
			gAP.getgoogleApps().click();
			gAP.getSwitchToFrame();
			app_logs.debug("Click on Gmail Apps");
			gAP.getGmailApp().click();
		
		
		}catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_01_GoogleAppsPageTest");
			Assert.assertTrue(false, t.getMessage());
		}
	}
}
