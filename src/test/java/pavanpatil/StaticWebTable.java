package pavanpatil;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");

		List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr/td[1]"));

		for (int i = 0; i < l1.size(); i++) {
			String abc = l1.get(i).getText();
			System.out.println(abc);

		}

	}

}
