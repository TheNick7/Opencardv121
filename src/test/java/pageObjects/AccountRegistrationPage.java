package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']") 
WebElement txtLasttname;

@FindBy(xpath="//input[@id='input-email']") 
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']") //input[@id='input-telephone']
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']") 
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement txtConfirmPassword;


@FindBy(xpath = "//label[normalize-space()='Yes']")
WebElement sub; 

@FindBy(xpath="//input[@name='agree']") 
WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']") 
WebElement btnContinue;

@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

@FindBy(xpath = "//a[normalize-space()='Continue']") 
WebElement btnContinue1;

@FindBy(xpath = "//a[normalize-space()='Login']" )
WebElement btnlogIn;



public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);

}


public void setLastName(String lname) {
	txtLasttname.sendKeys(lname);

}

public void setEmail(String email) {
	txtEmail.sendKeys(email);

}

public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);

}

public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);

}

public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);

}
public void scrollDown() {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0 , 300)");

}
/*public void scrollDown(int pixels) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0 , " + pixels +")");
}*/



public void subScribe() {
	sub.click();

}

public void setPrivacyPolicy() {
	chkdPolicy.click();

}

public void clickContinue() {
	//sol1 
	btnContinue.click();
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}

	public String getConfirmationMsg() {
		try {
		return (msgConfirmation.getText());
		} catch (Exception e) {
		return (e.getMessage());

	}

}
	public void clickContinue1() {
	//sol1 
		btnContinue1.click();

	}
	
}
