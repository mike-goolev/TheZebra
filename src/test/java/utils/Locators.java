package utils;

import org.openqa.selenium.By;

public class Locators {

    /********************************************* Home Page *******************************************/

    public static class HomePageLocators {

        /* Header of the page */
        public By compareDropDown = By.xpath("//span[contains(text(),'Compare')]");
        public By toolsAndTipsDropDown = By.xpath("//span[contains(text(),'Tools & Tips')]");
        public By companyDropDown = By.xpath("//span[contains(text(),'Company')]");
        public By headerCallIcon = By.xpath("//a[@class='cta-phone cta-phone-link']//*[local-name()='svg']");
        public By headerPhoneNumber = By.xpath("//a[@class='cta-phone cta-phone-link']//span[@class='cta-phone-display'][contains(text(),'1.888.255.4364')]");

        /* Compare menu */
        public By headerAutoInsurance = By.xpath("//a[contains(text(),'Auto Insurance')]");
        public By headerHomeInsurance = By.xpath("//a[contains(text(),'Home Insurance')]");
        public By headerRentersInsurance = By.xpath("//a[contains(text(),'Renters Insurance')]");
        public By headerFreeCarInsuranceQuotes = By.xpath("//a[contains(text(),'Free Car Insurance Quotes')]");
        public By headerBestCheapCarInsurance = By.xpath("//a[contains(text(),'Best Cheap Car Insurance')]");
        public By headerBestCarInsuranceByVehicle = By.xpath("//a[contains(text(),'Best Car Insurance By Vehicle')]");
        public By headerBestInsuranceCompanies = By.xpath("//a[contains(text(),'Best Insurance Companies')]");
        public By headerInsuranceByState = By.cssSelector("div.header.header-black:nth-child(4) div.header-nav div.header-nav-item:nth-child(1) ul:nth-child(2) li:nth-child(8) > a:nth-child(1)");
        public By headerOtherInsurance = By.xpath("//a[contains(text(),'Other Insurance')]");

        /* Tools & Tips menu */
        public By headerResources = By.xpath("//a[contains(text(),'Resources')]");
        public By headerResearchReports = By.xpath("//a[contains(text(),'Research Reports')]");
        public By headerStateOfInsurance = By.xpath("//a[contains(text(),'State of Insurance')]");
        public By headerCarInsuranceCalculator = By.xpath("//a[contains(text(),'Car Insurance Calculator')]");

        /* Company menu */
        public By headerAboutTheZebra = By.xpath("//a[contains(text(),'About The Zebra')]");
        public By headerPress = By.cssSelector("div.header.header-black:nth-child(4) div.header-nav div.header-nav-item:nth-child(3) ul:nth-child(2) li:nth-child(2) > a:nth-child(1)");
        public By headerCareers = By.cssSelector("div.header.header-black:nth-child(4) div.header-nav div.header-nav-item:nth-child(3) ul:nth-child(2) li:nth-child(3) > a:nth-child(1)");
        public By headerContactUs = By.cssSelector("div.header.header-black:nth-child(4) div.header-nav div.header-nav-item:nth-child(3) ul:nth-child(2) li:nth-child(4) > a:nth-child(1)");
        public By headerCovidResponse = By.xpath("//a[contains(text(),'COVID-19 Response')]");

        /* 'Insurance in black & white' section */
        public By heroHeadline = By.xpath("//h1[@class='hero-headline']");
        public By heroSubHeadline = By.xpath("//h3[@class='hero-subheadline']");
        public By carInsuranceRadioBtn = By.xpath("//div[@class='hero hero-homepage']//div[@class='radio-button-row']//div[1]//label[1]");
        public By homeInsuranceRadioBtn = By.xpath("//div[@class='hero hero-homepage']//div[3]//label[1]");
        public By homeIconTheZebra = By.xpath("//a[@class='header-brand']//*[local-name()='svg']");
        public By zipCode = By.xpath("//body/div/div/div/div/div/div/form/div/div/div/input[1]");
        public By startBtn = By.xpath("//body/div/div/div/div/div/div/form/div/div/div/button[1]");
        public By beenHereBeforeText = By.xpath("//p[@class='retrieve-quotes mt-xs']");
        public By reviewYourQuotesLink = By.xpath("//a[contains(text(),'Review your quotes.')]");

        /* 'How does The Zebra work?' section */
        public By featureHeadline = By.xpath("//div[1]//div[2]//div[1]//div[1]//div[1]//h2[1]");
        public By shareIcon = By.xpath("//div[@class='icon-wrap icon-form']//*[local-name()='svg']");
        public By shareTitle = By.xpath("//h4[contains(text(),'Share')]");
        public By shareText = By.xpath("//p[contains(text(),'Tell us a little about yourself and your car and')]");
        public By homeLink = By.xpath("//b[contains(text(),'home')]");
        public By compareIcon = By.xpath("//div[@class='icon-wrap icon-shield-multiple']//*[local-name()='svg']");
        public By compareTitle = By.xpath("//h4[contains(text(),'Compare')]");
        public By compareText = By.xpath("//div[@class='homepage-features-container']//div[@class='row icon-grid']//div[2]//p[1]");
        public By quotesLink = By.xpath("//b[contains(text(),'quotes')]");
        public By saveIcon = By.xpath("//div[@class='icon-wrap icon-wallet']//*[local-name()='svg']");
        public By saveTitle = By.xpath("//h4[contains(text(),'Save')]");
        public By saveText = By.xpath("//p[contains(text(),'Choose your quote and secure your new rate in an i')]");

