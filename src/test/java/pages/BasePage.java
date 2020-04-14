package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;

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
     * Clears an element's text
     *
     * @param identifier the By object for the click event
     */
    void clearElementText(By identifier) {
        try {
            click(identifier);
            driver.findElement(identifier).clear();
        } catch (Exception e) {
            System.out.println("The element's text should be empty");
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
            System.out.println("No such element found");
        }
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
     * Hover over element at given position
     *
     * @param identifier the By object
     */
    void hoverOverElement(By identifier) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(identifier)).build().perform();
    }
}
