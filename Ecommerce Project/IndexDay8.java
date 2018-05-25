package PFDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexGuruDay8 {

	WebDriver Driver;

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

	@FindBy(xpath = "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/span/a[2]")
	WebElement ClickonReorderButton;

	@FindBy(xpath = "//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")
	WebElement ChangetheQty;

	@FindBy(xpath = "//*[@id='shopping-cart-table']/tbody/tr/td[4]/button/span/span")
	WebElement ClickonUpdateBUtton;

	@FindBy(xpath = "//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span")
	WebElement CaptureGrnadTotal;

	@FindBy(xpath = "//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span")
	WebElement CaptureGrnadTotal1;

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span")
	WebElement ProccedtoCheckOut;

	@FindBy(xpath = "//*[@id='billing-buttons-container']/button/span/span")
	WebElement ClickonContinueBillingInfo;

	@FindBy(xpath = "//*[@id='shipping-method-buttons-container']/button")
	WebElement ShippingMethodContinue;

	@FindBy(xpath = "//*[@id='dt_method_checkmo']/label")
	WebElement SelectMoneyOrder;

	@FindBy(xpath = "//*[@id='payment-buttons-container']/button/span/span")
	WebElement PaymentMethodContinue;

	@FindBy(xpath = "//*[@id='review-buttons-container']/button/span/span")
	WebElement ClickonPlaceOrder;

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/p[1]/a")
	WebElement NewOrderNo;

	public IndexGuruDay8(WebDriver driver) {
		this.Driver = driver;
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

	public void ClickonReorderButton() {
		ClickonReorderButton.click();
	}

	public void ChangetheQty(String Val) {
		ChangetheQty.click();
		ChangetheQty.clear();
		ChangetheQty.sendKeys(Val);
	}

	public void ClickonUpdateBUtton() {
		ClickonUpdateBUtton.click();
	}

	public String CaptureGrnadTotal() {
		return CaptureGrnadTotal.getText();
	}

	public String CaptureGrnadTotal1() {
		return CaptureGrnadTotal1.getText();
	}

	public void ProccedtoCheckOut() {
		ProccedtoCheckOut.click();
	}

	public void ClickonContinueBillingInfo() {
		ClickonContinueBillingInfo.click();
	}

	public void ShippingMethodContinue() {
		ShippingMethodContinue.click();
	}

	public void PaymentMethodContinue() {
		PaymentMethodContinue.click();
	}

	public void SelectMoneyOrder() {
		SelectMoneyOrder.click();
	}

	public void ClickonPlaceOrder() {
		ClickonPlaceOrder.click();
	}

	public String NewOrderNo() {
		return NewOrderNo.getText();
	}
}
