package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LogInIU;
import ui.StartPageUI;
import ui.TaskPageUI;

public class TaskElement {
    public static void as(WebDriver webDriver, String email, String pass, String tarea) {
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LogInIU.email, email);
        Enter.text(webDriver, LogInIU.password, pass);
        Click.on(webDriver, LogInIU.loginClick);
        Click.on(webDriver, StartPageUI.diplomat);
        Enter.text(webDriver, TaskPageUI.taskName, tarea);
        Click.on(webDriver, TaskPageUI.btnAdd);
    }
}
