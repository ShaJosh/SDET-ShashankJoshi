package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverUtility;

public class HomePage {
	WebDriver driver;
	public WebDriverUtility wdu = new WebDriverUtility();

	@FindBy(xpath = "//a[text()='More']")
	private WebElement morelink;

	@FindBy(name = "Purchase Order")
	private WebElement purchaselink;

	/*
	 * public void purchaseorder() { wdu.movetoelement(driver, moredd);
	 * purchase.click(); }
	 */

	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homepagelnk;

	@FindBy(xpath = "//img[contains(@src,'user.PNG')]")
	private WebElement adminstrationImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLnk;

	/*
	 * @FindBy(xpath = "//a[text()='Jeans']") private WebElement jeans;
	 * 
	 * public WebElement getJeans() { return jeans; }
	 */

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getPurchaselink() {
		return purchaselink;
	}

	public WebElement getHomepagelnk() {
		return homepagelnk;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void logout() {
		wdu.movetoelement(driver, adminstrationImg);
		signOutLnk.click();
	}

}
