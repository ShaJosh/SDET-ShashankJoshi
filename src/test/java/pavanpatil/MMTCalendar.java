package pavanpatil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMTCalendar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("HBX");
		driver.findElement(By.xpath("//div[contains(text(),'HBX')]")).click();
		
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).click();
		
		WebElement departure = driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		wait.until(ExpectedConditions.elementToBeClickable(departure)).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Thu Apr 08 2021']")).click();
		
		
		

	}

}
