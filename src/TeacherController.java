import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(teacherId, firstName, lastName, middleName);
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.sendOnConsole(teachers);
        return teachers;
    }
}

