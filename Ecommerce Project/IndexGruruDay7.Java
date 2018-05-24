package PFDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexGuruDay7 {

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
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement ClickonMyOrders;
	@FindBy(xpath="//*[@id='my-orders-table']/tbody/tr[1]/td[1]")
	WebElement SearchID;
	
	@FindBy(xpath="//*[@id='my-orders-table']/tbody/tr[1]/td[6]/span/a[1]")
	WebElement ViewOrders;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[1]/h1")
	WebElement VerifyTitle;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
	WebElement ClickonPrintOrder;
	
	@FindBy(xpath="//*[@id='my-orders-table']/tbody/tr[1]/td[5]/em")
	WebElement SearchForPending;
	public IndexGuruDay7(WebDriver driver) {

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
	public void ClickonMyOrders()
	{
		ClickonMyOrders.click();
	}
	public void ViewOrders()
	{
		ViewOrders.click();
	}
	
	public String VerifyTitle()
	{
		return VerifyTitle.getText();
	}
	
	public void ClickonPrintOrder()
	{
		ClickonPrintOrder.click();
	}
	public String SearchID()
	{
		return SearchID.getText();
	}
	public String SearchForPending()
	{
		return SearchForPending.getText();
	}
}
