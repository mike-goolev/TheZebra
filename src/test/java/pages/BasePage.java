package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Reporter.log;

public class BasePage {

    public static WebDriver driver;
    public WebDriverWait wait;
    private int waitInSeconds;

    public BasePage(WebDriver d) {
        driver = d;

        /* Setup fluent wait */
        waitInSeconds = 20;
        wait = new WebDriverWait(driver, waitInSeconds, 400);
        wait.ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementNotSelectableException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    /**
     * Verifies if a given element exists on the page
     *
     * @param identifier the By object e.g. dashPageLocators.employerDashJobsCardPostJobBtn
     *
     * @return Whether or not the element exists
     */
    public boolean elementExists(By identifier) {
        try {
            driver.findElement(identifier).isDisplayed();
            return true;
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            return false;
        }
    }

    /**
     * Clicks an element
     *
     * @param identifier the By object
     */
    public void click(By identifier) {
        try {
            wait.until(elementToBeClickable(identifier));
            driver.findElement(identifier).click();
        } catch (NoSuchElementException | ElementClickInterceptedException | StaleElementReferenceException e) {
            driver.findElement(identifier).click();
        }
    }

    /**
     * Clicks an element
     *
     * @param identifier the By object
     */
    public void select(By identifier) {
        try {
            wait.until(elementToBeSelected(identifier));
            driver.findElement(identifier).click();
        } catch (NoSuchElementException | ElementClickInterceptedException | StaleElementReferenceException e) {
            driver.findElement(identifier).click();
        }
    }

    /**
     * Clears an element's text
     *
     * @param identifier the By object for the click event
     */
    void clearElementText(By identifier) {
        try {
            click(identifier);
            driver.findElement(identifier).clear();
            Assert.assertEquals(getElementText(identifier), "", "The element's text should be empty");
        } catch (Exception e) {
            Assert.assertEquals(getElementText(identifier), "", "The element's text should be empty");
        }
    }

    /**
     * Sets text of an element
     *
     * @param identifier the By object
     * @param text       the text to send to the identifier
     */
    public void setElementText(By identifier, String text) {
        try {
            clearElementText(identifier);
            driver.findElement(identifier).sendKeys(text);
        } catch (NoSuchElementException | ElementNotInteractableException e) {
        }
    }

    /**
     * Gets text of an element
     *
     * @param identifier the By object
     * @return The element's text
     */
    public String getElementText(By identifier) {
        String text = null;
        try {
            text = driver.findElement(identifier).getText();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("can't find element");
        }
        return text;
    }

    /**
     * Checks to see if a given element disappears on the page
     *
     * @param identifier the By object
     *
     * @return Whether or not the element does not exist
     */
    boolean elementDoesNotExist(By identifier) {
        if (!elementExists(identifier)) {
            return true;
        }
        else {
            wait.until(invisibilityOfElementLocated(identifier));
        }
        return false;
    }

    /**
     * Waits for loading indicator
     *
     * @param identifier the By object
     */
    void waitForLoadingIndicator(By identifier) {
        elementDoesNotExist(identifier);
    }

    /**
     * Verifies if a radio button is in a selected state by looking at the input attribute for checked
     *
     * @param identifier the By object for the radio button
     *
     * @return whether or not a radio button has been selected
     */
    boolean isRadioButtonSelected(By identifier) {
        return getElementAttribute(identifier, "input").contains("checked");
    }

    /**
     * Gets text of an element's attribute
     *
     * @param identifier the By object
     * @param attribute the element's attribute value
     *
     * @return The element's attribute text
     */
    String getElementAttribute(By identifier, String attribute) {
        String attributeText = null;
        if (elementExistsLongTimeout(identifier)) {
            try {
                attributeText = driver.findElement(identifier).getAttribute(attribute);
            } catch (NoSuchElementException e) {
                log(identifier + "Unable to get attribute of element " + identifier + "\n" + e.getLocalizedMessage(), true);
            }
        }
        return attributeText;
    }

    /**
     * Verifies if a given element exists on the page
     *
     * @param identifier the By object
     *
     * @return Whether or not the element exists
     */
    boolean elementExistsLongTimeout(By identifier) {
        try {
            wait.until(visibilityOfElementLocated(identifier));
            return true;
        } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            log( "\n\n\tElement " + identifier + "' did not display. \nWaited " +  this.getClass().getSimpleName() + "...\n", true);
            return false;
        }
    }
}
