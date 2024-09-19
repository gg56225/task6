import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public List<Teacher> teachers = new ArrayList<>();

    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);

        teachers.add(teacher);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {

    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }
}
