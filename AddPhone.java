package Optus;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home;
import resources.Base;

public class AddPhone extends Base
{
	public WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		driver.get(prop.getProperty("url"));
		
		Home h=new Home(driver);
		h.getShop().click();
		h.getLatestPhone().click();
		h.getIponePro().click();
		h.getExtraLargeOptus().click();
		h.getContinue().click();
		/*int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);*/
	    //driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	    int size = driver.findElements(By.tagName("iframe")).size();
        for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("/html/body/noscript[1]/text()")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
        }
	    
	    
	    Thread.sleep(2000);
		h.getNewOptus().click();
		h.getChkNewCst().click();
		Thread.sleep(3000);
		h.getAddOn().click();
		Thread.sleep(3000);
		Assert.assertEquals("Device Insurance"+'\n'+"$19.00 per month over 1 month"+'\n'+"mth"+'\n'+"$19.00", h.getAddOn().getText());
	}
	
	
	
}
