package Base_class;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Myaccount_homepage_login.MYaccount_homepage_login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver = null;

	public void openBrowsers(String browser) {
		if (browser.equalsIgnoreCase("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edgebrowser")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
		return;
		
	}

	public static  void wait(int waitTime) {
		try {
			try {
				driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchframe(int index) {

		driver.switchTo().frame(index);
		driver.switchTo().defaultContent();
	}

	public void alert(String alert) {
		Alert ala = driver.switchTo().alert();
		String text = ala.getText();
		ala.accept();
	}

	public void explicitywait() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void alert() {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		alert.accept();
	}

	public void handlewindows(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		// windowscount and allwindows id
		System.out.println("windowscount:" + allwindows.size());
		// switch too child window
		List<String> windows = new ArrayList<String>(allwindows);
		driver.switchTo().window(windows.get(index));
	}

	public void screenshot() throws Exception {
		TakesScreenshot capture = ((TakesScreenshot) driver);
		File source = capture.getScreenshotAs(OutputType.FILE);
		String path = "C:\\eclipse-workspace\\MyAccountsProject\\src\\main\\resources\\screeenshots";
		File destFile = new File(path + "\\screenshots.png");
		FileUtils.copyFile(source, destFile);
	}

	public void title() {
		String expectedtitle = "opensource-demo";
		String actualltitle = driver.getTitle();
		System.out.println(actualltitle);
		if (expectedtitle.equals(actualltitle)) {
			System.out.println("title is match");
		}
	}

	public void currenturl(CharSequence index) {
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		if (actualurl.contains(index))
			;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void teradown() {

		driver.close();
	}

	public void openapplication(CharSequence url) {

		driver.get((String) url);
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void hover() {
		WebElement mensection = driver.findElement(By.xpath(
				"//nav[@class='top-nav']//ul//li[@class='mega-menu hasChildren']//a[@href='verticals']//span[contains(text(),'Verticals')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensection).perform();

	}

	public void My_Account_Login() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// MYaccount_homepage_login Homepage=new MYaccount_homepage_login(driver);
		driver.get("http:/myaccountsonline.in/solutions/MyaccountsLogin.aspx?AspxAutoDetectCookieSupport=1");
		/*
		 * Homepage.Myaccounts("demo@myaccounts.in"); wait(02);
		 * Homepage.Myaccounts("aaaaaa");
		 */
		// click democompany option and login
		driver.findElement(By.linkText("Demo Company")).click();
		driver.manage().deleteAllCookies();
	}

	public void modelboxclick() {
		// click modelbox
		WebElement dclick = driver.findElement(By.xpath("//button[@class='confirm']"));
		Actions action = new Actions(driver);
		action.doubleClick(dclick).build().perform();

	}

	public void Account_login() {

		driver.get("http://myaccountsonline.in/solutions/MyaccountsLogin.aspx?AspxAutoDetectCookieSupport=1");
		driver.findElement(By.linkText("Demo Company")).click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// xpath=(.//*[normalize-space(text()) and
		// normalize-space(.)='​'])[1]/following::div[2] | ]]
		driver.findElement(By.xpath("//li[@id='financialBar']/a/span")).click();
		// driver.findElement(By.xpath("//div[@id='navigation']/ul/li/a/span")).click();
	}

	public void Account_login_2() {
		driver.get("http://myaccountsonline.in/solutions/MyaccountsLogin.aspx?AspxAutoDetectCookieSupport=1");
		driver.findElement(By.linkText("Demo Company")).click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]"))
				.click();
		// ERROR: Caught exception [ERROR: Unsupported command [doubleClick |
		// xpath=(.//*[normalize-space(text()) and
		// normalize-space(.)='​'])[1]/following::div[2] | ]]
		driver.findElement(By.xpath("//li[@id='purchasebar']/a/span")).click();
		// driver.findElement(By.xpath("//div[@id='navigation']/ul/li/a/span")).click();

	}

	public void Acoount_login_3() {
		driver.get("http://myaccountsonline.in/solutions/MyaccountsLogin.aspx?AspxAutoDetectCookieSupport=1");
		driver.findElement(By.linkText("Demo Company")).click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]"))
				.click();
		driver.findElement(By.xpath("//li[@id='inventorybar']/a/span")).click();
		// driver.findElement(By.xpath("//div[@id='navigation']/ul/li/a/img")).click();
	}

	public void master_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//div[@id='navigation']//li[1]//a[1]//img[1]"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void master_2_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void Receipt_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//div[@id='navigation']//li[2]//a[1]//img[1]"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void Paymen_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//img[@src='Assets/Icons/payments.png']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void journals_hover() {
		WebElement clcikmaster = driver.findElement(
				By.xpath("/html[1]/body[1]/form[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/img[1]"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void Dailyreport_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//img[@src='Assets/Icons/reports.png']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();

	}

	public void item_attributes_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Item Attributes']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void item_Registration_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Item Registration']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void purchase_order_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Purchase Orders']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void Goods_receipt_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Goods Receipts']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void Purchase_invoice_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Purchase Invoice']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void Print_Barcode_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Print Barcode']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void GRC_Registration_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='GRC Register']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}

	public void Invoice_Registration_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Invoice Registers']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}
	public void requirments_hover() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Requirement']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}
	public void printBarcode() {
		WebElement clcikmaster = driver.findElement(By.xpath("//span[normalize-space()='Print Barcode']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
	}


}