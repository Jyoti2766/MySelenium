package com.test1.seleniumautomation;

import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PFDetails.IndexGuruDay9;

public class GuruDay9 {

	WebDriver driver;

	// need to look into this code
	@Test
	public void f() throws InterruptedException, IOException {
		IndexGuruDay9 objIndexGuruDay9 = new IndexGuruDay9(driver);

		driver.get("http://live.guru99.com/index.php/");

		Thread.sleep(2000);

		// clicking on my account link
		// Enter details for login

		objIndexGuruDay9.clickOfMyAccountt();
		objIndexGuruDay9.LinkOfMyAccount();
		objIndexGuruDay9.EnterEmailID();
		objIndexGuruDay9.EnterPassword();
		objIndexGuruDay9.ClickOnLoginBUtton();
		objIndexGuruDay9.clickonMobile();
		objIndexGuruDay9.AddIphonetoCart();
		Thread.sleep(2000);
		objIndexGuruDay9.Qtydetails("1");
		objIndexGuruDay9.UpdateButtonClick();
		// Initial Price before applying coupon code

		double Beforeprise = Double.parseDouble(objIndexGuruDay9.Pricebeforecouponcode().replace(",", "").substring(1));
		System.out.println("The Before Pirce is :" + objIndexGuruDay9.Pricebeforecouponcode().substring(1));

		// System.out.println("****Grant Total Before Coupon Code"
		// +objIndexGuruDay9.Pricebeforecouponcode());
		objIndexGuruDay9.EnterCouponCode("GURU50");
		Thread.sleep(2000);
		objIndexGuruDay9.ClickOnApply();
		Thread.sleep(2000);
		// Verifying if discount is applied

		double exDiscount = (Beforeprise * 5) / 100;
		double DiscountCal = (Beforeprise - exDiscount);
		System.out.println("The Discount Price is:" + DiscountCal);
		Thread.sleep(2000);
		double discnt1 = Double.parseDouble(objIndexGuruDay9.Priceaftercouponcode().replace(",", "").substring(1));
		System.out.println("****Grant Total After Coupon Code" + objIndexGuruDay9.Priceaftercouponcode().substring(1));

		// int actDiscount = Integer.valueOf(discnt1.substring(2,4));

		double actDiscount = Double.valueOf(discnt1);

		/*try {
			Assert.assertEquals(discnt1, DiscountCal);
			// System.out.println("A valid discount of $" +
			// discnt1.substring(2,4) + " has been applied");
			System.out.println("A valid discount of $" + discnt1 + " has been applied");
		}
		catch (Exception ex) {
			System.out.println("Invalid Discount aplied!");
			ex.printStackTrace();
		}*/

		try {
			assertNotEquals(discnt1, DiscountCal);
			System.out.println("Valid Discounted amount is not being displayed");
		}

		catch (Exception e) {
			System.out.println("Invalid Discounted amount is being displayed!");
			e.printStackTrace();
		}
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
