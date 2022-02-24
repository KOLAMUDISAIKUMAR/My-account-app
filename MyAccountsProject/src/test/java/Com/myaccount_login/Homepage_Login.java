package Com.myaccount_login;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_class.Baseclass;
import Myaccount_homepage_login.MYaccount_homepage_login;
public class Homepage_Login extends Baseclass {
	@Test
	public void Verify_Login_credentials() throws Exception {
		openBrowsers("chromebrowser");
		// MYaccount_homepage_login Homepage=new MYaccount_homepage_login(driver);
		/*
		 * Homepage.Myaccounts("demo@myaccounts.in"); wait(02);
		 * Homepage.Myaccounts("aaaaaa");
		 */
		openapplication("http:/myaccountsonline.in/solutions/MyaccountsLogin.aspx?AspxAutoDetectCookieSupport=1");
		wait(10);
		driver.findElement(By.linkText("Demo Company")).click();
		driver.manage().deleteAllCookies();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
	    
		screenshot();
		
	}
	
}
