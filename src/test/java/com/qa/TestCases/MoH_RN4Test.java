package com.qa.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.MoH_RN10;
import com.qa.PageObjects.MoH_RN4;

public class MoH_RN4Test extends TestBase {

	MoH_RN4 RN4;
	public MoH_RN4Test() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initalization();
		RN4=new MoH_RN4();
		
	}
	
	 @Test
	    public void signpage() throws Exception
	    {
	    	RN4.validatesignpage();
	    }
	
}
