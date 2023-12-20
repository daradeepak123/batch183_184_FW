package basePackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import genrics.BrowserChoice;
import genrics.GenricMethods;

public class BaseClass {
	
	private static String path=System.getProperty("user.dir")+"//src//main//resources//config.properties";
	private static String browser=null;
	public GenricMethods gm=new GenricMethods();
	public static WebDriver driver=null;
	private static String url=null;
	@BeforeSuite
	public void suiteSetUp() throws IOException
	{
		browser=gm.readFromPropFile(path, "browser");
	}
	
	@BeforeTest
	public void browserSetUP() throws IOException
	{
		BrowserChoice b=new BrowserChoice();
		
		driver=b.browserCHoice(path,"browser");
		
	}
	
	@BeforeClass
	public void urlSetUP() throws IOException
	{
		
		url=gm.readFromPropFile(path, "site");
		
		gm.getURL(driver, url);
		
		
		
	}
	

	
	
	

}
