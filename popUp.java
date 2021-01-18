package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popUp
{
	public WebDriver driver;
	
	
	public popUp(WebDriver driver) 
	   {
		   this.driver=driver;
	   }

	
	
	By popup=By.xpath("//*[@id='pup-1']");
	public int getPopUpSize()

	{
      return driver.findElements(popup).size();
    }

	public WebElement getPopUp()

	{
		return driver.findElement(popup);

	}
		

}
