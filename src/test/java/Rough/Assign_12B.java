package Rough;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_12B {
	/*
	 * 12B.  To verify and count read emails in an INBOX
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Gmail app
		driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		WebElement f5=driver.findElement(By.name("app"));//name="app"
		driver.switchTo().frame(f5);
		driver.findElement(By.partialLinkText("Gmai")).click();
		Thread.sleep(3000);
		
		WebElement sign=driver.findElement(By.linkText("Sign in"));
		sign.click();
		
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("nittiw63@gmail.com");
		
		WebElement userNextButton=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
		userNextButton.click();
		
		WebElement Password=driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		Password.sendKeys("blu3@T0p");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
		
		Thread.sleep(2000);
		List<WebElement> option1=driver.findElements(By.xpath("//tr[@class='zA yO']"));
	    System.out.println("count read1 emails in an INBOX : "+option1.size());
	    
	    for(int i=1;i<option1.size();i++)
	    {
	    	System.out.println(option1.get(i).getText());
	    }
	    
	    //tr[@class='zA yO byw']
	    List<WebElement> option2=driver.findElements(By.xpath("//tr[@class='zA yO byw']"));
	    System.out.println("count read2 emails in an INBOX : "+option2.size());
	    
	    for(int i=1;i<option2.size();i++)
	    {
	    	System.out.println(option2.get(i).getText());
	    }
	    
	    int ReadCount=option1.size()+option2.size();
	    System.out.println("Total Read Mail in INBOX : "+ReadCount);
    }			  
}


