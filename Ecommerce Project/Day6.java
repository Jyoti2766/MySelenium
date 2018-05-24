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

import PFDetails.IndexGuruDay6;

public class GuruDay6 {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException, IOException {
		IndexGuruDay6 objIndexGuruDay6 = new IndexGuruDay6(driver);

		driver.get("http://live.guru99.com/index.php/");
		Thread.sleep(2000);

		// clicking on my account link
		// Enter details for login

		objIndexGuruDay6.clickOfMyAccountt();
		objIndexGuruDay6.LinkOfMyAccount();
		objIndexGuruDay6.EnterEmailID();
		objIndexGuruDay6.EnterPassword();
		objIndexGuruDay6.ClickOnLoginBUtton();
		Thread.sleep(2000);
		// clickinig on TV Option
		objIndexGuruDay6.ClickOnTV();
		// add to wish list and click on mywishlist
		objIndexGuruDay6.AddToWishList();
		Thread.sleep(2000);
		objIndexGuruDay6.ClickonMyWishList();
		Thread.sleep(2000);
		objIndexGuruDay6.ClickAddToCart();
		Thread.sleep(2000);

		objIndexGuruDay6.VerifyQty("1");
		objIndexGuruDay6.ClickOnUpdateButton();
		Thread.sleep(2000);
		
		objIndexGuruDay6.StateDetails("New York");
		Thread.sleep(2000);
		objIndexGuruDay6.ZipCodeDetails("123456");
		Thread.sleep(2000);
		objIndexGuruDay6.ClickonEstimate();
		Thread.sleep(2000);
		try {
			System.out.println("The Title is:" + objIndexGuruDay6.VerifyShippingCost());

			Assert.assertEquals("Fixed - $5.00", objIndexGuruDay6.VerifyShippingCost());

		}

		catch (Exception e) {
			System.out.println("The Title is:" + e.getMessage());
		}
		objIndexGuruDay6.ClickOnShippinDetails();
		Thread.sleep(2000);
		objIndexGuruDay6.ClickonUpdateTotal();
			Thread.sleep(2000);
		
		Assert.assertEquals("$5.00", objIndexGuruDay6.VerifyShippingCostDetails());
		
		objIndexGuruDay6.ProceedToCheckout();
		// objIndexGuruDay6.ClickOnProceedtoCheckOut();
		Thread.sleep(2000);
		//objIndexGuruDay6.ClickonSTate("New York");

		//objIndexGuruDay6.ClickOnZipCode("542896");
		//objIndexGuruDay6.EnterAddress("ABC");
		//objIndexGuruDay6.EnterCity("New York");
		//objIndexGuruDay6.EnterTelephone("1234567897");
		objIndexGuruDay6.ClickOnContinue();
		Thread.sleep(2000);
		objIndexGuruDay6.ShippingMethodContinue();
		Thread.sleep(2000);
		objIndexGuruDay6.CheckMoneyOrder();
		Thread.sleep(2000);
		objIndexGuruDay6.PaymentMethodContinue();
		Thread.sleep(2000);
		objIndexGuruDay6.ClickonPlaceOrder();
		Thread.sleep(2000);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrFile, new File("c:\\Users\\babanbhj\\OrderDetails.jpg"));

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
