import java.util.List;

public class Teacher extends  User{
    private Long teacherId;
    private List<StudentGroup> assignedGroups;
    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public List<StudentGroup> getAssignedGroups() {
        return assignedGroups;
    }

    public void setAssignedGroups(List<StudentGroup> assignedGroups) {
        this.assignedGroups = assignedGroups;
    }

    public void addGroup(StudentGroup group) {
        assignedGroups.add(group);
    }

    public void removeGroup(StudentGroup group) {
        assignedGroups.remove(group);
    }
}

