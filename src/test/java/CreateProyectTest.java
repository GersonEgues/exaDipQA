import org.testng.annotations.Test;
import task.CreateProyectElement;

public class CreateProyectTest {
    @Test
    public void newProjectTest(){
        CreateProyectElement.as(webDriver, "gerson.choque.loreno@gmail.com","123456", "Exa QA Diplomado V5");
    }
}
