package Myaccount_homepage_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MYaccount_homepage_login {
public MYaccount_homepage_login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);

}

	@FindBy(xpath = "//input[@id='txtloginid']")
	WebElement username;
	@FindBy(xpath = "//input[@id='txtpassword']")
	WebElement password;
	@FindBy(xpath = "//input[@id='BtnLogin']")
	WebElement button;
	public void Myaccounts(String keyword) {
		username.sendKeys(keyword);
		password.sendKeys(keyword);
		button.click();
	}
	
	
	
	
	
	
}
	
	
	

