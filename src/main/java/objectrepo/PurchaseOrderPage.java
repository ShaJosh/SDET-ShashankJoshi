package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {

	public PurchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Purchase Order...']")
	private WebElement createpurchasebtn;

	public WebElement createpurchasebtn() {
		return createpurchasebtn;
	}

	@FindBy(xpath = "//input[@value='Add Product']")
	private WebElement addproductbtn;

	public WebElement getAddproductbtn() {
		return addproductbtn;
	}

	@FindBy(xpath = "(//img[@title='Products'])[2]")
	private WebElement productsbtn;

	public WebElement getProductsbtn() {
		return productsbtn;
	}

	@FindBy(xpath = "//a[text()='Jeans']")
	private WebElement jeans;

	public WebElement getJeans() {
		return jeans;
	}
	
	@FindBy(xpath = "//input[@value='Add Service']")
	private WebElement service;

	public WebElement getService() {
		return service;
	}
	
	@FindBy(xpath = "//img[@title='Services']")
	private WebElement servicebtn;
	
	public WebElement getServicebtn() {
		return servicebtn;
	}

	@FindBy(xpath = "//a[text()='Laptop Service']")
	private WebElement laptop;

	public WebElement getLaptop() {
		return laptop;
	}

}
