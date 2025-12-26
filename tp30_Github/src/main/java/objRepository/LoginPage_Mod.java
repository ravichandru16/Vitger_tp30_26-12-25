package objRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage_Mod {
	//declare
	@FindBy(name="user_name")
	private WebElement username;
	@FindBy(name="user_password")
	private WebElement password;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	//initialize
	public LoginPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public WebElement getUsername(WebElement username)
	{
		return username;
	}
	public WebElement getPassword(WebElement password)
	{
		return password;
	}
	public WebElement getLoginbtn(WebElement loginbtn)
	{
		return loginbtn;
	}
	
	public void businessLog(String Username, String Password,WebDriver driver)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginbtn.click();
		
	}
}
