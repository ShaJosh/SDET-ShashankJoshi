package pavanpatil;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_Currentdate {

	public static void main(String[] args) {
		
		Date dateobj = new Date();
		String currentsysdate = dateobj.toString();
		System.out.println(currentsysdate);
		
		String arr[] = currentsysdate.split("");
		String var = arr[0];
		String date = arr[2];
		String month = arr[1];
		String year = arr[5];
		
		System.out.println(var + "" + date + "" + month + "" + year);
		
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
		
		String currdate = var + "" + date + "" + month + "" + year;
		
		// driver.findElement(By.xpath("//div[@aria-label='Thu Apr 08 2021']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+currdate+"']"));

	}

}
