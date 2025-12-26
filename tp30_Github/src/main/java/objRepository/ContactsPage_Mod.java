package objRepository;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class ContactsPage_Mod extends WebDriverMethodSource{
	//declare
	@FindBy(name="search_text")
	private WebElement searchtxt;
	@FindBy(name="submit")
	private WebElement searchbtn;
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createbtn;
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deletebtn;
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendmailbtn;
	@FindBy(name="Select")
	private WebElement selectbtn;
	@FindBy(name="subject")
	private WebElement subjecttxtfield;
	@FindBy(name="Send")
	private WebElement sendbtn;
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr")
	private List<WebElement> conlist;
	
	//initialize
	public ContactsPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public WebElement getSearchtxt() {
		return searchtxt;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getCreatebtn() {
		return createbtn;
	}
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	public WebElement getSendmailbtn()
	{
		return sendmailbtn;
	}

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getSubjecttxtfield() {
		return subjecttxtfield;
	}

	public WebElement getSendbtn() {
		return sendbtn;
	}
	public List<WebElement> getConlist()
	{
		return conlist;
	}
	
	//business logic
	public void checkContacts(WebDriver driver,String name1)
	{
		for(WebElement ele:conlist)
		{
			String nameele=ele.getText();
			if(nameele.contains(name1))
				driver.findElement(By.name("selected_id")).click();
		}
		deletebtn.click();
		acceptalert(driver);
		//explictwait(driver, 10, deletebtn);
		//refreshPage(driver);
		waitforallele(driver, 5);
		boolean a=false;
		for(WebElement ele: conlist)
		{
			if(ele.getText().contains(name1))
				{
				System.out.println("Delete button is not working");
				a=true;
				break;
				}
		}
		Assert.assertTrue(!a);
		System.out.println("Delete button is working");
	}

	
	public void sendMail(WebDriver driver)
	{
		selectbycontainstext(driver.findElement(By.id("bas_searchfield")), "First Name");
		searchbtn.click();
		
	}
}
