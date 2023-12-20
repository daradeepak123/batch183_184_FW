package genrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenricMethods {
	
	
	
	public String readFromPropFile(String path,String value) throws IOException
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		
		Properties pro=new Properties();
		pro.load(fis);
		
		String data=pro.getProperty(value);
		
		return data;
	}
	
	
	
	public void getURL(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	
	public void clickElement(WebDriver driver,By ele)
	{
		WebElement elee=driver.findElement(ele);
		if(elee.isDisplayed() && elee.isEnabled())
		{
			try
			{
			elee.click();
			}
			catch(NoSuchElementException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	

}
