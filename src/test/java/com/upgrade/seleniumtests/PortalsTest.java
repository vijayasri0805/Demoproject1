package com.upgrade.seleniumtests;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.upgrade.SeleniumHelperClass.TestBase;
import com.upgrade.page.CompareRates;
import com.upgrade.page.PortalsPage;

import junit.framework.Assert;

public class PortalsTest extends TestBase{

	
	   static String url = "https://www.credify.tech/phone/nonDMFunnel";
	     static String url2 = "https://www.credify.tech/portal/login";
	     static String s  = "sc-fAjcbJ" ;
	     String homepage;
	    static HashMap<String,String> Initial = new HashMap<String,String>();

@BeforeClass
	    public void setUp() throws InterruptedException {
	    	PortalsPage login = new PortalsPage(getDriver());
	        getUrl(url);
	        login.getDesiredAmount().sendKeys("2000");
	        Select statusDropdown=new Select(login.getpurpose());
	         statusDropdown.selectByVisibleText("Business");
	         Thread.sleep(2000);
	         login.getSubmitButton().click();
	         Thread.sleep(2000);
	         login.getBorrowerFirstName().sendKeys("Vijaya");
	         login.getBorrowerLastName().sendKeys("Rondla");
	         login.getBorrowerStreet().sendKeys("37940 Lavender Cmn");
	         login.getBorrowerCity().sendKeys("Fremont");
	         login.getBorrowerState().sendKeys("CA");
	         login.getBorrowerZipCode().sendKeys("94536");
	         login.getBorrowerDateOfBirth().sendKeys("08/05/1987");
	         login.getBorrowerIncome().sendKeys("125000");
	        // Thread.sleep(2000);
	         login.getBorrowerAdditionalIncome().sendKeys("30000");
	         login.getUserName().sendKeys("vijaya.sri085@gmail.com");
	         login.getPassword().sendKeys("Fhlb2009!");
	         Thread.sleep(1000);
	         login.getTerms().click();
	         Thread.sleep(1000);
	         login.submitFinal().click();
	       Thread.sleep(3000);
	           Initial.put("LoanAmt", login.getLoanAmount().getText().replaceAll("[^\\.0123456789]",""));
	         //login.getLoanAmount().getText().replaceAll("[^\\.0123456789]","");
	         Initial.put("AA", login.getAA().getText().replaceAll("[^\\.0123456789]",""));
	         Initial.put("BB", login.getBB().getText().replaceAll("[^\\.0123456789]",""));
	         Initial.put("CC", login.getCC().getText().replaceAll("[^\\.0123456789]",""));
	         Initial.put("DD", login.getDD().getText().replaceAll("[^\\.0123456789]",""));
	    }
	    
	    @Test(priority=0)
		     public void select_list() throws InterruptedException{
CompareRates Compare = new CompareRates(getDriver());    
	        getUrl(url2);
	        Thread.sleep(2000);
	        Compare.getUserName().sendKeys("vijaya.sri085@gmail.com");
	         Compare.getPassword().sendKeys("Fhlb2009!");
	         Compare.submitFinal().click();
	         Thread.sleep(2000);
	        Initial.put("LoanAmtF", Compare.getLoanAmount().getText().replaceAll("[^\\.0123456789]",""));
	         //login.getLoanAmount().getText().replaceAll("[^\\.0123456789]",""); 
	        
	        Initial.put("AAF", Compare.getAA().getText().replaceAll("[^\\.0123456789]",""));
	        
	        Initial.put("BBF", Compare.getBB().getText().replaceAll("[^\\.0123456789]",""));         
	        
	       
	        Initial.put("CCF", Compare.getCC().getText().replaceAll("[^\\.0123456789]","")); 
	        
	        Initial.put("DDF", Compare.getDD().getText().replaceAll("[^\\.0123456789]",""));
	        
		      }
	    @Test(priority=1,description = "Check the Loan amount expected and Actual are equal")
	    public void check_Loan_Amount_are_Equal()
	    {
	    	Reporter.log("Executing test case check_Loan_Amount_are_Equal" );
	  
	    	Assert.assertEquals(Initial.get("LoanAmt"),Initial.get("LoanAmtF"));
	    }
	    @Test(priority=2)
	    public void check_Monthly_Payment_Is_Equal()
	    {
	    	
	    	Assert.assertEquals(Initial.get("AA"),Initial.get("AAF"));
	    }

	    @Test(priority=3)
	    public void check_Month_Termt_Is_Equal()
	    {
	    	
	    	Assert.assertEquals(Initial.get("BB"),Initial.get("BBF"));
	    }
	    @Test(priority=4)
	    public void check_InterestRate_Is_Equal()
	    {
	    	
	    	Assert.assertEquals(Initial.get("CC"),Initial.get("CCF"));
	    }
	    @Test(priority=5)
	    public void check_APR_Is_Equal()
	    {
	    	
	    	Assert.assertEquals(Initial.get("DD"),Initial.get("DDF"));
	    }
	    

}