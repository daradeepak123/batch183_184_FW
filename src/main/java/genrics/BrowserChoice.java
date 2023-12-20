package genrics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserChoice {

	private static String path=System.getProperty("user.dir")+"//src//main//resources//config.properties";
	private static String browser=null;
	static WebDriver driver=null;
	public GenricMethods gm=new GenricMethods();
	
	
	public WebDriver browserCHoice(String path, String browser) throws IOException
	{
		
	browser=gm.readFromPropFile(path, "browser");
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("ff"))
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	
	
	
	return driver;
		
		
	}

}
