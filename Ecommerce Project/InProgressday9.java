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
	//need to look into this code
	@Test
	public void f() throws InterruptedException, IOException  {
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
		//Initial Price before applying coupon code
		int Beforeprise= Integer.valueOf(objIndexGuruDay9.Pricebeforecouponcode().substring(1,4));
		System.out.println("****Grant Total Before Coupon Code" +objIndexGuruDay9.Pricebeforecouponcode());
		objIndexGuruDay9.EnterCouponCode("GURU50");
		
		//Verifying if discount is applied
		  //int intprice1 = Integer.valueOf(Beforeprise.substring(1,4));
		  int exDiscount = (Beforeprise * 5)/100;
		  String discnt = objIndexGuruDay9.Priceaftercouponcode();
		  int actDiscount = Integer.valueOf(discnt.substring(2,4));
		  
		  
		  int NewPrice = Integer.valueOf(objIndexGuruDay9.NewPrice().substring(1,4));
		  
		  		  try {
			  Assert.assertEquals(exDiscount, actDiscount);
			  System.out.println("A valid discount of $" + discnt.substring(2,4) + " has been applied");
		  }
		  		  
		  catch(Exception ex) {
			  System.out.println("Invalid Discount apllied!");
			  ex.printStackTrace();
		  }
		  		
		  		  try {
		  		  assertNotEquals(Beforeprise, NewPrice);
		  		  System.out.println("Valid Discounted amount is not being displayed");
		  	  }
		  	  
		  	  catch(Exception e) {
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

