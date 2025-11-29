package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration() throws InterruptedException
	{
		
		  
		try {
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("********** Clicked on myAccount link **********");
		hp.clickRegister();
		logger.info("********** Clicked on Register link **********");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("**********Providing customer details**********");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		Thread.sleep(1000);
		regpage.scrollDown();
		Thread.sleep(1000);
		regpage.subScribe();
		
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		logger.info("********** Validating excepted details. **********");
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

		logger.info("Test passed");

		regpage.clickContinue1();
		//hp.clickMyAccount();
		// hp.clicklogOut();
		//hp.clickMyAccount();
		//hp.clickLogin();
		
		}
		catch(Exception e){
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());

		}
		
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}

			
		
		
	}
	/*@Test(priority= 1)
	public void scrollDown() {
		
	}
	public void testScrollDown() {
		AccountRegistrationPage accountRegistrationPage = new AccountRegistrationPage(driver);
		accountRegistrationPage.scrollDown(5000);
	}*/
	
	/*@Test(priority= 1)
	public void AccountlogIn() {
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
	}*/
	
	

	

}








