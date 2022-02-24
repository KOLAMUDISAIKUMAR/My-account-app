package Verify_purchase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_class.Baseclass;

public class Com_mastere_2 extends Baseclass {
	@BeforeMethod
	public void launchbrowser() throws Exception {
		System.out.println("installbrowser");
		// launch browser
		openBrowsers("chromebrowser");
	}

	@Test(priority = 0)
	public void verify_finacial_master_2() throws Exception {
		Account_login_2();
		master_2_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Supplier Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Transporter']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Tax Group Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Tax Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='UOM Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='HSN Code Master']")).click();
	}

	@Test(priority = 1)
	public void item_attributes() {
		Account_login_2();
		item_attributes_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Division Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Department Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Category Master']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sub Category']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Design Master']")).click();

	}

	@Test(priority = 2)
	public void item_registration() {
		Account_login_2();
		item_Registration_hover();
		driver.findElement(By.xpath("//a[contains(text(),'Item Registration')]")).click();
	}

	@Test(priority = 3)
	public void purchase_order() {
		Account_login_2();
		purchase_order_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Order']")).click();
	}

	@Test(priority = 4)
	public void Goods_Receipt() {
		Account_login_2();
		Goods_receipt_hover();
		driver.findElement(By.xpath("//a[normalize-space()='GRC (Direct)']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Goods Returns Challan']")).click();
	}

	@Test(priority = 5)
	public void purchase_Invoice() {
		Account_login_2();
		Purchase_invoice_hover();
		driver.findElement(
				By.xpath("/html[1]/body[1]/form[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]"))
				.click();
		driver.findElement(By.xpath("//li[@title='Purchase Invoice']//a[contains(text(),'Purchase Invoice')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Invoice With IMEI']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Returns']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Returns With IMEI']")).click();
	}

	@Test(priority = 6)
	public void Print_Barcode() {
		Account_login_2();
		Print_Barcode_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Barcode Print']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Barcode RePrint']")).click();
	}

	@Test(priority = 7)
	public void GRC_Registration() {
		Account_login_2();
		GRC_Registration_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Goods Receipt Challan']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Goods Returns Report']")).click();
	}

	@Test(priority = 8)
	public void Invoice_Registration() {
		Account_login_2();
		Invoice_Registration_hover();
		driver.findElement(By.xpath("//a[contains(text(),'PI Agst PO')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='PI Report']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Returns Reg']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Tax Register']")).click();
	}

	@AfterMethod
	public void close() {
		teradown();

	}

}
