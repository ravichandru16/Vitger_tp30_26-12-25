package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverMethodSource {
/**
 * Creating object for actions class object
 * @param driver
 * @return
 */
	public Actions actionsmethods(WebDriver driver)
	{
		Actions act= new Actions(driver);
		return act;
	}
	/**
	 * scroll the webpage by x and y axis values
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollbyamount(WebDriver driver,int x,int y)
	{
		actionsmethods(driver).scrollByAmount(x, y).perform();
	}
	
	/**
	 * scroll to till the element is visible
	 * @param driver
	 * @param element
	 */
	public void scrolltoelement(WebDriver driver,WebElement element)
	{
		actionsmethods(driver).scrollToElement(element).perform();
	}
	
	/**
	 * mouseover moving to element
	 * @param driver
	 * @param tarelement
	 */
	public void movetoelement(WebDriver driver,WebElement tarelement)
	{
		actionsmethods(driver).moveToElement(tarelement).click().perform();
	}
	
	/**
	 * this is used to mouseHover and  click the element
	 * @param driver
	 * @param element
	 */
	public void movetoelementandclick(WebDriver driver,WebElement element1,WebElement element2)
	{
		actionsmethods(driver).moveToElement(element1).perform();
		actionsmethods(driver).moveToElement(element2).click().perform();
	}
	/**
	 * mouseover through axis values
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void movebyoffset(WebDriver driver,int x,int y)
	{
		actionsmethods(driver).moveByOffset(x, y).perform();
	}
	
	/**
	 * this is used to right click of the mouse in webpage
	 * @param driver
	 */
	public void mouserightclick(WebDriver driver)
	{
		actionsmethods(driver).contextClick().perform();
	}
	
	/**
	 * this is right click on the mouse upon the element
	 * @param driver
	 * @param element
	 */
	public void rightclickonelement(WebDriver driver,WebElement element)
	{
		actionsmethods(driver).contextClick(element).perform();
	}
	
	/**
	 * this is used to drag and drop the element one place to another place within the page
	 * @param driver
	 * @param element1
	 * @param element2
	 */
	public void draganddrop(WebDriver driver,WebElement element1,WebElement element2)
	{
		actionsmethods(driver).dragAndDrop(element1, element2).perform();
	}
	
	/**
	 * enter some values through actions class
	 * @param driver
	 * @param values
	 */
	public void  sendkeys(WebDriver driver,String values)
	{
		actionsmethods(driver).sendKeys(values).perform();
	}
	
	/**
	 * this is used to double clicking
	 * @param driver
	 */
	public void doubleclick(WebDriver driver)
	{
		actionsmethods(driver).doubleClick();
	}
	
/*-----------------------------------------------------------------------------------------*/
	
	/**
	 * Creating object for select class to access dropdown element
	 * @param element
	 * @return
	 */
	public Select dropdownmethods(WebElement element)
	{
		Select sc= new Select(element);
		return sc;
	}
	
	/**
	 * select option by visible text
	 * @param element
	 * @param text
	 */
	public void selectbyvisibletext(WebElement element,String text)
	{
		dropdownmethods(element).selectByVisibleText(text);
	}
	
	/**
	 * select option by containing of text
	 * @param element
	 * @param text
	 */
	public void selectbycontainstext(WebElement element,String text)
	{
		dropdownmethods(element).selectByContainsVisibleText(text);
	}
	
	/**
	 * selecting option by index
	 * @param element
	 * @param index
	 */
	public void selectbyindex(WebElement element,int index)
	{
		dropdownmethods(element).selectByIndex(index);
	}
	
	/**
	 * selecting option by value
	 * @param element
	 * @param value
	 */
	public void selectbyvalue(WebElement element,String value)
	{
		dropdownmethods(element).selectByValue(value);
	}
	
	/**
	 * deselecting option by visible text in multi-select dropdown
	 * @param element
	 * @param text
	 */
	public void deselectbyvisibletext(WebElement element,String text)
	{
		dropdownmethods(element).deselectByVisibleText(text);
	}
	
	/**
	 * deselecting option by containing text in multi-select dropdown
	 * @param element
	 * @param text
	 */
	public void deselectbycontainstext(WebElement element,String text)
	{
		dropdownmethods(element).deselectByValue(text);
	}
	
	/**
	 * Deselect by indexing
	 * @param element
	 * @param index
	 */
	public void deselectbyindex(WebElement element,int index)
	{
		dropdownmethods(element).deselectByIndex(index);
	}
	
	/**
	 * Deselect all the selected options
	 * @param element
	 */
	public void deselectall(WebElement element)
	{
		dropdownmethods(element).deselectAll();
	}
	
	/**
	 * deselect by value
	 * @param element
	 * @param value
	 */
	public void deselectbyvalue(WebElement element,String value)
	{
		dropdownmethods(element).deselectByValue(value);
	}
	
	/**
	 * getting all the options into the dropdown
	 * @param element
	 * @return
	 */
	public List<WebElement> getoptions(WebElement element)
	{
		List<WebElement> options=dropdownmethods(element).getOptions();
		return options;
	}
	
	public boolean ismultiornot(WebElement element)
	{
		boolean res=dropdownmethods(element).isMultiple();
		return res;
	}
/*--------------------------------------------------------------------------------------------*/
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public TakesScreenshot takescreenshot(WebDriver driver)
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		return ts;
	}
	
	/**
	 * 
	 * @param driver
	 * @param path
	 * @throws IOException
	 */
	public void takepagescreenshot(WebDriver driver,String path) throws IOException
	{
		File src=takescreenshot(driver).getScreenshotAs(OutputType.FILE);
		File loc= new File(path);
		FileHandler.copy(src, loc);
	}
	
	/**
	 * 
	 * @param element
	 * @param path
	 * @throws IOException
	 */
	public void takewebelementscreenshot(WebElement element,String path) throws IOException
	{
		File src=element.getScreenshotAs(OutputType.FILE);
		File loc= new File(path);
		FileHandler.copy(src, loc);
	}
	
