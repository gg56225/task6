import java.util.Comparator;


public class StreamComparator implements Comparator<Flow> { // Сравнение по количеству групп

    @Override
    public int compare(Flow flow1, Flow flow2) {
        return Integer.compare(flow1.getGroupList().size(), flow2.getGroupList().size());
    }
}

