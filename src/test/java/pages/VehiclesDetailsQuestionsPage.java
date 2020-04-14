package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class VehiclesDetailsQuestionsPage extends BasePage {

    private final Locators.VehiclesDetailsQuestionsPageLocators vehiclesDetailsQuestionsPageLocators;

    public VehiclesDetailsQuestionsPage(WebDriver driver) {
        super(driver);
        vehiclesDetailsQuestionsPageLocators = new Locators.VehiclesDetailsQuestionsPageLocators();
    }

    /**
     * Selects whether the car is owned or rented
     */
    public void selectCarOwnershipStatus() {
        click(vehiclesDetailsQuestionsPageLocators.ownPaidFullBtn);
    }

    /**
     * Selects the purpose of the car usage
     */
    public void selectCarUsagePurpose() {
        wait.until(elementToBeClickable(vehiclesDetailsQuestionsPageLocators.personalCommutingBtn));
        click(vehiclesDetailsQuestionsPageLocators.personalCommutingBtn);
    }

    /**
     * Enters estimated mileage of the car
     */
    public void enterEstimatedMileage(String mileage) {
        setElementText(vehiclesDetailsQuestionsPageLocators.miles, mileage);
    }

    /**
     * Selects the frequency for the mileage
     *
     * @param frequency The frequency for the mileage
     */
    public void selectFrequency(String frequency) {
        click(vehiclesDetailsQuestionsPageLocators.frequency);
        vehiclesDetailsQuestionsPageLocators.selectSuggestedMileageFrequencyByKeyword(frequency);
    }

    /**
     * Clicks on the Save & continue button
     */
    public void clickOnSaveAndContinueBtn() {
        click(vehiclesDetailsQuestionsPageLocators.saveAndContinueBtn);
    }
}
