package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class StartDetailsQuestionsPage extends BasePage {

    private final Locators.StartDetailsQuestionsPageLocators startDetailsQuestionsPageLocators;

    public StartDetailsQuestionsPage(WebDriver driver) {
        super(driver);
        startDetailsQuestionsPageLocators = new Locators.StartDetailsQuestionsPageLocators();
    }

    /**
     * Enters the parking address of the car
     *
     * @param address The parking address of the car
     */
    public void enterCarParkingAddress(String address, String index) {
        setElementText(startDetailsQuestionsPageLocators.address, address);
        click(startDetailsQuestionsPageLocators.selectSuggestedAddressByIndex(index));
    }

    /**
     * Enters the first name of the user
     */
    public void enterFirstName(String firstName) {
        setElementText(startDetailsQuestionsPageLocators.firstName, firstName);
    }

    /**
     * Enters the last name of the user
     */
    public void enterLastName(String lastName) {
        setElementText(startDetailsQuestionsPageLocators.lastName, lastName);
    }

    /**
     * Enters DOB of the user
     */
    public void enterBirthday(String birthday) {
        setElementText(startDetailsQuestionsPageLocators.birthday, birthday);
    }

    /**
     * Clicks on the Save & continue button
     */
    public void clickOnSaveAndContinueBtn() {
        click(startDetailsQuestionsPageLocators.saveAndContinueBtn);
    }
}
