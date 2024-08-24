package pageEvents;

import io.appium.java_client.AppiumDriver;
import pageObjects.CalculatorElements;
import utils.ElementFetch;

public class CalculatorEvents {
    AppiumDriver driver;

    public CalculatorEvents(AppiumDriver driver) {
        this.driver = driver;
    }

    public void firstMethod() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.digit1).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.add).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.digit2).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.equals).click();
        Thread.sleep(1000);
    }

    public void secondMethod() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.digit6).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.sub).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.digit3).click();
        Thread.sleep(1000);
        elementFetch.getWebElement(driver, "ID", CalculatorElements.equals).click();
        Thread.sleep(1000);
    }
}
