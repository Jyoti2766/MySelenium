package com.test1.seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PFDetails.IndexGuruDay7;

public class GuruDay7 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException, IOException {
		IndexGuruDay7 objIndexGuruDay7 = new IndexGuruDay7(driver);

		driver.get("http://live.guru99.com/index.php/");

		Thread.sleep(2000);

		// clicking on my account link
		// Enter details for login

		objIndexGuruDay7.clickOfMyAccountt();
		objIndexGuruDay7.LinkOfMyAccount();
		objIndexGuruDay7.EnterEmailID();
		objIndexGuruDay7.EnterPassword();
		objIndexGuruDay7.ClickOnLoginBUtton();
		//Clicking on My Orders
		objIndexGuruDay7.ClickonMyOrders();
		//searching with order and status Pending in Recent order table
		Assert.assertEquals("100006785", objIndexGuruDay7.SearchID());
		System.out.println("100006785" +objIndexGuruDay7.SearchID());
		
		Assert.assertEquals("Pending", objIndexGuruDay7.SearchForPending());
		System.out.println("Pending" +objIndexGuruDay7.SearchForPending());
		//Clicking on View Orders
		objIndexGuruDay7.ViewOrders();
		//Clicking on Print Order
		Thread.sleep(2000);
		objIndexGuruDay7.ClickonPrintOrder();
		// Switching to another window
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		Thread.sleep(3000);

		// Taking Screenshot as evidence that option to save receipt as PDF is
		// coming

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("c:\\Users\\babanbhj\\PDFOFViewOrder.jpg"));

		Thread.sleep(2000);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\UBS\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}
}
