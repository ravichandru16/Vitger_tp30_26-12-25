package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreatevendorPage_Mod {
	//declare
	@FindBy(name="vendorname")
	private WebElement vendorname;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createbtn;
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement vencrmmsg;
	//initialize
	public CreatevendorPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize

	public WebElement getVendorname() {
		return vendorname;
	}
	public WebElement getVenmsg()
	{
		return vencrmmsg;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getcreatebtn()
	{
		return createbtn;
	}
	
	//business logic
	public void createVendor(String name)
	{
		createbtn.click();
		vendorname.sendKeys(name);
		savebtn.click(); 
		Assert.assertTrue((vencrmmsg.getText()).contains(name),"Vendor not created");
		System.out.println("Vendor created Successfully");
	}
}
