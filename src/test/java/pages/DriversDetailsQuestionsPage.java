package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class DriversDetailsQuestionsPage extends BasePage {

    private final Locators.DriversDetailsQuestionsPageLocators driversDetailsQuestionsPageLocators;


    public DriversDetailsQuestionsPage(WebDriver driver) {
        super(driver);
        driversDetailsQuestionsPageLocators = new Locators.DriversDetailsQuestionsPageLocators();
    }

    /**
     * Selects gender
     */
    public void selectGender() {
        click(driversDetailsQuestionsPageLocators.maleBtn);
    }

    /**
     * Selects marital status
     */
    public void selectMaritalStatus() {
        wait.until(elementToBeClickable(driversDetailsQuestionsPageLocators.singleBtn));
        click(driversDetailsQuestionsPageLocators.singleBtn);
    }


    /**
     * Selects credit score
     */
    public void selectCreditScore() {
        wait.until(elementToBeClickable(driversDetailsQuestionsPageLocators.excellentBtn));
        click(driversDetailsQuestionsPageLocators.excellentBtn);
    }

    /**
     * Selects education level
     */
    public void selectEducationLevel() {
        wait.until(elementToBeClickable(driversDetailsQuestionsPageLocators.doctoralBtn));
        click(driversDetailsQuestionsPageLocators.doctoralBtn);
    }


    /**
     * Selects insurance length coverage
     */
    public void selectInsuranceLengthCoverage() {
        wait.until(elementToBeClickable(driversDetailsQuestionsPageLocators.moreThenThreeYearsBtn));
        click(driversDetailsQuestionsPageLocators.moreThenThreeYearsBtn);
        }

    /**
     * Enters current insurance company
     */
    public void selectCurrentInsurance(String insurance, String keyWord) {
        setElementText(driversDetailsQuestionsPageLocators.currentInsurance, insurance);
        click(driversDetailsQuestionsPageLocators.selectSuggestedInsuranceCompanyByKeyword(keyWord));
    }

    /**
     * Selects the answer to the question "Any accidents or tickets in the last 3 years?"
     */
    public void selectAnyAccidents() {
        wait.until(elementToBeClickable(driversDetailsQuestionsPageLocators.noBtn));
        click(driversDetailsQuestionsPageLocators.noBtn);
    }

    /**
     * Enters email
     */
    public void enterEmail(String email) {
        setElementText(driversDetailsQuestionsPageLocators.email, email);
    }

    /**
     * Clicks Show my quotes button
     */
    public void clickOnShowMyQuotesBtn() {
        click(driversDetailsQuestionsPageLocators.showMyQuotesBtn);
    }
}
