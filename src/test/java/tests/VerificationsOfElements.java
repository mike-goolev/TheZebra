package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class VerificationsOfElements extends BaseTest {
    private HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyHeaderLinks() {

        /* Start test on Zebra home page */
        homePage.loadHomePageByURL();

        /* Verify whether The Zebra icon links is displayed */
        Assert.assertTrue(homePage.verifyTheZebraHeadersLink(), "The Zebra homepage link is not displayed in the header");

        /* Hover over Compare header link */
        homePage.hoverOverCompareDropDown();

        /* Verify whether all links are displayed under Compare drop down */
        Assert.assertTrue(homePage.verifyCompareDropDownLinksPresent(), "Not all links are displayed under Compare drop down");

        /* Hover over Tools & Tips header link */
        homePage.hoverOverToolsAndTipsDropDown();

        /* Verify whether all links are displayed under Tools & Tips drop down */
        Assert.assertTrue(homePage.verifyToolsAndTipsDropDownLinksPresent(), "Not all links are displayed under Tools & Tips drop down");

        /* Hover over Company header link */
        homePage.hoverOverCompanyDropDown();

        /* Verify whether all links are displayed under Company drop down */
        Assert.assertTrue(homePage.verifyCompanyDropDownLinksPresent(), "Not all links are displayed under Company drop down");

        /* Verify whether call icon link is displayed */
        Assert.assertTrue(homePage.verifyCallIconHeadersLink(), "The call icon link is not displayed in the header");

        /* Verify whether phone number link is displayed */
        Assert.assertTrue(homePage.verifyPhoneNumberHeadersLink(), "The phone number link is not displayed in the header");
    }

    @Test
    public void verifyBodyWebElements() {

        /* Start test on Zebra home page */
        homePage.loadHomePageByURL();

        /* Verify whether Car and Home insurance radio buttons are displayed */
        Assert.assertTrue(homePage.verifyCarInsuranceRadioBtnPresent(), "Car insurance radio button is not displayed");
        Assert.assertTrue(homePage.verifyHomeInsuranceRadioBtnPresent(), "Home insurance radio button is not displayed");

        /* Verify whether Zip code fields are displayed */
        Assert.assertTrue(homePage.verifyZipCodeFirstPresent(), "Zip code field is not displayed under Compare insurance quotes section");
        Assert.assertTrue(homePage.verifyZipCodeSecondPresent(), "Zip code field is not displayed under Buy Online section");

        /* Verify whether Start buttons are displayed */
        Assert.assertTrue(homePage.verifyStartBtnFirstPresent(), "Start button is not displayed under Compare insurance quotes section");
        Assert.assertTrue(homePage.verifyStartBtnSecondPresent(), "Start button is not displayed under Buy Online section");

        /* Verify whether all icons are displayed */
        Assert.assertTrue(homePage.verifyShareIconPresent(), "Share icon is not displayed");
        Assert.assertTrue(homePage.verifyCompareIconPresent(), "Compare icon is not displayed");
        Assert.assertTrue(homePage.verifySaveIconPresent(), "Save icon is not displayed");
        Assert.assertTrue(homePage.verifyLockIconPresent(), "Lock icon is not displayed");
        Assert.assertTrue(homePage.verifyBuyOnlineIconPresent(), "Buy online icon is not displayed");
        Assert.assertTrue(homePage.verifyCallAnAgentPresent(), "Call An Agent icon is not displayed");
        Assert.assertTrue(homePage.verifyPhoneIconPresent(), "Phone icon is not displayed");
        Assert.assertEquals(homePage.verifyPhoneNumberText(), "1.888.255.4364");
        Assert.assertTrue(homePage.verifyCarInsuranceIconPresent(), "Car insurance icon is not displayed");
        Assert.assertTrue(homePage.verifyHomeInsuranceIconPresent(), "Home insurance icon is not displayed");
        Assert.assertTrue(homePage.verifyOrDividerIconPresent(), "OR icon is not displayed");


        /* Verify text of the elements */
        Assert.assertEquals(homePage.verifyPageMainHeadline(), "Insurance in\nblack & white.®");
        Assert.assertEquals(homePage.verifyPageSubHeadline(), "Compare insurance quotes instantly.");
        Assert.assertEquals(homePage.verifyBeenHereBeforeText(), "Been here before?\nReview your quotes.");
        Assert.assertEquals(homePage.verifySecondHeadline(), "How does\nThe Zebra work?");
        Assert.assertEquals(homePage.verifyShareTitle(), "Share");
        Assert.assertEquals(homePage.verifyShareText(), "Tell us a little about yourself and your car and home coverage needs.");
        Assert.assertEquals(homePage.verifyCompareTitle(), "Compare");
        Assert.assertEquals(homePage.verifyCompareText(), "We instantly show you dozens of quotes side-by-side from top providers for free.");
        Assert.assertEquals(homePage.verifySaveTitle(), "Save");
        Assert.assertEquals(homePage.verifySaveText(), "Choose your quote and secure your new rate in an instant, online or via one of our licensed agents.");
        Assert.assertEquals(homePage.verifyPrivacyPledgeTitle(), "Our Privacy Pledge");
        Assert.assertEquals(homePage.verifyPrivacyPledgeText(), "Your privacy matters to us. So does your sanity. We pledge not to sell your information to spammers, and that means no annoying calls, texts or emails. With The Zebra, compare and save the hassle-free way.");
        Assert.assertEquals(homePage.verifyEasyStartTitle(), "It's easy to\nstart saving.");
        Assert.assertEquals(homePage.verifyBuyOnlineTitle(), "Buy Online");
        Assert.assertEquals(homePage.verifyBuyOnlineText(), "Our easy-to-use tool lets you compare quotes from top providers, all at once and online.");
        Assert.assertEquals(homePage.verifyNoSpamText(), "No spam. We take your privacy seriously.");
        Assert.assertEquals(homePage.verifyCallAnAgentTitle(), "Call an Agent");
        Assert.assertEquals(homePage.verifyCallAnAgentText(), "Whether you just prefer a friendly voice or need more information, our licensed agents are ready to help you save.");

        /* Verify whether 'Review your quotes', 'home', 'quotes', 'compare and save', 'Hablamos Español' links are displayed  */
        Assert.assertTrue(homePage.verifyReviewYourQuotesLinkPresent(), "Review Your Quotes link is not displayed");
        Assert.assertTrue(homePage.verifyHomeLinkPresent(), "home link is not displayed inside Share paragraph");
        Assert.assertTrue(homePage.verifyQuotesLinkPresent(), "quotes link is not displayed inside Compare paragraph");
        Assert.assertTrue(homePage.verifyPledgeLinkPresent(), "compare and save link is not displayed inside Pledge paragraph");
        Assert.assertTrue(homePage.verifyEspanolLinkPresent(), "Hablamos Español link is not displayed under Call An Agent section");
    }

    @Test
    public void verifyFooterLinks() {

        /* Start test on Zebra home page */
        homePage.loadHomePageByURL();

        /* Verify whether all links are displayed under Car Insurance Guide */
        Assert.assertTrue(homePage.verifyCarInsuranceGuideLinksPresent(), "Not all links are displayed under Car Insurance Guide");

        /* Verify whether About Us, Press, We Are Hiring, Contact Us links are displayed */
        Assert.assertTrue(homePage.verifyAboutUsLinksPresent(), "Not all links are displayed");

        /* Verify whether all social media icon links are displayed and valid */
        Assert.assertEquals(homePage.verifyFollowUsText(), "Follow us on:");
        Assert.assertTrue(homePage.verifySocialMediaIconLinksPresent(), "Not all social media icon links are displayed in the footer");

        /* Verify text and links under Policy section */
        Assert.assertEquals(homePage.copyRight(), "© 2020 Insurance Zebra. All Rights Reserved. Use of Insurance Zebra Insurance Services (DBA TheZebra.com) is subject to our Terms of Service, Privacy Policy and Licenses.");
        Assert.assertTrue(homePage.verifyPoliciesLinksPresent(), "Not all policy links are displayed in the footer");
    }
}