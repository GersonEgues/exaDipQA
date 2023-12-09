package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LogInIU;
import ui.StartPageUI;

public class LogOutElement {
    public static void as(WebDriver webDriver, String email, String password) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LogInIU.email, email);
        Enter.text(webDriver, LogInIU.password, password);
        Click.on(webDriver, LogInIU.loginClick);
        Click.on(webDriver, StartPageUI.logOut);
    }
}
