package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LogInIU;
import ui.StartPageUI;

public class CreateProyectElement {
    public static void as(WebDriver webDriver, String email, String pass, String name) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LogInIU.email, email);
        Enter.text(webDriver, LogInIU.password, pass);
        Click.on(webDriver, LogInIU.loginClick);
        Click.on(webDriver, StartPageUI.newProyect);
        Enter.text(webDriver, StartPageUI.name, name);
        Click.on(webDriver, StartPageUI.add);

    }
}
