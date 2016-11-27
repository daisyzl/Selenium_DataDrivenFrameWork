package cn.gloryroad.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.gloryroad.util.ObjectMap;

public class LoginPage {
private WebElement  element=null;
private ObjectMap objectMap=new ObjectMap("C:\\Users\\ZHANGLU\\DataDrivenFrameWork\\objectMap.properties");
private WebDriver driver;

public LoginPage(WebDriver driver){
	this.driver=driver;
}
public WebElement userName() throws Exception{
	element=driver.findElement(objectMap.getLocator("163mail.loginPage.username"));
	return element;
}
public WebElement passWord() throws Exception{
	element=driver.findElement(objectMap.getLocator("163mail.loginPage.password"));
	return element;
}
public WebElement loginButton() throws Exception{
	element=driver.findElement(objectMap.getLocator("163mail.loginPage.loginbutton"));
	return element;
}

}
