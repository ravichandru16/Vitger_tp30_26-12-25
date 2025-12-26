package objRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class CalendarPage_Mod extends WebDriverMethodSource{
	
	//declare
	@FindBy(xpath="//td[@class='calAddButton']")
	private WebElement addbtn;
	@FindBy(linkText = "Meeting")
	private WebElement meeting;
	@FindBy(name="subject")
	private WebElement eventname;
	@FindBy(name="startfmt")
	private WebElement timeDD;
	@FindBy(name="eventsave")
	private WebElement savebtn;
	@FindBy(xpath="//td/a[@href]/span")
	private WebElement result;
	@FindBy(xpath="//a[text()='Day']")
	private WebElement daybtn;
	
	//initialize
	public WebElement getAddbtn()
	{
		return addbtn;
	}
	public WebElement getMeeting()
	{
		return meeting;
	}
	public WebElement getEventname()
	{
		return eventname;
	}
	public WebElement getAmorPm()
	{
		return timeDD;
	}
	public WebElement getSavebtn()
	{
		return savebtn;
	}
	public WebElement getResult()
	{
		return result;
	}
	public WebElement getDaybtn()
	{
		return daybtn;
	}
	
	//utilize
	public CalendarPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//business logic
	public void createEvent(WebDriver driver,String name,String time)
	{
		daybtn.click();
		movetoelementandclick(driver, addbtn, meeting);
		eventname.sendKeys(name);
		selectbycontainstext(timeDD, time);
		//movetoelement(driver, savebtn);
		savebtn.click();
		explictwait(driver, 5, driver.findElement(By.xpath("//div[@id='hrView']")));
		String tab=driver.findElement(By.xpath("//div[@id='hrView']")).getText();
		Assert.assertTrue(tab.contains(name), "Event not created");
		System.out.println("Event created succesfully");
	}
}
