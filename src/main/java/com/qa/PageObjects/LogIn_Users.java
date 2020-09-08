package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;

public class LogIn_Users extends TestBase{
	
	
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement signin;
	
	@FindBy(xpath="//select[contains(@class,'MuiNativeSelect-root MuiNativeSelect-select')]")
	WebElement ClickOnSelect;
	
	@FindBy(id="txtMobileNumber")
	WebElement EnterMobileNumber;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(xpath="//li[@class='sign-in']//a[1]")
	WebElement ClickOnLogout;
	
	
	
	@FindBy(name="phone")
	WebElement EnterMoHMobileNumber;
	
	@FindBy(xpath="//div[contains(@class,'wrapper fadeInDown')]//button[1]")
	WebElement ClickMoHSignin;
	
	@FindBy(xpath="//div[@class='logout-icon']//img[1]")
	WebElement ClickonLogout;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement ClickonOK;
	
	
	
	

	public LogIn_Users() {
		PageFactory.initElements(driver, this);
	}
	
	public void GCCSignin() throws InterruptedException
	{
		signin.click();
		Thread.sleep(2000);
		Select sel=new Select(ClickOnSelect);
		sel.selectByIndex(5);
		Thread.sleep(3000);
		EnterMobileNumber.sendKeys("99999999");
		ClickOnSignin.click();
		Thread.sleep(2000);
		ClickOnLogout.click();
	}	
	
	public void CitizenSignin() throws InterruptedException
	{
		signin.click();
		Thread.sleep(2000);
		Select sel=new Select(ClickOnSelect);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		EnterMobileNumber.sendKeys("90123456");
		ClickOnSignin.click();
		Thread.sleep(2000);
		ClickOnLogout.click();
	}	
	
	public void ForeignerSignin() throws InterruptedException
	{
		signin.click();
		Thread.sleep(2000);
		Select sel=new Select(ClickOnSelect);
		sel.selectByIndex(7);
		Thread.sleep(3000);
		EnterMobileNumber.sendKeys("88123456");
		ClickOnSignin.click();
		Thread.sleep(2000);
		ClickOnLogout.click();
	}	
	
	public void ApplicationReviewerSignin() throws InterruptedException
	{
		EnterMoHMobileNumber.sendKeys("98076901");
		ClickMoHSignin.click();
		Thread.sleep(2000);
		ClickonLogout.click();
		Thread.sleep(2000);
		ClickonOK.click();
		
	}
	
	public void ApplicationVerifierSignin() throws InterruptedException
	{
		EnterMoHMobileNumber.sendKeys("98056805");
		ClickMoHSignin.click();
		Thread.sleep(2000);
		ClickonLogout.click();
		Thread.sleep(2000);
		ClickonOK.click();
		
	}
	
	public void MoHHODSignin() throws InterruptedException
	{
		EnterMoHMobileNumber.sendKeys("98076806");
		ClickMoHSignin.click();
		Thread.sleep(2000);
		ClickonLogout.click();
		Thread.sleep(2000);
		ClickonOK.click();
		
	}

	
	
	

}
