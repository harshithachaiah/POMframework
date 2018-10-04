package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgottenpage {
	@FindBy(id="user_email")
	private WebElement linkedemailid;
	
	@FindBy(xpath="//button[@class='voonik-primary-btn']")
	private WebElement sub;
	
	public Forgottenpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public void linkedemailid() {
		linkedemailid.click();
	}
	public void sub() {
		sub.click();
	}

}
