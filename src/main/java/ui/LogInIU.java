package ui;

import org.openqa.selenium.By;

public class LogInIU {
    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
    public static By loginClick = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");
}
