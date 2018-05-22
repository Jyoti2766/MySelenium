package com.test1.seleniumautomation;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import org.apache.commons.io.FileUtils; 
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class Guruday1 {
	static public WebDriver driver = null;
  @Test
  public void Test() throws IOException, InterruptedException {
	  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://live.guru99.com/");
		Thread.sleep(2000);
		
		//verify the Title of page
		String pagetittle =  driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
		
		//String pagetittle =  driver.findElement(By.xpath("//*[@id=top]/body/div/div/div[2]/div/div[1]/div/div/h2")).getText();
		
		assertEquals("THIS IS DEMO SITE FOR   ", pagetittle);

		 		
			//System.out.println("The Title is" +driver.getTitle()); 
		Thread.sleep(3000);
		
		//clicking on Mobile
		
		driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();
		
		//verify the Title of page
    String mobiletittle =  driver.findElement(By.xpath("//h1[contains(.,'Mobile')]")).getText();
		
	assertEquals("MOBILE", mobiletittle);
	//Selecting 'SORT BY' from the dropdown list
	
	Select sortBy = new Select(driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
	  sortBy.selectByIndex(1);
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrFile, new File("C:\\Users\\babanbhj\\Selenium day1\\sortby.jpg"));
		 				       
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
