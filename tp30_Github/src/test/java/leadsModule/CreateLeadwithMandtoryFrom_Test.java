package leadsModule;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;
import objRepository.CreateleadsPage_Mod;
import objRepository.HomePage_Mod;
//@Listeners(genericUtility.ListenersImplements.class)
public class CreateLeadwithMandtoryFrom_Test extends BaseClass_Utilities {
	//TS7
	@Test
	public void createlead()throws EncryptedDocumentException, IOException {
//		WebDriver driver=null;
//		
//		WebDriverMethodSource wLib= new WebDriverMethodSource();
//		JProperties pro= new JProperties();
//		DataFromExcel exLib= new DataFromExcel();
//		RandomNumGenerator ranLib= new RandomNumGenerator();
//		
//		String BROWSER=pro.readDataFromProperties("browser");
//		String URL=pro.readDataFromProperties("url");
//		String USERNAME=pro.readDataFromProperties("username");
//		String PASSWORD=pro.readDataFromProperties("password");
		
//		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\proper.properties");
//		
//		Properties pro= new Properties();
//		pro.load(fis);
//		String BROWSER=pro.getProperty("browser");
//		String URL=pro.getProperty("url");
//		String USERNAME=pro.getProperty("username");
//		String PASSWORD=pro.getProperty("password");
		
		//launch the browser
//		if(BROWSER.equalsIgnoreCase("chrome"))
//			driver= new ChromeDriver();
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//			driver= new FirefoxDriver();
//		else if(BROWSER.equalsIgnoreCase("edge"))
//			driver= new EdgeDriver();
		
		//Random num
//		Random rand= new Random();
//		int ran=rand.nextInt(50);
		
		//launch the application
//		driver.get(URL);
		
//		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		wLib.maxiwindow(driver);
//		wLib.waitforallele(driver, 5);
		
		//get data from excel
//		FileInputStream fis1= new FileInputStream("src\\test\\resources\\Day4.xlsx");
//		Workbook wb=WorkbookFactory.create(fis1);
//		Sheet sh=wb.getSheet("Leads");
//		String lead=sh.getRow(0).getCell(0).getStringCellValue()+ranLib.randNum(50);
//		String cname=sh.getRow(1).getCell(0).getStringCellValue();
		String lead=exLib.readSpecificDataFromExcel("Leads", 0, 0)+ranLib.randNum(50);
		String cname=exLib.readSpecificDataFromExcel("Leads", 1, 0);
		
		
//		Login to the application
//		LoginPage_Mod lp= new LoginPage_Mod(driver);
//		lp.businessLog(USERNAME, PASSWORD);
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
		
//		Click the 'LEADS' button
		HomePage_Mod hp= new HomePage_Mod(driver);
		hp.clickOnLeadsLink();
		//driver.findElement(By.linkText("Leads")).click();
		CreateleadsPage_Mod crl= new CreateleadsPage_Mod(driver);
		crl.createLeads(lead, cname);
//		Click the create lead '+' lookup image
		//driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
//		Click and Enter lastname data into to textfield
//		driver.findElement(By.name("lastname")).sendKeys(lead);
//	
////		Click and Enter Company data into to textfield and click the 'Save' button
//		driver.findElement(By.name("company")).sendKeys(cname);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		//validate
//		String res=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//		if(res.contains(lead))
//			System.out.println("lead created successfully");
//		else 
//			System.out.println("lead not created");
//		Click the administrator icon and click 'Signout' button
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).click().perform();
//		act.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
//		wLib.movetoelementandclick(driver, driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")));
//		driver.findElement(By.linkText("Sign Out")).click();
		//hp.clickOnSignout(driver);
		System.out.println("****Executed******");
		//driver.quit();
	}
}
