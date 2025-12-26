package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage_Mod {
	//declare
	@FindBy(linkText = "Vendors")
	private WebElement vendors;
	@FindBy(name="search_text")
	private WebElement search;
	@FindBy(name="submit")
	private WebElement searchbtn;
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deletebtn;
	
	//initialize
	public VendorsPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public WebElement getVendors() {
		return vendors;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	
	//business logic
	public void createVendor()
	{
		
	}
}
