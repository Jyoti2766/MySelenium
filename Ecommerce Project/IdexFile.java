package PFDetails;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IndexPage {
	WebDriver Driver;
	
	@FindBy(xpath="//a[@href='http://live.guru99.com/index.php/mobile.html']")
	WebElement mobileLink;
	
	@FindBy(xpath="//div[@class='page-title']/h2")
	WebElement titleofIndexPage;
	
	@FindBy(xpath= "//*[@id='product-price-1']/span")
	WebElement Priceofproduct1;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2")
	WebElement clickonSonyXperiaMobile;
	
	@FindBy(xpath="//*[@id='product-price-1']/span")
	WebElement ProductPrice;
	
	@FindBy (xpath= "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")
	WebElement AddtoCartSonyXperia;
	
	@FindBy (xpath= "//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")
	WebElement QtySonyXperia;
	
	@FindBy(xpath="//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")
	WebElement ClickOnUpdateButton;
	
	@FindBy(xpath="//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")
	WebElement ErrorMessage;
	
	@FindBy(xpath="//*[@id='empty_cart_button']/span/span")
	WebElement ClickOnEmptyCart;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1")
	WebElement ErrorMessageForEmptyCart;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	WebElement AddtoCompareSonyXperia;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
	WebElement AddtoCompareIphone;
	
	@FindBy(xpath="//button[@title='Compare']")
	WebElement ClickOnCompare;
	
	@FindBy(xpath="//h2/a[@title='IPhone']")
	WebElement GetTitleofIphone;
	
	@FindBy(xpath="//h2/a[@title='Sony Xperia']")
	WebElement GetTitleofSony;
	
	@FindBy(xpath="//*[@id='top']/body/div/div[2]/button")
	WebElement CloseWinow;
	
	public IndexPage(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMobile()
	{
		mobileLink.click();
	}
	
	public String Priceofproduct1()
	{
		
		return Priceofproduct1.getText();
		
	}
	
	public void  clickonSonyXperiaMobile()
	{
		clickonSonyXperiaMobile.click();
	}
	
	public String ProductPrice()
	{
		
		return ProductPrice.getText();
		
	}
	
   public void AddtoCartSonyXperia()
   {
	   
	   AddtoCartSonyXperia.click();
   }

   public void QtySonyXperia() throws InterruptedException
   {
	   
	   QtySonyXperia.click();
	   Thread.sleep(2000);
	   QtySonyXperia.clear();
	   Thread.sleep(2000);
	   QtySonyXperia.sendKeys("1000");
	   Thread.sleep(2000);
   }
   
   public void ClickOnUpdateButton() throws InterruptedException
   {
	   ClickOnUpdateButton.click(); 
	   Thread.sleep(2000);
	   
	   
	   
   }
   public String ErrorMessage()
   {
	   
	   return ErrorMessage.getText();
	 
   }
   
   public void ClickOnEmptyCart() throws InterruptedException
   {
	   ClickOnEmptyCart.click();
	   Thread.sleep(2000);
	   
   }
   
   public String ErrorMessageForEmptyCart()
   {
	   
	  return ErrorMessageForEmptyCart.getText();
   }
   
   public void AddtoCompareSonyXperia()
   {
	   AddtoCompareSonyXperia.click();
   }
   
   public void AddtoCompareIphone()
   {
	   AddtoCompareIphone.click();
	   
   }
   
   public String GetTitleofIphone()
   {
	   return GetTitleofIphone.getText();
   }
   
   public String GetTitleofSony()
   {
	   return GetTitleofSony.getText();
   }
   public void ClickOnCompare()
   {
	   ClickOnCompare.click();
   }
   public void CloseWinow()
   {
	   CloseWinow.click();
   }
}

