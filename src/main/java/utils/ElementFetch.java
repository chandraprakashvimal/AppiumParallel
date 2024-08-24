package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFetch {
    public WebElement getWebElement(AppiumDriver driver, String identifier, String digit1) {
        if (identifier.equals("ID")) {
            return driver.findElement(By.id(digit1));
        }
        return null;
    }
}
