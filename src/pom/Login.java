package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//p[.='Login']")
	private WebElement log;
	
	@FindBy(id="user_email")
	private WebElement username;
	
	@FindBy(id="user_password")
	private WebElement password;		
	 
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[.='Forgot Password ?']")
	private WebElement forgotten;
	
	
	public  Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}

	public void login(){
		log.click();	
	}
	public void username(String a)
	{
		username.sendKeys(a);
	}
	public void password(String b)
	{
		password.sendKeys(b);
	} 
	public void loginbtn()
	{
		loginbtn.click();
	}
	public void forgotten() {
		
		forgotten.click();
	}
}