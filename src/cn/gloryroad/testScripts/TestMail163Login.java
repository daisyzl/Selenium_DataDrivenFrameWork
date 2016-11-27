package cn.gloryroad.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.gloryroad.appModules.Login_Action;

public class TestMail163Login {
	public WebDriver driver;
	String baseUrl="https://mail.163.com/";
  @Test
  public void testMailLogin() throws Exception {
	  Login_Action.execute(driver, "zhanglu07zl", "@_@dream0712");
	  //业务逻辑的封装
	  Thread.sleep(5000);
	  Assert.assertTrue(driver.getPageSource().contains("未读邮件"));
	  
	  
  }
	@BeforeMethod
	public void beforeMethod(){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod 
	public void afterMethod(){
		//driver.quit();
		
	}

}
