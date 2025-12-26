package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	//declare
	@FindBy(xpath="//img[@title='Create Organization...']")
	private  WebElement createicon;
	@FindBy(name="search_text")
	private WebElement search;
	@FindBy(name="submit")
	private WebElement submit;
	
	//initialize
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public WebElement getCreateIcon()
	{
		return createicon;
	}
	public WebElement getSearch()
	{
		return search;
	}
	public WebElement getSubmit()
	{
		return submit;
	}
	
	//business logic
}
