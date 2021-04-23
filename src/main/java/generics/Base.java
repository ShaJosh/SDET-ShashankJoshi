package generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import objectrepo.HomePage;
import objectrepo.LoginPage;

public class Base {
	public WebDriver driver;

	public JavaUtility jv = new JavaUtility();
	public FileUtility fu = new FileUtility();
	public ExcelUtility eu = new ExcelUtility();
	public WebDriverUtility wdu = new WebDriverUtility();

	/**
	 * Create DB Connection And Extent Report
	 * 
	 * @BeforeSuite public void beforesuite() { System.out.println("==DB
	 *              connection=="); System.out.println("==Extent report=="); }
	 * 
	 * @AfterSuite public void afterSuite() { System.out.println("==Close DB
	 *             connection=="); System.out.println("== Close Extent report=="); }
	 */

	/**
	 * Launch Browser and get the URL
	 * 
	 * @throws IOException
	 */
	@BeforeClass(groups = "SMOKE-TEST")
	public void launchBrowser() throws IOException {

		String BROWSER = fu.readDatafrompropfile(IConstants.propfilepath, "url");

		if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		/*
		 * else if (BROWSER.equalsIgnoreCase("ie")) {
		 * (BROWSER.equalsIgnoreCase("chrome")) driver = new InternetExplorerDriver(); }
		 */
		wdu.maximizewindow(driver);
		wdu.implicitwait(driver);
		driver.get(fu.readDatafrompropfile(IConstants.propfilepath, "url"));
	}

	@Parameters("BROWSER")
	public void configBeforeClassCompatibility(String browser) throws IOException {
		System.out.println("=============launch browser============");
		/*
		 * launch browser from the parameters
		 */
		String url = fu.readDatafrompropfile(IConstants.propfilepath, "url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver(); // if parameter has chrome then launch chrome browser
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver(); // if parameter firefox then launch firefox browser
		} else
			driver = new InternetExplorerDriver();

		wdu.implicitwait(driver);
		driver.get(url);
	}

	@AfterClass(groups = "SMOKE-TEST")
	public void closeBrowser() {
		driver.quit();
	}

	@BeforeMethod(groups = "SMOKE-TEST")
	public void logintoapp() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(fu.readDatafrompropfile(IConstants.propfilepath, "username"),
				fu.readDatafrompropfile(IConstants.propfilepath, "password"));

	}

	@AfterMethod(groups = "SMOKE-TEST")
	public void logoutfromApp() {
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

}
