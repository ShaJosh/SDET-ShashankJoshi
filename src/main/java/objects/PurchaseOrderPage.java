package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {

	public PurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath = "//img[@title='Create Purchase Order...']")
	private WebElement createpurchasebtn;

	public WebElement createpurchasebtn() {
		return createpurchasebtn;
	}*/
}
