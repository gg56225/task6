import java.util.Iterator;
import java.util.List;
// Flow class - Потенциально мы можем удалить этот класс и напрямую использовать List в FlowService
// для управления списком StudentGroup. Это упростило бы код и позволило бы придерживаться Single
// Responsibility Principle в качестве Flow не будет иметь ненужных функциональных возможностей.
public class Flow implements Iterable<StudentGroup> {

    private List<StudentGroup> groupList;

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;

    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return
        new FlowIterator(this);
    }
}