        /* 'Our Privacy Pledge' section */
        public By lockerIcon = By.xpath("//div[@class='icon-wrap']//*[local-name()='svg']");
        public By ourPrivacyPledgeHeadline = By.xpath("//h2[contains(text(),'Our Privacy Pledge')]");
        public By ourPrivacyPledgeText = By.xpath("//p[contains(text(),'Your privacy matters to us. So does your sanity. W')]");
        public By compareAndSaveLink = By.xpath("//a[contains(text(),'compare and save')]");

        /* "It's easy to start saving." section */
        public By easyStartHeadline = By.xpath("//body//div//div//div[1]//div[1]//div[1]//div[1]//h2[1]");
        public By buyOnlineIcon = By.xpath("//div[@class='icon-wrap icon-computer']//*[local-name()='svg']");
        public By buyOnlineHeadline = By.xpath("//h2[contains(text(),'Buy Online')]");
        public By buyOnlineText = By.xpath("//p[contains(text(),'Our easy-to-use tool lets you compare quotes from')]");
        public By carInsuranceIcon = By.xpath("//div[@class='main-content-container']//div[@class='radio-button-row']//div[1]//label[1]");
        public By homeInsuranceIcon = By.xpath("//div[@class='homepage-bottom-cta-container']//div[3]//label[1]");
        public By zipCodeSecond = By.xpath("//html//body//div//div//div//div//div//div//div//div//div//form//div//div//div//input[@name='zipcode']");
        public By startBtnSecond = By.xpath("//html//body//div//div//div//div//div//div//div//div//div//form//div//div//div//button");
        public By noSpamText = By.xpath("//span[contains(text(),'No spam. We take your privacy seriously.')]");

        public By orCtaDivider = By.xpath("//div[@class='cta-divider-circle']");

        public By callAnAgentIcon = By.xpath("//div[@class='icon-wrap icon-phone-agent']//*[local-name()='svg']");
        public By callAnAgentHeadline = By.xpath("//h2[contains(text(),'Call an Agent')]");
        public By callAnAgentText = By.xpath("//p[contains(text(),'Whether you just prefer a friendly voice or need m')]");
        public By callIconSecond = By.xpath("//p[@class='hidden-md-down cta-phone-display']//*[local-name()='svg']");
        public By phoneNumberSecond = By.xpath("//p[@class='hidden-md-down cta-phone-display']");
        public By espanolText = By.xpath("//a[contains(text(),'Hablamos Español')]");

        /* Footer of the page - Car Insurance Guide */
        public By carInsuranceGuideLink = By.xpath("//a[contains(text(),'Car Insurance Guide')]");
        public By personalInjuryLink = By.xpath("//a[contains(text(),'Personal Injury Protection Insurance')]");
        public By uninsuredMotoristLink = By.xpath("//a[contains(text(),'Uninsured Motorist Coverage')]");
        public By liabilityInsuranceLink = By.xpath("//a[contains(text(),'Liability Insurance')]");
        public By permissiveUseLink = By.xpath("//a[contains(text(),'Permissive Use Insurance')]");
        public By noFaultInsuranceLink = By.xpath("//a[contains(text(),'No-Fault Insurance')]");
        public By nonOwnersInsuranceLink = By.xpath("//a[contains(text(),'Non-Owners Insurance')]");
        public By insuranceGlossaryLink = By.xpath("//a[contains(text(),'Insurance Glossary')]");
        public By collisionInsuranceLink = By.xpath("//a[contains(text(),'Collision Insurance')]");
        public By fullCoverageInsuranceLink = By.xpath("//a[contains(text(),'Full Coverage Insurance')]");
        public By averageCarInsuranceCostLink = By.xpath("//a[contains(text(),'Average Car Insurance Cost')]");
        public By askAnAgentLink = By.xpath("//a[contains(text(),'Ask An Agent')]");
        public By reviewsLink = By.xpath("//a[contains(text(),'Reviews')]");
        public By tvCommercialsLink = By.xpath("//a[contains(text(),'TV Commercials')]");

        /* About us section */
        public By aboutUsLink = By.xpath("//a[contains(text(),'About Us')]");
        public By pressLink = By.xpath("//ul[@class='list-unstyled footer-links inline']//a[contains(text(),'Press')]");
        public By weAreHiringLink = By.xpath("//a[@class='highlighted']");
        public By contactUsLink = By.xpath("//ul[@class='list-unstyled footer-links inline']//a[contains(text(),'Contact Us')]");

        /* Social media contact information */
        public By followOnUs = By.xpath("//p[@class='preamble']");
        public By fbIcon = By.xpath("//nav[@class='nav-social footer-links inline']//a[1]");
        public By twIcon = By.xpath("//div[@class='row footer-navs']//a[2]");
        public By igIcon = By.xpath("//div[@class='row footer-navs']//a[3]");
        public By inIcon = By.xpath("//div[@class='row footer-navs']//a[4]");

        /* Copyright information */
        public By copyRightText = By.xpath("//p[@class='copyright']");
        public By termsOfServiceLink = By.xpath("//p[@class='copyright']//a[contains(text(),'Terms of Service')]");
        public By privacyLink = By.xpath("//p[@class='copyright']//a[contains(text(),'Privacy Policy')]");
        public By licensesLink = By.xpath("//p[@class='copyright']//a[contains(text(),'Licenses')]");
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
        public By firstName = By.xpath("//input[@id='first_namestart']");
        public By lastName = By.xpath("//input[@id='last_namestart']");
        public By birthday = By.id("date_of_birthstart"); // starting from 01/01/1904

        /* Save & Continue button */
        public By saveAndContinueBtn = By.xpath("//button[@id='startDetailsSaveBtn']");
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
    }
}


