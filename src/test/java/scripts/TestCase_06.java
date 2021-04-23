package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.Base;
import objectrepo.PurchaseOrderPage;
import objectrepo.HomePage;

public class TestCase_06 extends Base {

	@Test(groups = "SMOKE-TEST")
	public void PurchaseOrder() {

		HomePage hp = new HomePage(driver);
		PurchaseOrderPage purbtn = new PurchaseOrderPage(driver);

		WebElement more = hp.getMorelink(); 								// Click on More link
		wdu.movetoelement(driver, more);

		WebElement purch = hp.getPurchaselink(); 							// Click on Purchase order link under More
		wdu.movetoelement(driver, purch);
		purch.click();

		wdu.switchtowindow(driver, "Products&action");

		purbtn.createpurchasebtn().click();
		purbtn.getAddproductbtn().click();									// Click Add Product Button
		purbtn.getProductsbtn().click();									// Click Symbol
		//purbtn.getJeans().click();											// Adding Jeans
	}
}
