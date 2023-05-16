import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldSimpleTaskSearchNotNull() {

        SimpleTask simpleTask = new SimpleTask(6, "Погулять вечером");

        String query = "ечер";

        boolean actual = simpleTask.matches(query);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSimpleTaskSearchNull() {

        SimpleTask simpleTask = new SimpleTask(6, "Погулять вечером");

        String query = "ечера";

        boolean actual = simpleTask.matches(query);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingSearchTopicNotNull() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String query = "3й";

        boolean actual = meeting.matches(query);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingSearchProjectNotNull() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String query = "Нето";

        boolean actual = meeting.matches(query);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingSearchNull() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String query = "3333";

        boolean actual = meeting.matches(query);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEpicSearchNotNull() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        String query = "ца";

        boolean actual = epic.matches(query);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEpicSearchNull() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        String query = "ечера";

        boolean actual = epic.matches(query);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
