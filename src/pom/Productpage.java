package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Productpage {
	@FindBy(xpath="//div[@class='feed-grid-item-details']")
	private WebElement addbag;
	
	@FindBy(xpath="//label[.='UK-9']")
	private WebElement selectsize;
	
	@FindBy(xpath="//button[.='ADD TO BAG']")
	private WebElement atb;
	
	@FindBy(xpath="//p[.='bag']")
	private WebElement bagbtn;
	
	@FindBy(xpath="//p[@class='view-cart-link']")
	private WebElement viewbag;
	
	
	public  Productpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	
	public void addbag(WebDriver driver)
	{
		Actions a = new Actions(driver);
	    a.moveToElement(addbag).perform();
	}

	public void selectsize() {
		selectsize.click();
		
	}
	public void atb() {
		atb.click();	
	}
	public void bagbtn()
	{
	   bagbtn.click();
	}
	


	
	

}
