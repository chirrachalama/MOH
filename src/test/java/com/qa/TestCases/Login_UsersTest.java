package com.qa.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.LogIn_Users;

public class Login_UsersTest extends TestBase {
	
	LogIn_Users log;
	public Login_UsersTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initalization();
		log=new LogIn_Users();
		
	}

	@Test(priority=1)
	public void Gccsignin() throws InterruptedException
	{
		log.GCCSignin();
	}
	
	@Test(priority=2)
	public void Citizensignin() throws InterruptedException
	{
		log.CitizenSignin();
	}
	
	@Test(priority=3)
	public void ForeignerSignin() throws InterruptedException
	{
		log.ForeignerSignin();
	}
	
	@Test(priority=4)
	public void MoHReviewerSignin() throws InterruptedException
	{
		MoHPortal();
		Thread.sleep(2000);
		log.ApplicationReviewerSignin();
		
	}
	
	@Test(priority=5)
	public void MoHSVerifierSignin() throws InterruptedException
	{
		//MoHPortal();
		Thread.sleep(2000);
		log.ApplicationVerifierSignin();
		
	}
	
	@Test(priority=6)
	public void MoHSHODSignin() throws InterruptedException
	{
		//MoHPortal();
		Thread.sleep(2000);
		log.MoHHODSignin();
		
	}

}