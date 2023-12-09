package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.RegisterUI;

public class RegisterElement {
    public static void as(WebDriver webDriver, String fullName, String email, String pass) {
        Click.on(webDriver, HomePageUI.register);
        Enter.text(webDriver, RegisterUI.fullName, fullName);
        Enter.text(webDriver, RegisterUI.email, email);
        Enter.text(webDriver, RegisterUI.password, pass);
        Click.on(webDriver, RegisterUI.accept);
        Click.on(webDriver, RegisterUI.signUp);
    }
}
