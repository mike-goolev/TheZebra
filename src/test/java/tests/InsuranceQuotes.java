package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Screenshot;
import utils.TestDataImporter;

public class InsuranceQuotes extends BaseTest {
    private HomePage homePage;
    private StartQuestionsPage startQuestionsPage;
    private StartDetailsQuestionsPage startDetailsQuestionsPage;
    private VehiclesQuestionsPage vehiclesQuestionsPage;
    private VehiclesDetailsQuestionsPage vehiclesDetailsQuestionsPage;
    private DriversDetailsQuestionsPage driversDetailsQuestionsPage;
    private AutoQuotesPage autoQuotesPage;

    private String zipCode;
    private String parkingAddress;
    private String parkingIndex;
    private String firstName;
    private String lastName;
    private String birthday;
    private String year;
    private String yearIndex;
    private String make;
    private String makeKeyword;
    private String model;
    private String modelKeyword;
    private String trim;
    private String trimKeyword;
    private String mileage;
    private String frequency;
    private String currentInsurance;
    private String insuranceKeyword;
    private String email;

    @BeforeClass(alwaysRun = true)
    public void preconditions() {
        System.out.println("\nExecuting preconditions for " + this.getClass().getName() + "...\n");

        zipCode = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("zipCode");
        parkingAddress = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("parkingAddress");
        parkingIndex = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("parkingIndex");
        firstName = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("firstName");
        lastName = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("lastName");
        birthday = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("birthday");
        year = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("year");
        yearIndex = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("yearIndex");
        make = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("make");
        makeKeyword = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("makeKeyword");
        model = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("model");
        modelKeyword = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("modelKeyword");
        trim = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("trim");
        trimKeyword = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("trimKeyword");
        mileage = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("mileage");
        frequency = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("frequency");
        currentInsurance = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("currentInsurance");
        insuranceKeyword = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("insuranceKeyword");
        email = (String) TestDataImporter.get("InsuranceQuotes", "InsuranceQuotes").get("email");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage(driver);
        startQuestionsPage = new StartQuestionsPage(driver);
        startDetailsQuestionsPage = new StartDetailsQuestionsPage(driver);
        vehiclesQuestionsPage = new VehiclesQuestionsPage(driver);
        vehiclesDetailsQuestionsPage = new VehiclesDetailsQuestionsPage(driver);
        driversDetailsQuestionsPage = new DriversDetailsQuestionsPage(driver);
        autoQuotesPage = new AutoQuotesPage(driver);
    }

    @Test
    public void getAutoQuotes() {

        /* Start test on Zebra home page */
        homePage.loadHomePageByURL();

        /* Select Car Insurance radio button */
        homePage.selectCarInsuranceRadioButton();

        /* Enter zip code */
        homePage.setZipCode(zipCode);

        /* Click on Start button */
        homePage.clickOnStartBtn();

        /* Select car insurance status */
        startQuestionsPage.selectCurrentInsuranceStatus();

        /* Select home ownership status */
        startQuestionsPage.selectOwnershipStatus();

        /* Click on Save & continue button */
        startQuestionsPage.clickOnSaveAndContinueBtn();

        /* Enter parking address */
        startDetailsQuestionsPage.enterCarParkingAddress(parkingAddress, parkingIndex);

        /* Enter user name and DOB */
        startDetailsQuestionsPage.enterFirstName(firstName);
        startDetailsQuestionsPage.enterLastName(lastName);
        startDetailsQuestionsPage.enterBirthday(birthday);

        /* Click on Save & continue button */
        startDetailsQuestionsPage.clickOnSaveAndContinueBtn();

        /* Enter vehicle year */
        vehiclesQuestionsPage.enterVehicleYear(year, yearIndex);
        vehiclesQuestionsPage.selectCarMake(make, makeKeyword);
        vehiclesQuestionsPage.selectCarModel(model, modelKeyword);
        vehiclesQuestionsPage.selectCarTrim(trim, trimKeyword);

        /* Click on Save & continue button */
        vehiclesQuestionsPage.clickOnSaveAndContinueBtn();

        /* Select ownership status of the car */
        vehiclesDetailsQuestionsPage.selectCarOwnershipStatus();

        /* Select usage purpose of the car */
        vehiclesDetailsQuestionsPage.selectCarUsagePurpose();

        /* Enter estimated mileage and frequency */

        vehiclesDetailsQuestionsPage.enterEstimatedMileage(mileage);
        vehiclesDetailsQuestionsPage.selectFrequency(frequency);

        /* Click on Save & continue button */
        vehiclesDetailsQuestionsPage.clickOnSaveAndContinueBtn();

        /* Provide information about driver */
        driversDetailsQuestionsPage.selectGender();
        driversDetailsQuestionsPage.selectMaritalStatus();
        driversDetailsQuestionsPage.selectCreditScore();
        driversDetailsQuestionsPage.selectEducationLevel();
        driversDetailsQuestionsPage.selectInsuranceLengthCoverage();
        driversDetailsQuestionsPage.selectCurrentInsurance(currentInsurance, insuranceKeyword);

        /* Accidents or tickets in the last 3 years */
        driversDetailsQuestionsPage.selectAnyAccidents();

        /* Enter email */
        driversDetailsQuestionsPage.enterEmail(email);

        /* Click on Show my quotes button */
        driversDetailsQuestionsPage.clickOnShowMyQuotesBtn();

        /* Wait until search dialog modal becomes invisible */
        autoQuotesPage.waitForSearchingDialogBox();

        /* Retrieve list of available carriers */
        autoQuotesPage.getListOfInsuranceNames();
    }

    @AfterMethod(alwaysRun = true)
    public void methodTearDown(ITestResult result) {
        if ((!result.isSuccess()) || (result.getStatus() == 3)) {
            Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
        }
        Screenshot.takeScreenShot(result.getMethod().getMethodName(), driver);
    }
}