package cn.gloryroad.appModules;

import org.openqa.selenium.WebDriver;

import cn.gloryroad.pageObjects.LoginPage;

public class Login_Action {
	public static void execute(WebDriver driver,String userName,String passWord) throws Exception{
		  driver.get("http://mail.163.com");
		  driver.switchTo().frame("x-URS-iframe");
		  LoginPage loginPage=new LoginPage(driver);	
		  loginPage.userName().sendKeys(userName);
		  loginPage.passWord().sendKeys(passWord);
		  loginPage.loginButton().click();
		  Thread.sleep(5000);
		
	}
}
