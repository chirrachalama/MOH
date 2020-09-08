package com.qa.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.MoH_RN10;

public class MoH_RN10Test extends TestBase {
	
	MoH_RN10 RN10;
	public MoH_RN10Test() {
		super();
	}
	
	
	@BeforeTest
	public void setup() 
	{
		
		initalization();
		RN10=new MoH_RN10();
		
	}
	
	@Test(priority=1)
	public void signin() throws InterruptedException
	{
		RN10.Signin();
	}
	
	@Test(priority=2)
	public void RealEstate() 
	{
		RN10.RealEsate();
	}
	
	@Test(priority=3)
	public void DeedofGranting() throws InterruptedException 
	{
		RN10.DeedofGranting();
	}
	
	@Test(priority=4)
	public void GrantingReleation() throws Exception
	{
		RN10.GrantingReleation();
	}

}
