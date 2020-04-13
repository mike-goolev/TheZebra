package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class StartQuestionsPage extends BasePage {

    private final Locators.StartQuestionsPageLocators startQuestionsPageLocators;

    public StartQuestionsPage(WebDriver driver) {
        super(driver);
        startQuestionsPageLocators = new Locators.StartQuestionsPageLocators();
    }

    /**
     * Selects the answer for the question "Are you currently insured?"
     */
    public void selectCurrentInsuranceStatus() {
        click(startQuestionsPageLocators.yesBtn);
    }

    /**
     * Selects the answer for the question "Do you own or rent your home?"
     */
    public void selectOwnershipStatus() {
        click(startQuestionsPageLocators.ownHomeBtn);
    }

    /**
     * Clicks on  Save & continue button
     */
    public void clickOnSaveAndContinueBtn() {
        click(startQuestionsPageLocators.saveAndContinueBtn);
    }
}
