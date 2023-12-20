package basePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[@data-effect='mfp-move-from-top'][text()='Login'][1]")).click();
//		driver.findElement(By.xpath("//input[@id='social_login_email']")).clear();
//		driver.findElement(By.xpath("//input[@id='social_login_email']")).sendKeys("xyz@gmail.com");
	
		LoginPage lp=new LoginPage();
		
		lp.loginFun(driver, "xyz@gmail.com", "Madhuri@2504");
		
		
		
		
	}
	
	
	
	

}
