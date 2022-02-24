package Verify_finacialAccounting;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_class.Baseclass;

public class Com_master extends Baseclass {
	@BeforeMethod
	public void launchbrowser() throws Exception {
		System.out.println("installbrowser");
		// launch browser
		openBrowsers("chromebrowser");

	}
	
	@Test(priority = 0)
	public void verify_finacial_master() throws Exception {
		Account_login();

		master_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Primary Group']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Group Accounts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='General Ledger']")).click();
		wait(2);
		driver.findElement(
				By.xpath("/html[1]/body[1]/form[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]"))
				.click();
		wait(10);
	
		driver.findElement(By.xpath("//a[normalize-space()='Customer Profile']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Vendor Master']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Default Accounts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Narration Master']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Ledger Fixing']")).click();
	}

	@Test(priority = 1)
	public void Verify_finacial_Receipt() {
		Account_login();
		Receipt_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Cash Receipts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Petty Cash Receipts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Bank Receipts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Sales Voucher']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Post Dated Cheques Receipts']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Bills Adjustments(Receipts)']")).click();
		wait(10);
		driver.findElement(By.xpath("//a[normalize-space()='Sales Updation']")).click();

	}

	@Test(priority = 2)
	public void Verify_finacial_Payment() {
		Account_login();
		Paymen_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Cash Payments']")).click();
		driver.findElement(
				By.xpath("/html[1]/body[1]/form[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"))
				.click();
		driver.findElement(
				By.xpath("/html[1]/body[1]/form[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]"))
				.click();
		driver.findElement(By.xpath("//a[normalize-space()='Purchase Voucher']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Post Date Cheque Payments']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Matured PDC Vouchers']")).click();

	}

	@Test(priority = 3)
	public void Verify_finacial_Journals() {
		Account_login();
		journals_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Debit Note']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Credit Note']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Journal Voucher']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Contra Voucher']")).click();

	}

	@Test(priority = 4)
	public void Verify_finacial_dailyreport() {
		Account_login();
		Dailyreport_hover();
		driver.findElement(By.xpath("//a[normalize-space()='Day Book']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Cash Book']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Bank Book']")).click();
		
	}

	@AfterMethod
	public void close() {
		teradown();
	}

}