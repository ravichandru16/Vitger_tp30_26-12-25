package productModule;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;
import objRepository.CreateProductPage_Mod;
import objRepository.CreatevendorPage_Mod;
import objRepository.HomePage_Mod;


@Listeners
public class CreateProductbyVendors_Test extends BaseClass_Utilities {
	@Test(retryAnalyzer = genericUtility.IretryAnalyzer.class)
	public void createproductbyven() throws IOException {
		//launch the browser
//		WebDriver driver=null;
//		WebDriverMethodSource wLib= new WebDriverMethodSource();
//		JProperties jLib= new  JProperties();
//		RandomNumGenerator ranLib= new RandomNumGenerator();
//		DataFromExcel exLib= new DataFromExcel();
//		
//		String BROWSER=jLib.readDataFromProperties("browser");
//		String URL=jLib.readDataFromProperties("url");
//		String USERNAME=jLib.readDataFromProperties("username");
//		String PASSWORD=jLib.readDataFromProperties("password");
		
		String ven_name=exLib.readSpecificDataFromExcel("Vendors", 0, 0)+ranLib.randNum(50);
		String pro_name=exLib.readSpecificDataFromExcel("Products", 0, 0)+ranLib.randNum(50);
		
//		if(BROWSER.equalsIgnoreCase("chrome"))
//			driver= new ChromeDriver();
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//			driver= new FirefoxDriver();
//		else if(BROWSER.equalsIgnoreCase("edge"))
//			driver= new EdgeDriver();
//		
//		driver.get(URL);
//		
		//String parentid=driver.getWindowHandle();
//		Login to Application 
		//driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
//		LoginPage_Mod lp= new LoginPage_Mod(driver);
//		lp.businessLog(USERNAME, PASSWORD);
//		Click the 'More' button
		//driver.findElement(By.linkText("More")).click();
		HomePage_Mod hp= new HomePage_Mod(driver);
		hp.clickOnVendors(driver);
		
//		Click the 'vendors' link
		//driver.findElement(By.name("Vendors")).click();
		
//		Click the create vendor'+' lookup image
		//driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
		
//		Enter the vendor name into textfield and click the 'Save' button
//		driver.findElement(By.name("vendorname")).sendKeys(ven_name);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		CreatevendorPage_Mod crv= new CreatevendorPage_Mod(driver);
		crv.createVendor(ven_name);
		
		//wLib.waitforallele(driver, 5);
		//ConfirmationPage_Mod crmp= new ConfirmationPage_Mod(driver);
		//crmp.venMsg(ven_name,driver);
		//String act=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		
		//validate
//		if(act.contains(ven_name))
//			System.out.println("Vendor created");
//		else
//			System.out.println("Vendor not created");
		
//		Click the 'PRODUCTS' button
		//driver.findElement(By.linkText("Products")).click();
		hp.clickOnProducts();
		
//		Click the create product '+' lookup image
		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		CreateProductPage_Mod crp= new CreateProductPage_Mod(driver);
		//crp.createProduct(pro_name);
		crp.createProduct(driver, pro_name,ven_name);
//		Enter Product name data into textfield
		//driver.findElement(By.name("productname")).sendKeys(pro_name);
		
//		Click the select vendor '+' lookup image 
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		
//		Set<String>allwin=driver.getWindowHandles();
//		
//		for(String win:allwin)
//		{
//			driver.switchTo().window(win);
//			String currentti=driver.getTitle();
//			if(currentti.contains(expti))
//				break;
//		}
//		Enter the created vendor name into 'search' textfield and click 'search now' button
//		driver.findElement(By.name("search_text")).sendKeys(ven_name);
//		driver.findElement(By.name("search")).click();
		
//		Click the vendor name link
//		driver.findElement(By.linkText(ven_name));
//		driver.switchTo().window(parentid);
		
//		Click the 'Save' button
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		String act1=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		//validate
		//crmp.promsg(pro_name,driver);
//		if(act1.contains(pro_name))
//		{
//			System.out.println("Product created with vendor name");
//		}
//		else
//			System.out.println("Not created");
		
//		Click administrator icon and click signout button
//		Actions ac= new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).click().perform();
//		ac.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
		//hp.clickOnSignout(driver);
		System.out.println("*********Executed**************");
		//driver.quit();
	}
}
