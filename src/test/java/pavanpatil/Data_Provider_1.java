package pavanpatil;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_1 {

	@Test(dataProvider = "getdata")
	public void testcity(String srclocation, String destlocation) {
		System.out.println(srclocation + " " + destlocation);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] objarr = new Object[3][2];

		objarr[0][0] = "GOI";
		objarr[0][1] = "BLR";

		objarr[1][0] = "DEL";
		objarr[1][1] = "JFK";

		objarr[2][0] = "NYC";
		objarr[2][1] = "BOM";

		return objarr;
	}
}
