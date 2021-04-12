package pavanpatil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VTiger_Create_Org {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TYSS");
		driver.findElement(By.id("phone")).sendKeys("4562378");

		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		industry.selectByVisibleText("Banking");

		Select rating = new Select(driver.findElement(By.xpath("//select[@name='rating']")));
		rating.selectByVisibleText("Active");

		Select type = new Select(driver.findElement(By.xpath("//select[@name='accounttype']")));
		type.selectByVisibleText("Analyst");

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}

}
