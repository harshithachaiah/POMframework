package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Voonik;
import pom.Forgottenpage;
import pom.Login;

public class Forgotten implements Auto_constant {
	static {
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws InterruptedException {
	String us = Voonik.abc(excelpath,"sheet1",1,0);
	String pwd = Voonik.abc(excelpath, "sheet1",1,4);
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
	l.forgotten();
	Forgottenpage f =new Forgottenpage(driver);
	f.linkedemailid();
	f.sub();
	driver.close();
}
}
