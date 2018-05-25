package com.test1.seleniumautomation;



import static org.testng.Assert.assertNotEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PFDetails.IndexGuruDay8;

public class GuruDay8 {
	WebDriver driver;

 
		@Test
		public void f() throws InterruptedException, IOException  {
			IndexGuruDay8 objIndexGuruDay8 = new IndexGuruDay8(driver);

			driver.get("http://live.guru99.com/index.php/");

			Thread.sleep(2000);

			// clicking on my account link
			// Enter details for login

			objIndexGuruDay8.clickOfMyAccountt();
			objIndexGuruDay8.LinkOfMyAccount();
			objIndexGuruDay8.EnterEmailID();
			objIndexGuruDay8.EnterPassword();
			objIndexGuruDay8.ClickOnLoginBUtton();
			//Clicking on Reorder
			objIndexGuruDay8.ClickonReorderButton();
			objIndexGuruDay8.ChangetheQty("1");
			Thread.sleep(2000);
			objIndexGuruDay8.ClickonUpdateBUtton();
			Thread.sleep(2000);
			//Capturing initial GRAND TOTAL
			
			double inTotal = Double.parseDouble(objIndexGuruDay8.CaptureGrnadTotal().substring(1));
			System.out.println("The Grand Tittle is"  +objIndexGuruDay8.CaptureGrnadTotal());
						 //Updating quantity of order
			objIndexGuruDay8.ChangetheQty("10");
			Thread.sleep(2000);
			objIndexGuruDay8.ClickonUpdateBUtton();
			Thread.sleep(2000);
			//Verify Grand Total
			 
			//double inTotal = Double.parseDouble(objIndexGuruDay8.CaptureGrnadTotal().substring(1));
			double finTotal = Double.parseDouble(objIndexGuruDay8.CaptureGrnadTotal1().replace(",", "").substring(1));
			System.out.println(objIndexGuruDay8.CaptureGrnadTotal().substring(1));
			System.out.println(objIndexGuruDay8.CaptureGrnadTotal1().replace(",", "").substring(1));
			try{
				System.out.println("The Grand Tittle is"  +objIndexGuruDay8.CaptureGrnadTotal1());
				assertNotEquals(inTotal,finTotal);
			
				
				System.out.println("*** GRAND TOTAL has been updated ***");
			}
			catch(Exception e) {
				  System.out.println("*** GRAND TOTAL has not been updated ***");
				  e.printStackTrace();
			}
			//Steps-->click on checkout-->shipping and other info-->place order--> note new order no--> take screenshot
			objIndexGuruDay8.ProccedtoCheckOut();
			
			objIndexGuruDay8.ClickonContinueBillingInfo();
			Thread.sleep(2000);
			objIndexGuruDay8.ShippingMethodContinue();
			Thread.sleep(2000);
			objIndexGuruDay8.SelectMoneyOrder();
			Thread.sleep(2000);
			objIndexGuruDay8.PaymentMethodContinue();
			Thread.sleep(2000);
			objIndexGuruDay8.ClickonPlaceOrder();
			
			Thread.sleep(2000);
			
			System.out.println("****The New Order No is***: " +objIndexGuruDay8.NewOrderNo());
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(scrFile, new File("c:\\Users\\babanbhj\\NewOrderNoDetails.jpg"));
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

