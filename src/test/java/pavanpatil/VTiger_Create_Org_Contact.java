package pavanpatil;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger_Create_Org_Contact {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Champa");

		driver.findElement(By.xpath("//input[@name='account_name']//following-sibling::img")).click();

		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String> childWin = child.iterator();

		while (childWin.hasNext()) {
			String childWindow = childWin.next();
			if (!parent.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.id("search_txt")).sendKeys("TYSS");
				driver.findElement(By.xpath("//input[@name='search']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@id='1']")).click();
			}
		}

		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
	}
}