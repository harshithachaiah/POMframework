package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	
	@FindBy(xpath="//input[@id='searchTag']")
	private WebElement search;
	
	@FindBy(xpath="//i[@class='material-icons search-icon']")
	private WebElement searchlogo;
	
	@FindBy(xpath="//p[.='Track order']")
	private WebElement trackorder;
	
	@FindBy(xpath="//p[text()='Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//p[.='bag']")
	private WebElement bag;
	
	@FindBy(xpath="//p[text()='softwaretestst']")
	private WebElement list;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@href='/collections/men-favorites?lp=true']")
	private WebElement mens;
	 
	@FindBy(xpath="//span[.='Bottom Wear']")
	private WebElement bottomwear;
	
	@FindBy(xpath="//a[.='Trousers']")
	private WebElement trousers;
	
	@FindBy(xpath="//img[@src='//images11.voonik.com/campaigns/SEP17_CRSL1_1000x300.jpg']")
	private WebElement ini;
	
	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	
	public void searchbox(String a) {
		search.sendKeys(a);
		
	}
	
	public void searchlogo() {
		searchlogo.click();
		
	}
	
	public void wishlist()
	{
		wishlist.click();	
	}
	public void trackorder()
	{
		trackorder.click();	
	}
	public void bag() {
		bag.click();
	} 
	

	public void logout(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(list).perform();	
	}

	public void logoutbtn() {
		logout.click();
		
	}
	public void mens(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(mens).perform();	
	}
	public void bottomwear(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(bottomwear).perform();	
	}
	public void trousers() {
		
		trousers.click();
	}

	public void ini(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(ini).perform();
		ini.click();
		
	}
	
	
	
		
}
