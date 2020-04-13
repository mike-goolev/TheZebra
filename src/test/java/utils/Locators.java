package utils;

import org.openqa.selenium.By;

public class Locators {

    /********************************************* Home Page *******************************************/

    public static class HomePageLocators {

        /* Header of the page */
        public By headerBrandLogo = By.xpath("//a[@class='header-brand']");
        public By compareBtn = By.xpath("//span[contains(text(),'Compare')]");
        public By toolsAndTipsBtn = By.xpath("//span[contains(text(),'Tools & Tips')]");
        public By companyBtn = By.xpath("//span[contains(text(),'Company')]");

        /* Headlines on the page */
        public By heroHeadline = By.xpath("//h1[@class='hero-headline']");
        public By heroSubHeadline = By.xpath("//h3[@class='hero-subheadline']");
        public By featureHeadline = By.xpath("//h2[@class='features-headline display-5']");

        /* Icons */
        public By carIconFirst = By.xpath("//div[@class='hero hero-homepage']//div[@class='radio-button-row']//div[1]//label[1]//div[1]//*[local-name()='svg']");
        public By homeIconFirst = By.xpath("//div[@class='hero hero-homepage']//div[3]//label[1]//div[1]//*[local-name()='svg']");
        public By shareIcon = By.xpath("//div[@class='icon-wrap icon-form']//*[local-name()='svg']");
        public By compareIcon = By.xpath("//div[@class='icon-wrap icon-shield-multiple']//*[local-name()='svg']");
        public By saveIcon = By.xpath("//div[@class='icon-wrap icon-wallet']//*[local-name()='svg']");
        public By lockerIcon = By.xpath("//div[@class='icon-wrap']//*[local-name()='svg']");
        public By computerIcon = By.xpath("//div[@class='icon-wrap icon-computer']//*[local-name()='svg']");
        public By phoneIcon = By.xpath("//div[@class='icon-wrap icon-phone-agent']//*[local-name()='svg']");
        public By carIconSecond = By.xpath("//div[@class='main-content-container']//div[@class='radio-button-row']//div[1]//label[1]//div[1]//*[local-name()='svg']");
        public By homeIconSecond = By.xpath("//div[@class='homepage-bottom-cta-container']//div[3]//label[1]//div[1]//*[local-name()='svg']");
        public By ctaDivider = By.xpath("//div[@class='cta-divider-circle']");

        /* Radio buttons */
        public By carInsuranceBtn = By.xpath("//div[@class='hero hero-homepage']//div[@class='radio-button-row']//div[1]//label[1]");
        public By homeInsuranceBtn = By.xpath("//div[@class='hero hero-homepage']//div[3]//label[1]");

        /* Zip code text fields */
        public By zipCode = By.xpath("//body/div/div/div/div/div/div/form/div/div/div/input[1]");
        public By zipCodeSecond = By.id("f592bbfa-d4a6-496c-a501-1b68c7dae709");

        /* Start buttons */
        public By startBtn = By.xpath("//body/div/div/div/div/div/div/form/div/div/div/button[1]");
        public By startBtnSecond = By.xpath("//html//body//div//div//div//div//div//div//div//div//div//form//div//div//div//button");

    }

    /********************************************* Nav Page *******************************************/

    public static class NavPageLocators {

        /* Header */
        public By headerBrand = By.xpath("//a[@class='header-brand']");
        public By phoneNumber = By.xpath("//a[@class='cta-phone cta-phone-link']//span[@class='cta-phone-display'][contains(text(),'1.888.255.4364')]");
    }


    /*********************************************  Start - Auto Questions Page *******************************************/

    public static class StartQuestionsPageLocators {

