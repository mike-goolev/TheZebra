package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(driversDetailsQuestionsPageLocators.singleBtn);
    }


    /**
     * Selects credit score
     */
    public void selectCreditScore() {
        click(driversDetailsQuestionsPageLocators.excellentBtn);
    }

    /**
     * Selects education level
     */
    public void selectEducationLevel() {
        click(driversDetailsQuestionsPageLocators.doctoralBtn);
    }


    /**
     * Selects insurance length coverage
     */
    public void selectInsuranceLengthCoverage() {
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
