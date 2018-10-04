package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bagpage {
	@FindBy(xpath="//p[.='MOVE TO WISHLIST ']")
	private WebElement proceed;
	
	public  Bagpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	public void proceed()
	{
		proceed.click();
	}

}
