package productModule;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;
import genericUtility.DataFromExcel;
import genericUtility.JProperties;
import genericUtility.RandomNumGenerator;
import genericUtility.WebDriverMethodSource;
import objRepository.CreateProductPage_Mod;
import objRepository.HomePage_Mod;
import objRepository.LoginPage_Mod;
import objRepository.ProductPage_Mod;

public class CheckCreatedProduct_Test extends BaseClass_Utilities {
	@Ignore
	@Test(groups = "regression")
	public void createproduct() throws IOException {
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
//		
		
		String pro_name=exLib.readSpecificDataFromExcel("Products", 0, 0)+ranLib.randNum(50);
		
//		if(BROWSER.equalsIgnoreCase("chrome"))
//			driver= new ChromeDriver();
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//			driver= new FirefoxDriver();
//		else if(BROWSER.equalsIgnoreCase("edge"))
//			driver= new EdgeDriver();
//		
//		driver.get(URL);
//		wLib.maxiwindow(driver);
//		//driver.manage().window().maximize();
//		wLib.waitforallele(driver, 10);
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		
////		Login to application
//		//driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
//		LoginPage_Mod lp= new LoginPage_Mod(driver);
//		lp.businessLog(USERNAME, PASSWORD);
//		
//		Click the 'Products' button
		//driver.findElement(By.linkText("Products")).click();
		HomePage_Mod hp= new HomePage_Mod(driver);
		hp.clickOnProducts();
		
//		Click create product lookup image
		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		
//		Enter Product name data into textfield
		//driver.findElement(By.name("productname")).sendKeys(pro_name);
		CreateProductPage_Mod crp= new CreateProductPage_Mod(driver);
		crp.createProduct(pro_name);
//		Click the 'Save' button
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
//		Click the Products link
		//driver.findElement(By.linkText("Products")).click();
		ProductPage_Mod prop= new ProductPage_Mod(driver);
		
		prop.checkProduct(hp,pro_name);
//		Check the created product in list validate
//		List<WebElement> pro=driver.findElements(By.xpath("//a[@title='Products']"));
//		
//		for(WebElement ele:pro)
//		{
//			String mypro=ele.getText();
//			if(mypro.equals(pro_name))
//				System.out.println("Product is created and added to list");
//		}
//		
//		Click administrator icon and click signout button
//		Actions ac= new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).click().perform();
//		ac.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
//		
		//hp.clickOnSignout(driver);
		System.out.println("****Executed******");
		//driver.quit();
	}
}
