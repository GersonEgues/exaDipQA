package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter {
    public static void text(WebDriver webDriver, By locator, String sms){
        webDriver.findElement(locator).sendKeys(sms);
    }
}
