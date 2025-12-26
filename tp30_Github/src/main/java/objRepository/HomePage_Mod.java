package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverMethodSource;

public class HomePage_Mod extends WebDriverMethodSource{

	//Declaration
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	@FindBy(linkText = "Calendar")
	private WebElement calendar;
	@FindBy(linkText = "Leads")
	private WebElement leads;
	@FindBy(linkText = "Organizations")
	private WebElement organizations;
	@FindBy(linkText = "Contacts")
	private WebElement contacts;
	@FindBy(linkText = "Products")
	private WebElement products;
	@FindBy(linkText = "More")
	private WebElement more;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminlink;
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	@FindBy(linkText = "Vendors")
	private WebElement vendors;
	//initialization
	public HomePage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getHome()
	{
		return home;
	}
	public WebElement getCalendar()
	{
		return calendar;
	}
	public WebElement getLeads()
	{
		return leads;
	}
	public WebElement getOrganizations()
	{
		return organizations;
	}
	public WebElement getContacts()
	{
		return contacts;
	}
	public WebElement getProducts()
	{
		return products;
	}
	public WebElement getVendors()
	{
		return vendors;
	} 
	public WebElement getAdmin()
	{
		return adminlink;
	}
	public WebElement getSignout()
	{
		return signout;
	}
	public WebElement getMore()
	{
		return more;
	}
	
	//business logic
	public void clickOnHomeLink()
	{
		home.click();
	}
	public void clickOnCalendarsLink()
	{
		calendar.click();
	}
	public void clickOnLeadsLink()
	{
		leads.click();
	}
	public void clickOnOrganizationLink()
	{
		organizations.click();
	}
	public void clickOnContactsLink()
	{
		contacts.click();
	}
	public void clickOnProducts()
	{
		products.click();
	}
	public void clickOnVendors(WebDriver driver)
	{
		movetoelementandclick(driver, more, vendors);
	}
	public void clickOnSignout(WebDriver driver)
	{
		movetoelementandclick(driver, adminlink, signout);
	}
	
	
}
