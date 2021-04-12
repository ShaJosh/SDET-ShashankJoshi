package pavanpatil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CleartripCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Thread.sleep(3000);
		//Alert a = driver.switchTo().alert();
		//a.dismiss();
		
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("HBX");
		driver.findElement(By.xpath("//a[contains(text(),'HBX')]")).click();
		
		

	}

}
