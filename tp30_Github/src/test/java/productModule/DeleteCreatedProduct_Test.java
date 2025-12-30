package productModule;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;
import genericUtility.DataFromExcel;
import genericUtility.JProperties;
import genericUtility.RandomNumGenerator;
import genericUtility.WebDriverMethodSource;
import objRepository.HomePage_Mod;
import objRepository.LoginPage_Mod;
import objRepository.ProductPage_Mod;

public class DeleteCreatedProduct_Test extends BaseClass_Utilities {
	@Test(groups = "regression")
	public void deleteproduct() throws IOException {
		//Launch the browser
	
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
		
		String del=exLib.readSpecificDataFromExcel("Products", 0, 0);
		
//		if(BROWSER.equalsIgnoreCase("chrome"))
//			driver= new ChromeDriver();
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//			driver= new FirefoxDriver();
//		else if(BROWSER.equalsIgnoreCase("edge"))
//			driver= new EdgeDriver();
//		
//		driver.get(URL);
		
//		LoginPage_Mod lp= new LoginPage_Mod(driver);
//		lp.businessLog(USERNAME, PASSWORD);
//		
		HomePage_Mod hp= new HomePage_Mod(driver);
		hp.clickOnProducts();
		
		
			

//		Click checkbox which should be deleted
		ProductPage_Mod prp= new ProductPage_Mod(driver);
		prp.deleteProduct(driver, del);
//		List<WebElement> allele=driver.findElements(By.xpath("//a[@title='Products']"));

		
//		for(WebElement ele:allele )
//		{
//			String name=ele.getText();
//			if(name.contains(del))
//			{
//				driver.findElement(By.xpath("//a[@title='Products' and contains(.,'"+del+"')]/../preceding-sibling::td/input")).click();
//				break;
//			}
//		}
		
		//driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		
		//driver.switchTo().alert().accept();
		
		//driver.navigate().refresh();
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Product Name"))));
		//validate
//		List<WebElement>allname=driver.findElements(By.xpath("//a[@title='Products']"));
//		for(WebElement name:allname)
//		{
//			String delname=name.getText();
//			if(delname.equals(del))
//				System.out.println("item not deleted");
//		}
//		System.out.println("item deleted");
		
//		Click administrator icon and click signout button
//		hp.clickOnSignout(driver);
//		driver.quit();
		System.out.println("---Executed---");
	}
}
