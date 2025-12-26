package objRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class CreateContactPage_Mod extends WebDriverMethodSource {
	//declare
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createbtn;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement orgselect;
	@FindBy(name="search_text")
	private WebElement searchorg;
	@FindBy(name="search")
	private WebElement searchbtn;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	@FindBy(xpath="//div[@id='ListViewContents']//table[@class='small']//tr/td/a")
	private List<WebElement> orglist;
	@FindBy(xpath="//a[@title='Contacts']")
	private List<WebElement> conlist;
	@FindBy(name="firstname")
	private WebElement fname;
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement delbtn;
	//initialize
	public CreateContactPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	
	public WebElement getCreatebtn()
	{
		return createbtn;
	}
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getOrgselect() {
		return orgselect;
	}

	public WebElement getSearchorg() {
		return searchorg;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getSavebtn()
	{
		return savebtn;
	}
	public WebElement getCancelbtn()
	{
		return cancelbtn;
	}
	public List<WebElement> getOrglist()
	{
		return orglist;
	}
	public List<WebElement> getContactList()
	{
		return conlist;
	}
	public WebElement getFname()
	{
		return fname;
	}
	public WebElement getDelbtn()
	{
		return delbtn;
	}
	
	//business logic
	public void createContact(WebDriver driver, String conname,String orgname)
	{
		explictwait(driver, 5, createbtn);
		createbtn.click();
		lastname.sendKeys(conname);
		orgselect.click();
		switchchildwin(driver, "Accounts&action");
		searchorg.sendKeys(orgname);
		searchbtn.click();
		driver.findElement(By.linkText(""+orgname+"")).click();
		switchchildwin(driver, "Contacts&action");
		savebtn.click();
		String msg=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(msg.contains(conname), conname+" is Not Created");
		System.out.println(conname+" is Cerated Successfully");
	}
	
	public void createContact(WebDriver driver, String conname)
	{
		createbtn.click();
		lastname.sendKeys(conname);
		cancelbtn.click();
		waitforallele(driver, 10);
		//boolean a=false;
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Contacts"), "Cancel button is not working");
		System.out.println("Cancel button is working");
	}
	
//	public void createContact(String name,WebDriver driver,WebElement ele)
//	{
//		explictwait(driver, 20, createbtn);
//		createbtn.click();
//		explictwait(driver, 20, ele);
//		selectbycontainstext(ele, "Mr.");
//		fname.sendKeys(name);
//		savebtn.click();
//		boolean a=false;
//		for(WebElement elem:conlist)
//		{
//			if(elem.getText().equals(name))
//			{
//				System.out.println("Contact created successfully");
//				a=true;
//				break;
//			}	
//		}
//		if(!(a))
//			System.out.println("Contact not created");
//		
//	}
	
	public void createByMulti()
	{
		createbtn.click();
		//selectbycontainstext(ele, "Mr.");
		
	}
	
	
}