/*-----------------------------------------------------------------------------------------------------*/	
	
	/**
	 * 
	 * @param driver
	 */
	public void acceptalert(WebDriver driver)	
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void dismissalert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public String gettextfromalert(WebDriver driver)
	{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	
	/**
	 * 
	 * @param driver
	 * @param value
	 */
	public void sendkeystoalert(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
/*-------------------------------------------------------------------------------------------------------*/

	/**
	 * 
	 * @param driver
	 * @param index
	 */
	public void childframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * 
	 * @param driver
	 * @param frameelement
	 */
	public void childframebyelement(WebDriver driver,WebElement frameelement)
	{
		driver.switchTo().frame(frameelement);
	}
	
	/**
	 * 
	 * @param driver
	 * @param name
	 */
	public void childframebyname(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	
	/**
	 * 
	 * @param driver
	 * @param id
	 */
	public void childframebyid(WebDriver driver,int id)
	{
		driver.switchTo().frame(id);
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void parentframe(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void mainframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
/*-------------------------------------------------------------------------------------------------------*/

	/**
	 * 
	 * @param driver
	 * @param exptitle
	 */
	public void switchchildwin(WebDriver driver,String exptitle)
	{
		Set<String>allwin=driver.getWindowHandles();
		for(String win:allwin)
		{
			driver.switchTo().window(win);
			String title=driver.getTitle();
			if(title.contains(exptitle))
				break;
		}
	}
	
	/**
	 * 
	 * @param driver
	 * @param parentwinid
	 */
	public void switchparentwin(WebDriver driver,String exptitle)
	{
		Set<String>allwin=driver.getWindowHandles();
		for(String win:allwin)
		{
			driver.switchTo().window(win);
			String title=driver.getTitle();
			if(title.contains(exptitle))
				break;
		}
	}
	
/*-------------------------------------------------------------------------------------------------------*/
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public JavascriptExecutor javascriptmethods(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		return js;
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickelementbyjs(WebDriver driver,WebElement element)
	{
		javascriptmethods(driver).executeScript("arguments[0].click();", element);
	}
	
	/**
	 * 
	 * @param driver
	 * @param value
	 * @param element
	 */
	public void sendkeysbyjs(WebDriver driver,String value,WebElement element)
	{
		javascriptmethods(driver).executeScript("arguments[0].value='"+value+"';", element);
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrolltoelementbyjs(WebDriver driver,WebElement element)
	{
		javascriptmethods(driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void scrollHeight(WebDriver driver)
	{
		javascriptmethods(driver).executeAsyncScript("window.scrollby(0,document.body.scrollHeight)");
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrolltoeleByamount(WebDriver driver,WebElement element)
	{
		Point loc=element.getLocation();
		
		int x=loc.getX();
		int y=loc.getY();
		javascriptmethods(driver).executeScript("window.scrollBy("+x+","+y+")");
	}
	
/*---------------------------------------------------------------------------------------------------------------*/
	
	/**
	 * 
	 * @param driver
	 */
	public void maxiwindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void minwindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void quitbrowser(WebDriver driver)
	{
		driver.quit();
	}
	
/*----------------------------------------------------------------------------------------------------------------*/
	
	/**
	 * 
	 * @param driver
	 * @param seconds
	 */
	public void waitforallele(WebDriver driver,int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	/**
	 * 
	 * @param driver
	 * @param seconds
	 * @param element
	 */
	public void explictwait(WebDriver driver,int seconds,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	} 
	
	public void refreshPage(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
//	public void getName(WebDriver driver)
//	{
//		Actions act= new Actions(driver);
//		act.dragAndDrop(null, null)
//		
//	}
	
}
