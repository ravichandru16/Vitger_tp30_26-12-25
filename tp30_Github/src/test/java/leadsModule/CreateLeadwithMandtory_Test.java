package leadsModule;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CreateLeadwithMandtory_Test {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		Random rand= new Random();
		int ran=rand.nextInt(50);
		String lead="Dominic"+ran;
		//launch the application
		driver.get("http://localhost:8888/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Login to the application
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
//		Click the 'LEADS' button
		driver.findElement(By.linkText("Leads")).click();
		
//		Click the create lead '+' lookup image
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
//		Click and Enter lastname data into to textfield
		driver.findElement(By.name("lastname")).sendKeys(lead);
		
//		Click and Enter Company data into to textfield and click the 'Save' button
		driver.findElement(By.name("company")).sendKeys("Ford");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		//validate
		String res=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//		if(res.contains(lead))
//		{
//			System.out.println("Lead creted successfully");
//		}
//		else
//			System.out.println("lead not created");
		Assert.assertTrue(res.contains(lead), "lead created successfully");
//		Click the administrator icon and click 'Signout' button
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).click().perform();
		act.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
		
		System.out.println("****Executed******");
		

		
		
	}
}
