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

import PFDetails.IndexPage;

public class Day5 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException, IOException {
		IndexPage objIndex = new IndexPage(driver);
		
		driver.get("http://live.guru99.com/index.php/");
		Thread.sleep(2000);
		//clicking on my account link
		
		objIndex.clickOfMyAccountt();
		objIndex.LinkOfMyAccount();
		Thread.sleep(2000);
		
		for (String Handle : driver.getWindowHandles()) {
			driver.switchTo().window(Handle);
			driver.manage().window().maximize();

		}
		//clicking on Create account Link
		
		objIndex.ClickOnCreateAccountLink();
		Thread.sleep(2000);
		for (String Handle : driver.getWindowHandles()) {
			driver.switchTo().window(Handle);
			driver.manage().window().maximize();

		}
		//Filling all the details except email id
		Thread.sleep(2000);
		objIndex.FirstName();
		Thread.sleep(2000);
		objIndex.LastName();
		Thread.sleep(2000);
		objIndex.EmailAddress();
		objIndex.Password();
		Thread.sleep(2000);
		objIndex.ConfirmationPasswrod();
		Thread.sleep(2000);
		objIndex.ClickonRegister();
		Thread.sleep(2000);
		
		Assert.assertEquals("Thank you for registering with Main Website Store.", objIndex.VerificationMessage());
		System.out.println("The Title is:" +objIndex.VerificationMessage());
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 //FileUtils.copyFile(scrFile, new File("C:\\Users\\babanbhj\\Registration.jpg"));
				
		objIndex.ClickOnTV();
		objIndex.AddToWishList();
		Thread.sleep(2000);
		objIndex.ShareWishLIst();
		Thread.sleep(2000);
		objIndex.AddEmailAdd();
		objIndex.ClickShareWishListButton();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 FileUtils.copyFile(scrFile, new File("C:\\Users\\babanbhj\\ShareSucessmessage.jpg"));
		
		
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
