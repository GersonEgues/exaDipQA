import org.testng.annotations.Test;
import task.LogOutElement;

public class LogOutTest {
    @Test
    public void logoutTest(){
        LogOutElement.as(webDriver, "gerson.choque.loreno@gmail.com","123456");
    }
}
