package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class VehiclesQuestionsPage extends BasePage {

    private final Locators.VehiclesQuestionsPageLocators vehiclesQuestionsPageLocators;

    public VehiclesQuestionsPage(WebDriver driver) {
        super(driver);

        vehiclesQuestionsPageLocators = new Locators.VehiclesQuestionsPageLocators();
    }

    /**
     * Enters the year of the vehicle
     *
     * @param year The year of the vehicle
     * @param yearIndex The year of the vehicle in the drop down list
     */
    public void enterVehicleYear(String year, String yearIndex) {
        setElementText(vehiclesQuestionsPageLocators.vehicleYear, year);
        click(vehiclesQuestionsPageLocators.selectSuggestedVehicleYearByIndex(yearIndex));
    }

    /**
     * Enters the make of the vehicle
     *
     * @param make The make of the vehicle
     * @param makeKeyword The make of the vehicle in the drop down list
     */
    public void selectCarMake(String make, String makeKeyword) {
        setElementText(vehiclesQuestionsPageLocators.vehicleMake, make);
        click(vehiclesQuestionsPageLocators.selectSuggestedVehicleMakeByKeyword(makeKeyword));
    }

    /**
     * Enters the model of the vehicle
     *
     * @param model The year of the vehicle
     * @param modelKeyword The year of the vehicle in the drop down list
     */
    public void selectCarModel(String model, String modelKeyword) {
        setElementText(vehiclesQuestionsPageLocators.vehicleModel, model);
        click(vehiclesQuestionsPageLocators.selectSuggestedVehicleModelByKeyword(modelKeyword));
    }

    /**
     * Enters the trim of the vehicle
     *
     * @param trim The trim of the vehicle
     * @param trimKeyword The trim of the vehicle in the drop down list
     */
    public void selectCarTrim(String trim, String trimKeyword) {
        setElementText(vehiclesQuestionsPageLocators.vehicleTrim, trim);
        click(vehiclesQuestionsPageLocators.selectSuggestedVehicleMakeByKeyword(trimKeyword));
    }

    /**
     * Clicks on Save $ continue button
     */
    public void clickOnSaveAndContinueBtn() {
        click(vehiclesQuestionsPageLocators.saveAndContinueBtn);
    }
}
