package ui;

import org.openqa.selenium.By;

public class StartPageUI {
    public static By logOut = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By newProyect = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]");
    public static By name = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By add = By.xpath("//*[@id=\"NewProjNameButton\"]");
    public static By diplomat = By.xpath("//*[@id=\"ItemId_4173900\"]/table/tbody/tr/td[3]");
}
