package Com.myaccount_login;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Base_class.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_my_account extends Baseclass {
	@Test
	public void Login_my_account() throws Exception {
		FileInputStream file = new FileInputStream(
				"C:\\eclipse-workspace\\MyAccountsProject\\src\\main\\resources\\Myaccountlogin.xlsx");
		// latest api
		Workbook wb = WorkbookFactory.create(file);
		Sheet stageDataSheet = wb.getSheet("login");
		// read the data from sheet --usName and pwd
		String userName = stageDataSheet.getRow(1).getCell(0).getStringCellValue();
		String password = stageDataSheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("user Name" + userName);
		System.out.println("password" + password);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		wait(20);
		driver.manage().window().maximize();
		driver.get("http://myaccountsonline.in/solutions/MyaccountsLogin.aspx");
		driver.findElement(By.xpath("//input[@id='txtloginid']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='BtnLogin']")).click();
		WebElement clcikmaster = driver.findElement(By.xpath("//button[@class='confirm']"));
		Actions master = new Actions(driver);
		master.moveToElement(clcikmaster).build().perform();
		

	}
}