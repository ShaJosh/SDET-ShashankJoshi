package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.Base;
import objectrepo.HomePage;
import objectrepo.PurchaseOrderPage;

public class TestCase_10 extends Base {

	@Test
	public void PurchaseOrder() {

		HomePage hp = new HomePage(driver);
		PurchaseOrderPage purbtn = new PurchaseOrderPage(driver);

		WebElement more = hp.getMorelink(); 											// Click on More link
		wdu.movetoelement(driver, more);

		WebElement purch = hp.getPurchaselink(); 										// Click on Purchase order link under More
		wdu.movetoelement(driver, purch);
		purch.click();

		wdu.switchtowindow(driver, "Services&action");
		
		purbtn.createpurchasebtn().click();
		purbtn.getService().click();													// Click Add Service Button
		purbtn.getServicebtn().click();													// Click Symbol
	}
}
