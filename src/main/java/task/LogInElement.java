package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LogInIU;

public class LogInElement {
    public static void as(WebDriver webDriver, String email, String pass) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LogInIU.email, email);
        Enter.text(webDriver, LogInIU.password, pass);
        Click.on(webDriver, LogInIU.loginClick);
    }
}
