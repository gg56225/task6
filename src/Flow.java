import java.util.Iterator;
import java.util.List;

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