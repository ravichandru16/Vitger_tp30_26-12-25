package objRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class ProductPage_Mod extends WebDriverMethodSource{
	//declare
	@FindBy(name="search_text")
	private WebElement search;
	@FindBy(name="submit")
	private WebElement searchbtn;
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deletebtn;
	@FindBy(xpath="//a[@title='Products']")
	private List<WebElement> allpro;
	
	//initialize
	
	public ProductPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilize
	

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}
	public List<WebElement> getAllpro()
	{
		return allpro;
	}
	//business logic
	public void checkProduct(HomePage_Mod hLib,String exp)
	{
		boolean a=false;
		hLib.clickOnProducts();
		for(WebElement ele:allpro)
		{
			if(ele.getText().contains(exp))
			{
				Assert.assertTrue(a,"Product not found");
				a=true;
				break;
			}
			Assert.assertTrue(!a,"Product has Found");
		}	
	}
	public void deleteProduct(WebDriver driver,String del)
	{
		for(WebElement ele:allpro)
		{
			String name=ele.getText();
			if(name.equals(del))
			{
				driver.findElement(By.xpath("//a[@title='Products' and contains(.,'"+del+"')]/../preceding-sibling::td/input")).click();
				break;
			}
		}
		deletebtn.click();
		acceptalert(driver);
		waitforallele(driver, 10);
		refreshPage(driver);
		boolean a=false;
		for(WebElement ele:allpro)
		{
			if(ele.getText().contains(del))
			{
				a=true;
				break;
			}
		}
		Assert.assertTrue(a,"Product is not Deleted");
		System.out.println("Product is Deleted");
	}
}