        /* Current status of car insurance */
        public By yesBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='currently_insuredstart']/div/label[1]/div[1]");
        public By noBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='currently_insuredstart']/div/label[2]/div[1]");

        /* Owner or renter */
        public By ownHomeBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='residence_ownershipstart']/div/label[1]/div[1]");
        public By ownCondoBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='residence_ownershipstart']/div/label[2]/div[1]");
        public By rentBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='residence_ownershipstart']/div/label[3]/div[1]");
        public By otherBtn = By.xpath("//body/div[@id='content']/div/div/main/div[@id='scroll-container']/div/div/div/div/div/div/div[@id='residence_ownershipstart']/div/label[4]/div[1]");

        /* Save & Continue button */
        public By saveAndContinueBtn = By.id("startSaveBtn");
    }

    /*********************************************  Start Details - Auto Questions Page *******************************************/

    public static class StartDetailsQuestionsPageLocators {

        /* Parking address */
        public By address = By.id("garaging_addressInput");

        /**
         * Locates a suggested address for a given index
         *
         * @param index The index (Starting at 1) of the address to locate
         */
        public By selectSuggestedAddressByIndex(String index) {
            return By.xpath("//div[@class='pac-container pac-logo']//div[" + index + "]");
        }

        /* About yourself */
        public By firstName = By.xpath("//input[@id='first_namestart']"); // id = first_namestart
        public By lastName = By.xpath("//input[@id='last_namestart']"); // id = last_namestart
        public By birthday = By.id("date_of_birthstart"); // startting from 01/01/1904

        /* Save & Continue button */
        public By saveAndContinueBtn = By.xpath("//button[@id='startDetailsSaveBtn']"); // id = startDetailsSaveBtn

    }

    /**********************************************  Select Vehicles - Auto Questions Page *******************************************/

    public static class VehiclesQuestionsPageLocators {

        /* Vehicle year */
        public By vehicleYear = By.xpath("//input[@placeholder='Select year']");

        /**
         * Locates a suggested vehicle year for a given index
         *
         * @param yearIndex The index (Starting at 1980 till 2021) of the vehicle year
         */
        public By selectSuggestedVehicleYearByIndex(String yearIndex) {
            return By.xpath("//div[text()='" + yearIndex + "']");
        }

        /* Vehicle make */
        public By vehicleMake = By.xpath("//input[@placeholder='Select make']");

        /**
         * Locates a suggested vehicle makeKeyword for a given keyword
         *
         * @param makeKeyword The makeKeyword (Acura, Audi etc.) of the vehicle
         */
        public By selectSuggestedVehicleMakeByKeyword(String makeKeyword) {
            return By.xpath("//div[text()='" + makeKeyword + "']");
        }

        /* Vehicle model */
        public By vehicleModel = By.xpath("//input[@placeholder='Select model']");

        /**
         * Locates a suggested vehicle modelKeyword for a given keyword
         *
         * @param modelKeyword The modelKeyword (e.g. 2-7 Series, i3, i8, M3-M6, X1, X3-X6, X5 M, X6 M, Z4 - for BMW and etc.) of the vehicle
         */
        public By selectSuggestedVehicleModelByKeyword(String modelKeyword) {
            return By.xpath("//div[text()='" + modelKeyword + "']");
        }

        /* Vehicle trim */
        public By vehicleTrim = By.xpath("//input[@placeholder='Select trim']");

        /**
         * Locates a suggested vehicle trimKeyword for a given keyword
         *
         * @param trimKeyword The trimKeyword (e.g. 428i 2dr Convertible, 428i 2dr Coupe - for BMW and etc.) of the vehicle
         */
        public By findSuggestedVehicleTrimByKeyword(String trimKeyword) {
            return By.xpath("//div[text()='" + trimKeyword + "']");
        }

        /* Save & Continue button */
        public By saveAndContinueBtn = By.xpath("//button[@id='vehiclesSelectSaveBtn']");
    }

    /*********************************************  Vehicles Details - Auto Questions Page *******************************************/

    public static class VehiclesDetailsQuestionsPageLocators {

        /* Own or lease */
        public By ownPaidFullBtn = By.xpath("//span[@class='custom-control-description'][contains(text(),'Own - paid in full')]");
        public By ownMakingPaymentsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='ownership-0']/div/label[2]/div[1]");
        public By leaseBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='ownership-0']/div/label[3]/div[1]");

        /* Car usage */
        public By personalCommutingBtn = By.xpath("//span[@class='custom-control-description'][contains(text(),'Personal')]");
        public By pleasureBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='primary_use-0']/div/label[2]/div[1]");
        public By farmBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='primary_use-0']/div/label[3]/div[1]");
        public By businessRideShareBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='primary_use-0']/div/label[4]/div[1]");

        /* Mileage */
        public By miles = By.xpath("//input[@placeholder='Miles']");
        public By frequency = By.xpath("//span[@class='dropdown-select-header completed']");

        /**
         * Locates a suggested mileage frequency for a given keyword
         *
         * @param keyword The frequency (per year, per week, per month, per year) of the vehicle
         */
        public By selectSuggestedMileageFrequencyByKeyword(String keyword) {
            return By.xpath("//div[text()='" + keyword + "']");
        }

        /* Save & Continue button */
        public By saveAndContinueBtn = By.xpath("//button[@id='vehiclesDetailsSaveBtn']");
    }

    /*********************************************  Drivers Details - Auto Questions Page *******************************************/

    public static class DriversDetailsQuestionsPageLocators {
        /* Gender */
        public By maleBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='gender-0']/div/label[1]/div[1]");
        public By femaleBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='gender-0']/div/label[2]/div[1]");

        /* Marital status */
        public By singleBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='marital_status-0']/div/label[1]/div[1]");
        public By marriedBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='marital_status-0']/div/label[2]/div[1]");
        public By divorcedBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='marital_status-0']/div/label[3]/div[1]");
        public By widowedBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='marital_status-0']/div/label[4]/div[1]");

        /* Credit score */
        public By excellentBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='credit_score-0']/div/label[1]/div[1]");
        public By goodBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='credit_score-0']/div/label[2]/div[1]");
        public By averageBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='credit_score-0']/div/label[3]/div[1]");
        public By poorBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='credit_score-0']/div/label[4]/div[1]");

        /* Education */
        public By doctoralBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='education-0']/div/label[1]/div[1]");
        public By mastersBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='education-0']/div/label[2]/div[1]");
        public By bachelorsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='education-0']/div/label[3]/div[1]");
        public By gedBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='education-0']/div/label[4]/div[1]");
        public By noDiplomaBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='education-0']/div/label[5]/div[1]");

        /* Insurance time frame */
        public By moreThenThreeYearsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='insured_length-0']/div/label[1]/div[1]");
        public By oneToThreeYearsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='insured_length-0']/div/label[2]/div[1]");
        public By sixToTwelveMonthsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='insured_length-0']/div/label[3]/div[1]");
        public By lessThenSixMonthsBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div[@name='insured_length-0']/div/label[4]/div[1]");

        /* Current carrier */
        public By currentInsurance = By.xpath("//input[@placeholder='Select insurance company']");

        /**
         * Locates a suggested insurance company for a given keyword
         *
         * @param keyword The current insurance company (21st Century, AAA, AARP etc.)
         */
        public By selectSuggestedInsuranceCompanyByKeyword(String keyword) {
            return By.xpath("//div[text()='" + keyword + "']");
        }

        /* Accidents */
        public By yesBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div/div[@name='violations-0']/div/label[1]/div[1]");
        public By noBtn = By.xpath("//body/div/div/div/main/div/div/div/div/div/div/div/div/div[@name='violations-0']/div/label[2]/div[1]");

        /* Email */
        public By email = By.xpath("//input[@name='email']");

        /* Show my quotes button */
        public By showMyQuotesBtn = By.xpath("//button[@id='summaryShowQuotesBtn']"); // id = summaryShowQuotesBtn
    }


    /*********************************************  Select Auto Rate Page *******************************************/

    public static class AutoQuotesPageLocators {

        /* Searching dialog box */
        public By searchDialogModalBox = By.xpath("//div[contains(@class,'modal fade show')]");

        /* Carrier card locators */
        public By carrierNames = By.xpath("//div[@class='btn carrier-info']/div//h4[@class='carrier-name']");
        public By carrierWithUnavailablePrices = By.xpath("//div[@class='right-col']//button/span[contains(text(),'Get quote') or contains(text(),'See quote')]");

        public By carrierWithAvailablePrices = By.xpath("//div[@class='right-col']//button//h3");
    }

}


