package POM_Core;

import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import POM_Config.Configuration;
import POM_Util.TestConfig;
import POM_Util.monitoringMail;
import POM_Util.testUtil;

public class Test_CoreTest {
	
	public static WebDriver driver=null;
	public static Logger app_logs=Logger.getLogger("devpinoyLogger");
	
	@BeforeSuite
	public void init()
	{
		if(driver==null)
		{
			//Checking browser and launching according to it.
			app_logs.debug("Launching Browser");
			if(Configuration.browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}else if(Configuration.browser.equals("Edge"))
			{
				System.setProperty("webdriver.msedgedriver.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\edgedriver_win64\\msedgedriver");
				driver=new  EdgeDriver();
				
			}else if(Configuration.browser.equals("firefox"))
			{
				System.setProperty("webdriver.geckodriver.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
				driver=new  FirefoxDriver();
			}
			app_logs.debug("Url opening");
			driver.get(Configuration.testsite);
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	}
	
	@AfterSuite
	public void QuitDriver() throws InterruptedException, AddressException, MessagingException
	{
		Thread.sleep(4000);
		if(driver!=null)
			driver.close();
		testUtil.zip(System.getProperty("user.dir")+"\\screenshot\\");
		monitoringMail mail=new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
	}
}
