package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.TestConfig;

import java.util.concurrent.TimeUnit;

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
     * Selects the Car Insurance radio button
     */
    public void selectCarInsuranceRadioButton() {
        click(homePageLocators.carInsuranceRadioBtn);
    }

    /**
     * Check if The Zebra link is displayed in the header
     *
     * @return Whether or not The Zebra link is displayed in the header
     */
    public boolean verifyTheZebraHeadersLink() {
        return elementExists(homePageLocators.homeIconTheZebra);
    }

    /**
     * Hover on the Compare drop down in the header
     */
    public void hoverOverCompareDropDown() {
        //wait.until(elementToBeClickable(homePageLocators.compareDropDown));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hoverOverElement(homePageLocators.compareDropDown);
    }

    /*--------- Get Compare drop down links text ----------*/
    public String getAutoInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerAutoInsurance).getText();
    }

    public String getHomeInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerHomeInsurance).getText();
    }

    public String getRentersInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerRentersInsurance).getText();
    }

    public String getFreeCarInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerFreeCarInsuranceQuotes).getText();
    }

    public String getBestCheapInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerBestCheapCarInsurance).getText();
    }

    public String getBestByVehicleInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerBestCarInsuranceByVehicle).getText();
    }

    public String getBestInsuranceCompaniesLinkText() {
        return driver.findElement(homePageLocators.headerBestInsuranceCompanies).getText();
    }

    public String getInsuranceByStateLinkText() {
        return driver.findElement(homePageLocators.headerInsuranceByState).getText();
    }

    public String getOtherInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerOtherInsurance).getText();
    }

    /**
     * Hover on the Tools & Tips drop down in the header
     */
    public void hoverOverToolsAndTipsDropDown() {
//        wait.until(elementToBeClickable(homePageLocators.toolsAndTipsDropDown));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hoverOverElement(homePageLocators.toolsAndTipsDropDown);
    }

    /*--------- Get Tools & Tips drop down links text ----------*/
    public String getResourcesLinkText() {
        return driver.findElement(homePageLocators.headerResources).getText();
    }

    public String getResearchReportsLinkText() {
        return driver.findElement(homePageLocators.headerResearchReports).getText();
    }

    public String getStateOfInsuranceLinkText() {
        return driver.findElement(homePageLocators.headerStateOfInsurance).getText();
    }

    public String getCarInsuranceCalculatorLinkText() {
        return driver.findElement(homePageLocators.headerCarInsuranceCalculator).getText();
    }

    /**
     * Hover on the Company drop down in the header
     */
    public void hoverOverCompanyDropDown() {
//        wait.until(elementToBeClickable(homePageLocators.companyDropDown));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hoverOverElement(homePageLocators.companyDropDown);
    }

    /*--------- Get Company drop down links text ----------*/
    public String getAboutTheZebraLinkText() {
        return driver.findElement(homePageLocators.headerAboutTheZebra).getText();
    }

    public String getPressLinkText() {
        return driver.findElement(homePageLocators.headerPress).getText();
    }

    public String getCareersLinkText() {
        return driver.findElement(homePageLocators.headerCareers).getText();
    }

    public String getContactUssLinkText() {
        return driver.findElement(homePageLocators.headerContactUs).getText();
    }

    public String getCovidResponseLinkText() {
        return driver.findElement(homePageLocators.headerCovidResponse).getText();
    }

    /**
     * Checks to see if the all links are displayed under Compare drop down
     *
     * @return Whether or not the all links are displayed under Compare drop down
     */
    public boolean verifyCompareDropDownLinksPresent() {
        return getAutoInsuranceLinkText().equals("Auto Insurance") &&
                getHomeInsuranceLinkText().equals("Home Insurance") &&
                getRentersInsuranceLinkText().equals("Renters Insurance") &&
                getFreeCarInsuranceLinkText().equals("Free Car Insurance Quotes") &&
                getBestCheapInsuranceLinkText().equals("Best Cheap Car Insurance") &&
                getBestByVehicleInsuranceLinkText().equals("Best Car Insurance By Vehicle") &&
                getBestInsuranceCompaniesLinkText().equals("Best Insurance Companies") &&
                getInsuranceByStateLinkText().equals("Insurance By State") &&
                getOtherInsuranceLinkText().equals("Other Insurance");
    }

    /**
     * Checks to see if the all links are displayed under Tools & Tips drop down
     *
     * @return Whether or not the all links are displayed under Tools & Tips drop down
     */
    public boolean verifyToolsAndTipsDropDownLinksPresent() {
        return getResourcesLinkText().equals("Resources") &&
                getResearchReportsLinkText().equals("Research Reports") &&
                getStateOfInsuranceLinkText().equals("State of Insurance") &&
                getCarInsuranceCalculatorLinkText().equals("Car Insurance Calculator");
    }

    /**
     * Checks to see if the all links are displayed under Company drop down
     *
     * @return Whether or not the all links are displayed under Company drop down
     */
    public boolean verifyCompanyDropDownLinksPresent() {
        return getAboutTheZebraLinkText().equals("About The Zebra") &&
                getPressLinkText().equals("Press") &&
                getCareersLinkText().equals("Careers") &&
                getContactUssLinkText().equals("Contact Us") &&
                getCovidResponseLinkText().equals("COVID-19 Response");
    }

    /**
     * Check if the Call icon link is displayed in the header
     *
     * @return Whether or not the Call icon link is displayed in the header
     */
    public boolean verifyCallIconHeadersLink() {
        return elementExists(homePageLocators.headerCallIcon);
    }

    /**
     * Check if the Phone number link is displayed in the header
     *
     * @return Whether or not the Phone number link is displayed in the header
     */
    public boolean verifyPhoneNumberHeadersLink() {
        return driver.findElement(homePageLocators.headerPhoneNumber).isDisplayed();
    }

    /**
     * Checks to see if the Car insurance radio button is displayed
     *
     * @return Whether or not the Car insurance radio button is displayed
     */
    public boolean verifyCarInsuranceRadioBtnPresent() {
        return driver.findElement(homePageLocators.carInsuranceRadioBtn).getText().equals("Car\ninsurance");
    }

    /**
     * Checks to see if the Home insurance radio button is displayed
     *
     * @return Whether or not the Home insurance radio button is displayed
     */
    public boolean verifyHomeInsuranceRadioBtnPresent() {
        return driver.findElement(homePageLocators.homeInsuranceRadioBtn).getText().equals("Home\ninsurance");
    }

    /**
     * Checks to see if the Zip code field is displayed under Compare insurance quotes section
     *
     * @return Whether or not the the Zip code field is displayed under Compare insurance quotes section
     */
    public boolean verifyZipCodeFirstPresent() {
        return driver.findElement(homePageLocators.zipCodeSecond).isDisplayed();
    }

    /**
     * Checks to see if the all links are displayed under Compare insurance quotes section
     *
     * @return Whether or not the all links are displayed under Compare insurance quotes section
     */
    public boolean verifyStartBtnFirstPresent() {
        return driver.findElement(homePageLocators.startBtn).isDisplayed();
    }

    /**
     * Gets text of the main headline of the page
     */
    public String verifyPageMainHeadline() {
        return driver.findElement(homePageLocators.heroHeadline).getText();
    }

    /**
     * Gets sub headline text of the page
     */
    public String verifyPageSubHeadline() {
        return driver.findElement(homePageLocators.heroSubHeadline).getText();
    }

    /**
     * Gets text of the element next to 'Review your quotes.' link
     */
    public String verifyBeenHereBeforeText() {
        return driver.findElement(homePageLocators.beenHereBeforeText).getText();
    }

    /**
     * Checks if the Review your quotes link is displayed
     *
     * @return Whether or not the Review your quotes link is displayed
     */
    public boolean verifyReviewYourQuotesLinkPresent() {
        return driver.findElement(homePageLocators.reviewYourQuotesLink).getText().equals("Review your quotes.");
    }

    /**
     * Gets text of the second main headline
     */
    public String verifySecondHeadline() {
        return driver.findElement(homePageLocators.featureHeadline).getText();
    }

    /**
     * Gets text of the Share headline
     */
    public String verifyShareTitle() {
        return driver.findElement(homePageLocators.shareTitle).getText();
    }

    /**
     * Gets text of the Share paragraph
     */
    public String verifyShareText() {
        return driver.findElement(homePageLocators.shareText).getText();
    }

    /**
     * Checks to see if the home link is displayed inside Share paragraph
     *
     * @return Whether or not home link is displayed inside Share paragraph
     */
    public boolean verifyHomeLinkPresent() {
        return driver.findElement(homePageLocators.homeLink).getText().equals("home");
    }

    /**
     * Gets text of the Compare title
     */
    public String verifyCompareTitle() {
        return driver.findElement(homePageLocators.compareTitle).getText();
    }

    /**
     * Gets text of the Compare paragraph
     */
    public String verifyCompareText() {
        return driver.findElement(homePageLocators.compareText).getText();
    }

    /**
     * Checks to see if the quotes link is displayed inside Compare paragraph
     *
     * @return Whether or not the quotes link is displayed inside Compare paragraph
     */
    public boolean verifyQuotesLinkPresent() {
        return driver.findElement(homePageLocators.quotesLink).getText().equals("quotes");
    }

    /**
     * Gets text of the Save title
     */
    public String verifySaveTitle() {
        return driver.findElement(homePageLocators.saveTitle).getText();
    }

    /**
     * Gets text of the Save paragraph
     */
    public String verifySaveText() {
        return driver.findElement(homePageLocators.saveText).getText();
    }

    /**
     * Gets text of the Pledge title
     */
    public String verifyPrivacyPledgeTitle() {
        return driver.findElement(homePageLocators.ourPrivacyPledgeHeadline).getText();
    }

    /**
     * Gets text of the Pledge paragraph
     */
    public String verifyPrivacyPledgeText() {
        return driver.findElement(homePageLocators.ourPrivacyPledgeText).getText();
    }

    /**
     * Checks to see if the compare and save link is displayed inside Pledge paragraph
     *
     * @return Whether or not the compare and save link is displayed inside Pledge paragraph
     */
    public boolean verifyPledgeLinkPresent() {
        return driver.findElement(homePageLocators.compareAndSaveLink).getText().equals("compare and save");
    }

    /**
     * Gets text of the Easy Start headline
     */
    public String verifyEasyStartTitle() {
        return driver.findElement(homePageLocators.easyStartHeadline).getText();
    }

    /**
     * Gets text of the Buy Online sub headline
     */
    public String verifyBuyOnlineTitle() {
        return driver.findElement(homePageLocators.buyOnlineHeadline).getText();
    }

    /**
     * Gets text of the Buy Online paragraph
     */
    public String verifyBuyOnlineText() {
        return driver.findElement(homePageLocators.buyOnlineText).getText();
    }

    /**
     * Checks to see if the zip code field displayed under Buy Online section
     *
     * @return Whether or not the all links are displayed under Buy Online section
     */
    public boolean verifyZipCodeSecondPresent() {
        return driver.findElement(homePageLocators.zipCodeSecond).isDisplayed();
    }

    /**
     * Checks to see if the Share icon is displayed
     *
     * @return Whether or not the Share icon is displayed
     */
    public boolean verifyShareIconPresent() {
        return driver.findElement(homePageLocators.shareIcon).isDisplayed();
    }

    /**
     * Checks to see if the Compare icon is displayed
     *
     * @return Whether or not the Compare icon is displayed
     */
    public boolean verifyCompareIconPresent() {
        return driver.findElement(homePageLocators.compareIcon).isDisplayed();
    }

    /**
     * Checks to see if the Save icon is displayed
     *
     * @return Whether or not the Save icon is displayed
     */
    public boolean verifySaveIconPresent() {
        return driver.findElement(homePageLocators.saveIcon).isDisplayed();
    }

    /**
     * Checks to see if the Lock icon is displayed
     *
     * @return Whether or not the Lock icon is displayed
     */
    public boolean verifyLockIconPresent() {
        return driver.findElement(homePageLocators.lockerIcon).isDisplayed();
    }

    /**
     * Checks to see if the all links are displayed under Buy Online section
     *
     * @return Whether or not the all links are displayed under Buy Online section
     */
    public boolean verifyStartBtnSecondPresent() {
        return driver.findElement(homePageLocators.startBtnSecond).isDisplayed();
    }

    /**
     * Checks to see if the Buy Online icon is displayed
     *
     * @return Whether or not the Buy Online icon is displayed
     */
    public boolean verifyBuyOnlineIconPresent() {
        return driver.findElement(homePageLocators.buyOnlineIcon).isDisplayed();
    }

    /**
     * Checks to see if the Call An Agent icon is displayed
     *
     * @return Whether or not the Call An Agent icon is displayed
     */
    public boolean verifyCallAnAgentPresent() {
        return driver.findElement(homePageLocators.callAnAgentIcon).isDisplayed();
    }

    /**
     * Checks to see if the Call icon is displayed
     *
     * @return Whether or not the Call icon is displayed
     */
    public boolean verifyPhoneIconPresent() {
        return driver.findElement(homePageLocators.callIconSecond).isDisplayed();
    }

    /**
     * Checks to see if the Car insurance icon is displayed
     *
     * @return Whether or not the Car insurance icon is displayed
     */
    public boolean verifyCarInsuranceIconPresent() {
        return driver.findElement(homePageLocators.carInsuranceIcon).isDisplayed();
    }

    /**
     * Checks to see if the Home insurance icon is displayed
     *
     * @return Whether or not the Home insurance icon is displayed
     */
    public boolean verifyHomeInsuranceIconPresent() {
        return driver.findElement(homePageLocators.homeInsuranceIcon).isDisplayed();
    }

    /**
     * Gets text of the No Spam paragraph
     */
    public String verifyNoSpamText() {
        return driver.findElement(homePageLocators.noSpamText).getText();
    }

    /**
     * Gets text of the Call An Agent sub headline
     */
    public String verifyCallAnAgentTitle() {
        return driver.findElement(homePageLocators.callAnAgentHeadline).getText();
    }

    /**
     * Gets text of the Call An Agent paragraph
     */
    public String verifyCallAnAgentText() {
        return driver.findElement(homePageLocators.callAnAgentText).getText();
    }

    /**
     * Gets phone number text
     */
    public String verifyPhoneNumberText() {
        return driver.findElement(homePageLocators.phoneNumberSecond).getText().substring(9); // because get.text() retrieves "Call icon1.888.255.4363". Call icon is value of <title> tag
    }

    /**
     * Checks to see if the Hablamos Español and save link is displayed under Call An Agent section
     *
     * @return Whether or not the compare and save link is displayed under Call An Agent section
     */
    public boolean verifyEspanolLinkPresent() {
        return driver.findElement(homePageLocators.espanolText).getText().equals("Hablamos Español");
    }

    /**
     * Checks to see if the 'OR' divider icon is displayed
     *
     * @return Whether or not the 'OR' divider icon is displayed
     */
    public boolean verifyOrDividerIconPresent() {
        return driver.findElement(homePageLocators.orCtaDivider).isDisplayed();
    }

    /**
     * Gets text of the Follow us paragraph
     */
    public String verifyFollowUsText() {
        return driver.findElement(homePageLocators.followOnUs).getText();
    }

    /**
     * Gets text of the copyright paragraph
     */
    public String copyRight() {
        return driver.findElement(homePageLocators.copyRightText).getText();
    }

    /**
     * Checks to see if the all links are displayed under Car Insurance Guide
     *
     * @return Whether or not the all links are displayed under Car Insurance Guide
     */
    public boolean verifyCarInsuranceGuideLinksPresent() {
        return driver.findElement(homePageLocators.carInsuranceGuideLink).getText().equals("Car Insurance Guide") &&
                driver.findElement(homePageLocators.personalInjuryLink).getText().equals("Personal Injury Protection Insurance") &&
                driver.findElement(homePageLocators.uninsuredMotoristLink).getText().equals("Uninsured Motorist Coverage") &&
                driver.findElement(homePageLocators.liabilityInsuranceLink).getText().equals("Liability Insurance") &&
                driver.findElement(homePageLocators.permissiveUseLink).getText().equals("Permissive Use Insurance") &&
                driver.findElement(homePageLocators.noFaultInsuranceLink).getText().equals("No-Fault Insurance") &&
                driver.findElement(homePageLocators.nonOwnersInsuranceLink).getText().equals("Non-Owners Insurance") &&
                driver.findElement(homePageLocators.insuranceGlossaryLink).getText().equals("Insurance Glossary") &&
                driver.findElement(homePageLocators.collisionInsuranceLink).getText().equals("Collision Insurance") &&
                driver.findElement(homePageLocators.fullCoverageInsuranceLink).getText().equals("Full Coverage Insurance") &&
                driver.findElement(homePageLocators.averageCarInsuranceCostLink).getText().equals("Average Car Insurance Cost") &&
                driver.findElement(homePageLocators.askAnAgentLink).getText().equals("Ask An Agent") &&
                driver.findElement(homePageLocators.reviewsLink).getText().equals("Reviews") &&
                driver.findElement(homePageLocators.tvCommercialsLink).getText().equals("TV Commercials");
    }

    /**
     * Checks to see if the all links are displayed under About section
     *
     * @return Whether or not the all links are displayed under About section
     */
    public boolean verifyAboutUsLinksPresent() {
        return driver.findElement(homePageLocators.aboutUsLink).getText().equals("About Us") &&
                driver.findElement(homePageLocators.pressLink).getText().equals("Press") &&
                driver.findElement(homePageLocators.weAreHiringLink).getText().equals("We Are Hiring") &&
                driver.findElement(homePageLocators.contactUsLink).getText().equals("Contact Us");
    }


    /**
     * Checks to see if the all Social Media links are displayed and valid
     *
     * @return Whether or not the all Social Media links are displayed and valid
     */
    public boolean verifySocialMediaIconLinksPresent() {
        return driver.findElement(homePageLocators.fbIcon).getAttribute("href").equals("https://www.facebook.com/TheZebraCo") &&
                driver.findElement(homePageLocators.twIcon).getAttribute("href").equals("https://www.twitter.com/TheZebraCo") &&
                driver.findElement(homePageLocators.igIcon).getAttribute("href").equals("https://www.instagram.com/TheZebraCo") &&
                driver.findElement(homePageLocators.inIcon).getAttribute("href").equals("https://www.linkedin.com/company/the-zebra");
    }

    /**
     * Checks to see if the all Social Media links are displayed
     *
     * @return Whether or not the all Social Media links are displayed
     */
    public boolean verifyPoliciesLinksPresent() {
        return driver.findElement(homePageLocators.termsOfServiceLink).getText().equals("Terms of Service") &&
                driver.findElement(homePageLocators.privacyLink).getText().equals("Privacy Policy") &&
                driver.findElement(homePageLocators.licensesLink).getText().equals("Licenses");
    }
}
