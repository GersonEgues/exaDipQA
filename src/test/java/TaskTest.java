import org.testng.annotations.Test;
import task.TaskElement;

public class TaskTest {
    @Test
    public void newWorkTest(){
        TaskElement.as(webDriver, "gerson.choque.loreno@gmail.com","123456", "end task");
    }
}
