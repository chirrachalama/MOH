package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;

public class MoH_RN10 extends TestBase{

	
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement signin;
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-root MuiNativeSelect-select')]")
	WebElement ClickOnSelect;
	
	@FindBy(id="txtMobileNumber")
	WebElement EnterMobileNumber;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(xpath="//div[text()='Real Estate']")
	WebElement ClickOnRealEstate;
	
	@FindBy(xpath="//div[text()='RN10. Registration of real estate ownership (deed of granting)']")
	WebElement ClickOnRN10;
	
	@FindBy(xpath="//button[@class='loginButtonblue']")
	WebElement ClickOnAgree;
	
	@FindBy(xpath="//span[text()='Deed of Granting']")
	WebElement ClickOnDeedOfGranting;
	
	@FindBy(xpath="//div[text()='Register Grant']")
	WebElement ClickOnRegisterGrant;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ClickOnProceed;
	
	@FindBy(name="docnumber")
	WebElement EnterCitizenNumber;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement ClickOnSearch;
	
	@FindBy(id="relation")
	WebElement SelectReleation;
	
	@FindBy(name="Age")
	WebElement EnterAge;
	
	@FindBy(name="Phone Number")
	WebElement EnterPhoneNumber;
	
	@FindBy(name="Email")
	WebElement EnterEmail;
	
	
	
	
	
	public MoH_RN10() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Signin() throws InterruptedException
		{
			signin.click();
			//ClickOnSelect.click();
			Thread.sleep(2000);
			Select sel=new Select(ClickOnSelect);
			sel.selectByIndex(5);
			Thread.sleep(3000);
			EnterMobileNumber.sendKeys("99999999");
			ClickOnSignin.click();
		}	
	public void RealEsate()
		{
			ClickOnRealEstate.click();
			ClickOnRN10.click();
			ClickOnAgree.click();
		}
	public void DeedofGranting()
		 {	
			 ClickOnDeedOfGranting.click();
			 ClickOnRegisterGrant.click();
			 ClickOnProceed.click();
		 }
	public void GrantingReleation() throws Exception 
		{
		 
			EnterCitizenNumber.sendKeys("98079222");
			ClickOnSearch.click();
			Thread.sleep(3000);
			Select releation=new Select(SelectReleation);
			releation.selectByVisibleText("FATHER");
			EnterAge.sendKeys("45");
			EnterPhoneNumber.sendKeys("12345678");
			EnterEmail.sendKeys("QuranMohamad@gmail.com");
			Thread.sleep(5000);
		}
	
	
}
