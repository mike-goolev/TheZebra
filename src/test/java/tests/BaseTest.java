package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;
import org.testng.annotations.*;
import utils.BrowserFactory;
import utils.TestConfig;

import java.lang.reflect.Method;

import static org.testng.Reporter.log;

public class BaseTest extends TestNG {

    public WebDriver driver;

    @Parameters({"envUrl"})
    @BeforeSuite(alwaysRun = true)
    public void baseTestSuiteSetup(@Optional String envUrl) {

        /* Specify default URL */
        envUrl = "https://TheZebra.com";

        TestConfig.setBaseUrl(envUrl);
    }

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void baseTestClassSetup(@Optional String browser) {
        log( "\n**************************************************\n" +
                "* Initializing " + this.getClass().getSimpleName() + "...\n" +
                "**************************************************", true);

        browser = "firefox";
        log("Browser: " + browser, true);

        System.setProperty("webdriver.gecko.driver", "geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "warning_logs"); // suppress console log warning

        /* Create a webdriver instance */
        driver = BrowserFactory.getDriver(browser);
        //driver.manage().window().maximize();
    }


    @BeforeMethod(alwaysRun = true)
    public void baseTestMethodSetup(Method testMethod){
        log("\n\t*** Starting test " + testMethod.getName() + "...\n", true);
        driver.manage().deleteAllCookies();
    }


    @AfterClass(alwaysRun = true)
    public void baseTestClassTeardown(){
        log( "\n**************************************************\n" +
                "* Finishing " + this.getClass().getSimpleName() + "...\n" +
                "**************************************************", true);

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite(alwaysRun = true)
    public void baseTestSuiteTeardown(){
        log( "\nTesting finished.\n", true);

        if (driver != null) {
            driver.quit();
        }
    }
}
