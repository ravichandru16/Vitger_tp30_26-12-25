package objRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverMethodSource;

public class CreateProductPage_Mod extends WebDriverMethodSource {
	//declare
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createbtn;
	@FindBy(name="productname")
	private WebElement productname;
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement addvendor;
	@FindBy(name="search_text")
	private WebElement search;
	@FindBy(name="search")
	private WebElement searchbtn;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath="//div[@id='ListViewContents']//table[@class='small']//tr/td/a")
	private List<WebElement> allven;
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement promessage;
	
	//initialize
	public CreateProductPage_Mod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilize
	public WebElement getCreatebtn()
	{
		return createbtn;	
	}
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getProMessage()
	{
		return promessage;
	}
	public WebElement getAddvendor() {
		return addvendor;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	public List<WebElement> getAllvendors()
	{
		return allven;
	}
	
	//business logic
	public void createProduct(String proname)
	{
		createbtn.click();
		productname.sendKeys(proname);
		savebtn.click();
	}
	public void createProduct(WebDriver driver,String proname,String name)
	{
		createbtn.click();
		productname.sendKeys(proname);
		addvendor.click();
		switchchildwin(driver, "Vendors&action");
		search.sendKeys(name);
		searchbtn.click();
//		
//		for(WebElement ven:allven)
//		{
//			//System.out.println("run");
//			String venname=ven.getText();
//			if(venname.equals(name))
//				{
//				ven.click();
//				break;
//				}
//		}
		driver.findElement(By.linkText(""+name+"")).click();
		switchchildwin(driver, "Products&action");
		savebtn.click();
		Assert.assertTrue((promessage.getText()).contains(proname), "Product not create");
		System.out.println("Product created successfully");	
	}
}
