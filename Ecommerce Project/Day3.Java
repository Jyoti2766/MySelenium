package com.test1.seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PFDetails.IndexPage;

public class Guruday3 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		IndexPage objIndex = new IndexPage(driver);
		driver.get("http://live.guru99.com/");
		objIndex.clickOnMobile();
		Thread.sleep(2000);
		objIndex.AddtoCartSonyXperia();
		Thread.sleep(2000);
		objIndex.QtySonyXperia();
		objIndex.ClickOnUpdateButton();

		try {
			Assert.assertEquals("The requested quantity for \"Sony Xperia\" is not available.",
					objIndex.ErrorMessage());
		} catch (Exception e)

		{
			e.printStackTrace();
		}

		finally {
			objIndex.ClickOnEmptyCart();
			Assert.assertEquals("SHOPPING CART IS EMPTY", objIndex.ErrorMessageForEmptyCart());
		    System.out.println("The Error Message is"+ objIndex.ErrorMessageForEmptyCart());
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
