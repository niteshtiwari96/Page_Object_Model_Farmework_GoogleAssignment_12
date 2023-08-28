package POM_Config;
//12.  To verify the total no. of emails marked with STAR
public class Configuration {
	
	//Testsite
	public static final String testsite="https://www.google.co.in/";
	//Browser
	public static final String browser="chrome";
	
	//Gmail GoogleApps Page
	
	public static final String Google_apps_button="//*[@id='gbwa']";
	public static final String swich_to_frames="app";
	public static final String Gmail_app="Gmai";
	
	//Gmail LoginPage
	public static final String Sign="//*[@data-action='sign in']";
	public static final String Email_ID="identifierId";
	public static final String ID_Next_Button="//*[@id='identifierNext']/div/button/span";
	public static final String Password="//*[@id='password']/div[1]/div/div[1]/input";
	public static final String Password_Next_Button="//*[@id='passwordNext']/div/button/span";
		
	// Locate and get the count of unread emails
	public static final String unreadSection="//tr[@class='zA zE']";
	// Locate and get the count of read emails
	public static final String readSection1="//tr[@class='zA yO']";
	public static final String readSection2="//tr[@class='zA yO byw']";
}
