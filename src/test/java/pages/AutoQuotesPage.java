package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoQuotesPage extends BasePage {

    private final Locators.AutoQuotesPageLocators autoQuotesPageLocators;

    public AutoQuotesPage(WebDriver driver) {
        super(driver);
        autoQuotesPageLocators = new Locators.AutoQuotesPageLocators();
    }

    /**
     * Waits for the loading dialog on the Applicants page
     */
    public void waitForSearchingDialogBox() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitForLoadingIndicator(autoQuotesPageLocators.searchDialogModalBox);
    }

    /**
     * Gets list of the car insurance names from the result page
     */
    public void getListOfInsuranceNames() {
        // create list of web elements
        List<WebElement> listOfCarInsurances = driver.findElements(autoQuotesPageLocators.carrierNames);

        System.out.println("The quote includes the following carriers:");
        // iterate through the list of web elements and print each one
        for (WebElement element : listOfCarInsurances) {
            String carrier = element.getText();
            System.out.println(carrier);
        }
    }
}
