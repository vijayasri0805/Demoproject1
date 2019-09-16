package com.upgrade.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PortalsPage {
WebDriver driver;
	
	public PortalsPage(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }

	@FindBy(name= "desiredAmount")
    private WebElement DesiredAmount;


    @FindBy(xpath = "//select[@data-auto ='dropLoanPurpose']")
    private WebElement Purpose;

    @FindBy(xpath = "//button[@data-auto ='CheckYourRate']")
    private WebElement SubmitButton;
    @FindBy(xpath = "//input[@name='borrowerFirstName']")
    private WebElement FirstName;
    
    @FindBy(xpath = "//input[@name='borrowerLastName']")
    private WebElement LastName;
    
@FindBy(xpath = "//input[@name='borrowerStreet']" )
private WebElement Street;

    @FindBy(xpath ="//input[@name='borrowerCity']")
    private WebElement City;
  
    @FindBy(xpath ="//input[@name='borrowerState']")
    private WebElement State;
    
   @FindBy(xpath = "//input[@name='borrowerZipCode']")
   private WebElement ZipCode;
    
  @FindBy(xpath = "//input[@name='borrowerDateOfBirth']")
  private WebElement DOB;
 
    @FindBy(xpath = "//input[@name='borrowerIncome']")
    private WebElement BorrowserIncome;
  
    	@FindBy(xpath = "//input[@name='borrowerAdditionalIncome']")
    	private WebElement BorrowserAdditionalIncome;
  
  @FindBy(xpath = "//input[@name='username']")
  private WebElement Username;
  @FindBy(xpath = "//input[@name='password']")
  private WebElement Password;
  
  @FindBy(xpath="//form/div[3]/div")
  private WebElement Terms;
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
    
    public WebElement getDesiredAmount() {
        return DesiredAmount;
    }

    public WebElement getpurpose() {
        return Purpose;
    }

    public WebElement getSubmitButton() {
        return SubmitButton;
    
    }
    public WebElement getBorrowerFirstName() {
        return FirstName;
    }

    public WebElement getBorrowerLastName() {
        return LastName;
    }

    public WebElement getBorrowerStreet() {
        return Street;
    
    }
    public WebElement getBorrowerCity() {
    	return City;
    }
    public WebElement getBorrowerState() {
    	return State;
    }
    public WebElement getBorrowerZipCode() {
    	return ZipCode;
    }
    
   
    public WebElement getBorrowerDateOfBirth() {
    	return DOB;
    }
    
    public WebElement getBorrowerIncome() {
    	return BorrowserIncome;
    }
    public WebElement getBorrowerAdditionalIncome() {
    	return BorrowserAdditionalIncome;
    }
    public WebElement getUserName() {
    	return Username;
    }
    public WebElement getPassword() {
    	return Password;
    }
    public WebElement getTerms() {
        return Terms;
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
