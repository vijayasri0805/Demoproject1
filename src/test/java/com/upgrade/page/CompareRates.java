package com.upgrade.page;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompareRates {
	WebDriver driver;
	
	public CompareRates(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }

	 @FindBy(xpath = "//input[@name='username']")
	  private WebElement Username;
	  @FindBy(xpath = "//input[@name='password']")
	  private WebElement Password;
	  @FindBy(xpath = "//button[@type = 'submit']")
	  private WebElement SubmitFinal;
	
	@FindBy(xpath ="//div[@class = 'text--align-center']/div[1]/div[2]/span[2]" )
	  private WebElement LoanAmount;
	  @FindBy(xpath ="//div[@class = 'text--align-center']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]" )
	  private WebElement AA;
	  @FindBy(xpath ="//div[@class = 'text--align-center']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
	  private WebElement BB;
	  @FindBy(xpath ="//div[@class = 'text--align-center']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	  private WebElement CC;
	  @FindBy(xpath ="//div[@class = 'text--align-center']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
	  private WebElement DD;
	  
	  public WebElement getUserName() {
	    	return Username;
	    }
	    public WebElement getPassword() {
	    	return Password;
	    }
	    public WebElement submitFinal()
	    {
	    	return SubmitFinal;
	    }
	  public WebElement getLoanAmount() {
	    	return  LoanAmount;
	    }
	    public WebElement getAA() {
	    	return AA;
	    }
	    public WebElement getBB() {
	        return BB;
	    }
	    public WebElement getCC()
	    {
	    	return CC;
	    }
	    public WebElement getDD()
	    {
	    	return DD;
	    }
}


