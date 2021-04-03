package HerokuApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		

	}

}
