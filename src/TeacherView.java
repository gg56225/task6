import java.util.List;

public class TeacherView implements UserView<Teacher>{
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }
}
