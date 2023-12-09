import org.testng.annotations.Test;
import task.RegisterElement;

public class RegisterTest {
    @Test
    public void registerTest(){
        RegisterElement.as(webDriver, "Gerson Egues cHoque Loreño", "gerson.choque.loreno@gmail.com","123456");
    }
}
