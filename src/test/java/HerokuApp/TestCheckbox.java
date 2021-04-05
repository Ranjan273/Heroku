package HerokuApp;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//ul/li[6]/a[text()='Checkboxes']")).click();
		
		System.out.println(driver.getTitle());

	}

}
