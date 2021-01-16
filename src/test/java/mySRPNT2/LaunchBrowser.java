package mySRPNT2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser {

	public LaunchBrowser() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/gecko");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("http://localhost:8080/bicicletas");
		
		
	}

}
