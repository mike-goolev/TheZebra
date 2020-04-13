package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.TestConfig;

public class HomePage extends BasePage {

    private final Locators.HomePageLocators homePageLocators;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageLocators = new Locators.HomePageLocators();
    }

    /**
     * Navigate to the home page via URL
     */
    public void loadHomePageByURL() {
        String currentUrl = driver.getCurrentUrl();
        String toUrl = TestConfig.getBaseUrl();

        if (!currentUrl.equals(toUrl)) {
            driver.get(toUrl);
        }
    }

    /**
     * Checks to see if the Home Insurance Radio Button is displayed
     */
    public boolean verifyHomeInsuranceRadioButton() {
        return elementExists(homePageLocators.homeInsuranceBtn);
    }

    /**
     * Enters the zip code
     *
     * @param zipCode The zip code
     */
    public void setZipCode(String zipCode) {
        setElementText(homePageLocators.zipCode, zipCode);
    }

    /**
     * Clicks on the Start button
     */
    public void clickOnStartBtn() {
        click(homePageLocators.startBtn);
    }

    /**
     * Selects Car Insurance radio button
     */
    public void selectCarInsuranceRadioButton() {
        click(homePageLocators.carInsuranceBtn);
    }
}
