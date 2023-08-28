package POM_GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_Core.Test_CoreTest;
import POM_GmailPage.Gmail_VerifyInboxPage;
import POM_Util.testUtil;

public class TC_04_Gmail_VerifyReadAndUnreadInbox_Test extends Test_CoreTest{
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("TC_04_Gmail_VerifyReadAndUnreadInbox_Test"))
		{
			throw new SkipException("Skipping testcase as runmode is set to No");
		}
	}
	
	
	
	@Test
	public void doGmailInboxCountVerify() throws InterruptedException, IOException
	{
		try{
		Thread.sleep(6000);
		Gmail_VerifyInboxPage vIP=new Gmail_VerifyInboxPage(driver);
		app_logs.debug("count Unread emails in an INBOX");
		System.out.println("************count Unread emails in an INBOX********************");
		System.out.println("count Unread emails in an INBOX : "+vIP.myUnreadSection.size());
		for(int i=0;i<vIP.myUnreadSection.size();i++)
	    {
	    	System.out.println(vIP.myUnreadSection.get(i).getText());
	    }
		app_logs.debug("count read emails in an INBOX");
		System.out.println("************count read emails in an INBOX********************");
		System.out.println("count read emails1 in an INBOX : "+vIP.myReadSection1.size());
		for(int i=0;i<vIP.myReadSection1.size();i++)
	    {
	    	System.out.println(vIP.myReadSection1.get(i).getText());
	    }
		System.out.println("count read emails2 in an INBOX : "+vIP.myReadSection2.size());
		for(int i=0;i<vIP.myReadSection2.size();i++)
	    {
	    	System.out.println(vIP.myReadSection2.get(i).getText());
	    }
		
		int ReadCount=vIP.myReadSection1.size()+vIP.myReadSection2.size();
	    System.out.println("Total Read Mail in INBOX : "+ReadCount);
		
		
		}catch(Throwable t)
		{
			testUtil.captureScreenshot("TC_04_Gmail_VerifyReadAndUnreadInbox_Test");
			Assert.assertTrue(false, t.getMessage());
		}
	}

}
