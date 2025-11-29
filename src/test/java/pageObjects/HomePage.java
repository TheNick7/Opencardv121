package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]") 
	WebElement linkLogin;

	/* @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement linklogOut; */

	public void clickMyAccount() {
		linkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	/* public void clicklogOut() {
		linklogOut.click();
	} */
	public void clickLogin() {
		linkLogin.click();
	}
}
