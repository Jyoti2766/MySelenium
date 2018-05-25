package PFDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexGuruDay9 {
 WebDriver driver;
 

	@FindBy(xpath = "//*[@id='header']/div/div[2]/div/a")
	WebElement clickOfMyAccountt;

	@FindBy(xpath = "//*[@id='header-account']/div/ul/li[1]/a")
	WebElement LinkOfMyAccount;

	@FindBy(xpath = "//*[@id='email']")
	WebElement EnterEmailID;

	@FindBy(xpath = "//*[@id='pass']")
	WebElement EnterPassword;

	@FindBy(xpath = "//*[@id='send2']/span/span")
	WebElement ClickOnLoginBUtton;
	
	@FindBy(xpath="//*[@id='nav']/ol/li[1]/a")
	WebElement clickonMobile;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button/span/span")
	WebElement AddIphonetoCart;
	@FindBy(xpath="//*[@id='coupon_code']")
	WebElement EnterCouponCode;
	
	@FindBy (xpath="//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span")
	WebElement Pricebeforecouponcode;
	
	@FindBy(xpath=("//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span"))
	WebElement Priceaftercouponcode;
	
	@FindBy(xpath="//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span")
	WebElement NewPrice;
	
	@FindBy(xpath="//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span")
	WebElement actualPrice;
	
	public IndexGuruDay9(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOfMyAccountt() {
		clickOfMyAccountt.click();
	}

	public void LinkOfMyAccount() {
		LinkOfMyAccount.click();
	}

	public void EnterEmailID() {
		EnterEmailID.sendKeys("Chitan@gmail.com");
	}

	public void EnterPassword() {
		EnterPassword.sendKeys("Infy@123");
	}

	public void ClickOnLoginBUtton() {
		ClickOnLoginBUtton.click();
	}
	
	public void clickonMobile()
	{
		clickonMobile.click();
	}

	public void AddIphonetoCart()
	{
		AddIphonetoCart.click();
	}
	public void EnterCouponCode(String Val)
	{
		EnterCouponCode.click();
		EnterCouponCode.clear();
		EnterCouponCode.sendKeys(Val);
	}
	public String Pricebeforecouponcode()
	{
		return Pricebeforecouponcode.getText();
	}
	
	public String Priceaftercouponcode()
	{
		return Priceaftercouponcode.getText();
	}
	public String NewPrice()
	
	{
		return NewPrice.getText();
	}
	
	public String actualPrice()
	{
		return actualPrice.getText();
	}
}

