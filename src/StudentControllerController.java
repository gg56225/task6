import java.util.List;

public class StudentControllerController implements UserController<Student>{
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final FlowService flowService = new FlowService();
    private  final StudentView studentView = new StudentView();


    public List<Flow> getSortedStreams() {
        return flowService.sortStreams(getStreams());
    }

    private List<Flow> getStreams() {

        return null;
    }

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList =
                studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}


