package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class CreateOrgPage_Mod extends WebDriverMethodSource {
	//declare
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createbtn;
	@FindBy(name="accountname")
	private WebElement accountname;
	@FindBy(name="website")
	private WebElement website;
	@FindBy(name="employees")
	private WebElement emp;
	@FindBy(name="email2")
	private WebElement email2;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(name="industry")
	private WebElement indusDD;
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgmessage;
	
	//initialize
	public CreateOrgPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilize
	public WebElement getCreatebtn()
	{
		return createbtn;
	}
	public WebElement getAccountname() {
		return accountname;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmp() {
		return emp;
	}

	public WebElement getEmail2() {
		return email2;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getIndusDD()
	{
		return indusDD;
	}
	public WebElement getorgMessage() {
		return orgmessage;
	}

	//business logic
	public void CreateOrganization(String org,WebDriver driver)
	{
		createbtn.click();
		accountname.sendKeys(org);
		savebtn.click();
		explictwait(driver, 10, orgmessage);
		Assert.assertTrue((orgmessage.getText()).contains(org), "Oraganization is not created");
		System.out.println("Organization is created");
	}
	public void CreateOrganization(String org,String web,int empnos,String email,String indus)
	{
		createbtn.click();
		accountname.sendKeys(org);
		website.sendKeys(web);
		emp.sendKeys(""+empnos);
		email2.sendKeys(email);
		selectbycontainstext(indusDD, indus);
		savebtn.click();
		Assert.assertTrue((orgmessage.getText()).contains(org),"Organization is not created");
		System.out.println("Organization created successfully");
	}
}
