package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home 
{
	public WebDriver driver;
    
	   private By shop=By.id("btnShowMegaNav");
	   private By latestPhone=By.cssSelector("a[href*='/mobile/phones']");
	   private By iphone11Pro=By.cssSelector("[aria-label='Select Device iPhone 12 Pro']");
	   private By extraLargeOptus=By.cssSelector("[aria-label='Select Plan Extra Large Optus Choice Plan']");
	   private By contbttn=By.cssSelector("[class*='Button__SCButton']");
	   private By newOptus=By.id("radio-label-r-223-0");
	   private By chknewcstm=By.id("icon-r-262");
	   private By deviceins=By.cssSelector("[id*='Device Insurance']");
	   private By addon=By.cssSelector("[class*='section-summary']");
	   
	   public Home(WebDriver driver) 
	   {
		   this.driver=driver;
	   }
	
	   public WebElement getShop()
	   {
		   return driver.findElement(shop);
	   }
	   
	   public WebElement getLatestPhone()
	   {
		   return driver.findElement(latestPhone);
	   }
	   public WebElement getIponePro()
	   {
		   return driver.findElement(iphone11Pro);
	   }
	   public WebElement getExtraLargeOptus()
	   {
		   return driver.findElement(extraLargeOptus);
	   }
	   public WebElement getContinue()
	   {
		   return driver.findElement(contbttn);
	   }
	   public WebElement getNewOptus()
	   {
		   return driver.findElement(newOptus);
	   }
	   public WebElement getChkNewCst()
	   {
		   return driver.findElement(chknewcstm);
	   }
	   public WebElement getDeviceins()
	   {
		   return driver.findElement(deviceins);
	   }
	   public WebElement getAddOn()
	   {
		   return driver.findElement(addon);
	   }
	  
}
