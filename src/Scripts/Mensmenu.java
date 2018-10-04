package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Voonik;
import pom.Homepage;
import pom.Login;

public class Mensmenu implements Auto_constant {
	static {
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws InterruptedException {
	String us = Voonik.abc(excelpath,"sheet1",1,0);
	String pwd = Voonik.abc(excelpath, "sheet1",1,1);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.voonik.com/");
	Login l = new Login(driver);
	l.login();
	Thread.sleep(2000);
	l.username(us);
	Thread.sleep(2000);
	l.password(pwd);
	Thread.sleep(2000);
	l.loginbtn();
	Thread.sleep(2000);
	Homepage h= new Homepage(driver);
	h.mens(driver);
	h.bottomwear(driver);
	h.trousers();
	driver.close();
}
}
