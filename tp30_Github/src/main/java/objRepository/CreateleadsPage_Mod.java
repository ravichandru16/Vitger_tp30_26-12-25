package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateleadsPage_Mod {
	//declare
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createlead;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="company")
	private WebElement company;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement msg;
	
	//initialize
	public CreateleadsPage_Mod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilize
	public WebElement getCreatelead() {
		return createlead;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getMsg()
	{
		return msg;
	}
		
	//business logic
	public void createLeads(String lead,String comp)
	{
		createlead.click();
		lastname.sendKeys(lead);
		company.sendKeys(comp);
		savebtn.click();
		Assert.assertTrue(msg.getText().contains(lead), "Lead Not Created");
		System.out.println("Lead Created Successfully");
	}
}
