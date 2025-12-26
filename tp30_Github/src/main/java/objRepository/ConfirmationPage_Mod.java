package objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class ConfirmationPage_Mod extends WebDriverMethodSource {
	//declare
	
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgmessage;
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement vencrmmsg;
	
	//initialize
	public ConfirmationPage_Mod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public WebElement getMessage() {
		return orgmessage;
	}
	public WebElement getVenmsg()
	{
		return vencrmmsg;
	}
	
	//business logic
	public void message(String exp,WebDriver driver)
	{
		explictwait(driver, 10, orgmessage);
		String msg=orgmessage.getText();
		Assert.assertTrue(msg.contains(exp), exp+" is Not Created");
		System.out.println(exp+" is Cerated Successfully");
	}
	public void loginmessage(WebDriver driver,String exp)
	{
		//explictwait(driver, 10, orgmessage);
		String res=driver.getTitle();
		if(res.contains(exp))
			System.out.println("Login Successfully");
		else
			System.out.println("Could not loggingin");
	}
	public void venMsg(String exp,WebDriver driver)
	{
		explictwait(driver, 10, vencrmmsg);
		String msg=vencrmmsg.getText();
		if(msg.contains(exp))
		{
			System.out.println(exp+" :created successfully");
		}
		else
			System.out.println(exp+"not created");
	}
	
//	public void promsg(String exp,WebDriver driver)
//	{
//		explictwait(driver, 10, promessage);
//		String msg=promessage.getText();
//		if(msg.contains(exp))
//		{
//			System.out.println(exp+" :created successfully");
//		}
//		else
//			System.out.println(exp+"not created");
//	}
	
}
