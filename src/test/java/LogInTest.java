import org.testng.annotations.Test;
import task.LogInElement;

public class LogInTest {
    @Test
    public void loginTest(){
        LogInElement.as(webDriver, "gerson.choque.loreno@gmail.com","123456");
    }
}
