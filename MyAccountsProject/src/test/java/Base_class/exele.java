package Base_class;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exele {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\eclipse-workspace\\MyAccountsProject\\src\\test\\resources\\LoginData.xlsx");
		// latest api
		Workbook wb = WorkbookFactory.create(file);
		Sheet stageDataSheet = wb.getSheet("login");
		// read the data from sheet --usName and pwd
		String userName = stageDataSheet.getRow(1).getCell(1).getStringCellValue();
		String password = stageDataSheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("user Name" + userName);
		System.out.println("password" + password);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}

}
