package com.test1.seleniumautomation;

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

import PFDetails.IndexPage;

public class Day4 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException, IOException {
		IndexPage objIndex = new IndexPage(driver);
		driver.get("http://live.guru99.com/");
		//Clicking on Mobile
		objIndex.clickOnMobile();
		//Clicking on add to compare sony xperia
		objIndex.AddtoCompareSonyXperia();
		Thread.sleep(3000);
		//Clicking on add to copmare iphone
		objIndex.AddtoCompareIphone();
		Thread.sleep(3000);
		//clicking on compare button and getting tittle of each phone
		objIndex.ClickOnCompare();
		Thread.sleep(3000);
		
		//iterating to popup window , using it and then switching back to the main window
		  
		  for (String handle : driver.getWindowHandles()) {
		    	driver.switchTo().window(handle);
		    	driver.manage().window().maximize();
		    	}
		
		
		//taking ScreenShots for compare Screen
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 FileUtils.copyFile(scrFile, new File("C:\\Users\\babanbhj\\ComparePage.jpg"));
		
		
		System.out.println("The Title is:" +objIndex.GetTitleofIphone());
		
		System.out.println("The Tittle is:" +objIndex.GetTitleofSony());
		
		Thread.sleep(3000);
		//Clicking on close window button
		
		objIndex.CloseWindow();

				
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
