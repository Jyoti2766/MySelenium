package PFDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndexGuruDay6 {
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

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")
	WebElement ClickonMyWishList;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	WebElement ClickAddToCart;

	@FindBy(xpath = "//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")
	WebElement ClickOnUpdateButton;

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/div/div[1]/ul/li/button/span/span")
	WebElement ClickOnProceedtoCheckOut;

	@FindBy(xpath = "//*[@id='billing:region_id']")
	WebElement StateDropDown;
	@FindBy(xpath = "//*[@id='billing:postcode']")
	WebElement ClickOnZipCode;

	@FindBy(xpath = "//*[@id='billing:street1']")
	WebElement EnterAddress;

	@FindBy(xpath = "//*[@id='billing:city']")
	WebElement EnterCity;

	@FindBy(xpath = "//*[@id='billing:telephone']")
	WebElement EnterTelephone;

	@FindBy(xpath = "//*[@id='nav']/ol/li[2]/a")
	WebElement ClickOnTV;

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
	WebElement AddToWishList;
	@FindBy(xpath = "//*[@id='shipping-zip-form']/div/button/span/span")
	WebElement ClickonEstimate;

	@FindBy(xpath = "//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")
	WebElement VerifyQty;

	@FindBy(xpath = "//*[@id='co-shipping-method-form']/dl/dd/ul/li/label")
	WebElement VerifyShippingCost;
	@FindBy(xpath = "//*[@id='s_method_flatrate_flatrate']")
	WebElement ClickOnShippinDetails;

	@FindBy(xpath = "//button[@title='Update Total']")
	WebElement ClickonUpdateTotal;
	
	@FindBy(xpath = "//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span")
	WebElement VerifyShippingCostDetails;

	@FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span")
	WebElement ProceedToCheckout;

	@FindBy(xpath = "//*[@id='billing-buttons-container']/button/span/span")
	WebElement ClickOnContinue;
	
	@FindBy(xpath = "//*[@id='shipping-method-buttons-container']/button/span/span")
	WebElement ShippingMethodContinue;
	
	@FindBy(xpath = "//*[@id='p_method_checkmo']")
	WebElement CheckMoneyOrder;
	
	@FindBy(xpath = "//*[@id='payment-buttons-container']/button/span/span")
	WebElement PaymentMethodContinue;
	
	@FindBy(xpath = "//*[@id='review-buttons-container']/button/span/span")
	WebElement ClickonPlaceOrder;

	@FindBy(xpath="//*[@id='region_id']")
	WebElement StateDetails;
	
	@FindBy(xpath="//*[@id='postcode']")
	WebElement ZipCodeDetails;
	
	public IndexGuruDay6(WebDriver driver) {

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

	public void ClickOnTV() {
		ClickOnTV.click();
	}

	public void AddToWishList() {
		AddToWishList.click();
	}

	public void ClickonMyWishList() {
		ClickonMyWishList.click();
	}

	public void ClickAddToCart() {
		ClickAddToCart.click();
	}

	public void ClickOnProceedtoCheckOut() {
		ClickOnProceedtoCheckOut.click();
	}

	public void ClickonSTate(String Text) {
		Select dlState = new Select(StateDropDown);
		dlState.selectByVisibleText(Text);

	}

	public void ClickOnZipCode(String Val) {
		ClickOnZipCode.sendKeys(Val);
	}

	public void EnterAddress(String Val) {
		EnterAddress.sendKeys(Val);
	}

	public void EnterCity(String Text) {
		EnterCity.sendKeys(Text);
	}

	public void EnterTelephone(String Val) {
		EnterTelephone.sendKeys(Val);
	}

	public void ClickonEstimate() {
		ClickonEstimate.click();
	}

	public void VerifyQty(String Val) {
		VerifyQty.clear();
		VerifyQty.sendKeys(Val);
	}

	public void ClickOnUpdateButton() throws InterruptedException {
		ClickOnUpdateButton.click();
		Thread.sleep(2000);
	}

	public String VerifyShippingCost() {
		return VerifyShippingCost.getText();

	}

	public void ClickOnShippinDetails() {
		ClickOnShippinDetails.click();
	}

	public void ClickonUpdateTotal() {
		ClickonUpdateTotal.click();
	}

	public String VerifyShippingCostDetails() {
		return VerifyShippingCostDetails.getText();
	}

	public void ProceedToCheckout() {
		ProceedToCheckout.click();
	}

	public void ClickOnContinue() {
		ClickOnContinue.click();
	}

	public void ShippingMethodContinue() {
		ShippingMethodContinue.click();
	}

	public void CheckMoneyOrder() {
		CheckMoneyOrder.click();
	}

	public void PaymentMethodContinue() {
		PaymentMethodContinue.click();
	}
	
	public void ClickonPlaceOrder()
	{
		ClickonPlaceOrder.click();
	}
	public void StateDetails(String Text)
	{
		StateDetails.sendKeys(Text);
	}
	public void ZipCodeDetails(String Val)
	{
		ZipCodeDetails.sendKeys(Val);
	}
}
