package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genrics.GenricMethods;

public class LoginPage {
	
	
	private By loginButton=By.xpath("//a[@data-effect='mfp-move-from-top'][text()='Login'][1]");
	private By uName=By.xpath("//input[@id='social_login_email']");
	private By pwd=By.xpath("//input[@id='social_login_pass'='password']");
	
	public void clickLoginButton(WebDriver driver)
	{
		GenricMethods gm=new GenricMethods();
		gm.clickElement(driver, loginButton);
		
		//driver.findElement(loginButton).click();
	}
	
	public void sendUname(WebDriver driver,String str)
	{
		driver.findElement(uName).sendKeys(str);
	}
	
	public void sendpwd(WebDriver driver,String str)
	{
		driver.findElement(pwd).sendKeys(str);
	}
	
	public void loginFun(WebDriver driver,String uname,String pwd)
	{
		clickLoginButton(driver);
		sendUname(driver,uname);
		sendpwd(driver,pwd);
	}
	

}
