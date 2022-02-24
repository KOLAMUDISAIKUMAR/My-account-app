package Verify_finacial_inventory;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_class.Baseclass;

@Test
public class Com_requirment extends Baseclass {

	@BeforeMethod
	public void launchbrowser() throws Exception {
		System.out.println("installbrowser");
		// launch browser
		openBrowsers("chromebrowser");
	}

	@Test(priority = 0)
	public void Requirments() {
		Acoount_login_3();
		requirments_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Edit MRP']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Closing Stock Entry']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Bulk Product Updation']")).click();
	}

	@Test(priority = 1)
	public void printbarcode() {
		Acoount_login_3();
		printBarcode();
		driver.findElement(By.xpath("//a[normalize-space()='Price Print BarCode']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Price RePrint BarCode']")).click();
	}
}

	/*@Test(priority = 2)
	public void stockreport() {
		driver.findElement(By.xpath("//a[normalize-space()='Barcode Item Information']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Bulk Production updation Report']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Price Update Report']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Stock Movement']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Closing Stock with DC']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Closing Stock Image Report']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Closing Stock Entry Report']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='BarCode Detail Information']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Stock Ledger']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Closing Stock']")).click();
	}
}*/
