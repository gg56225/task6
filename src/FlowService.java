import java.util.List;

public class FlowService {
    public List<Flow> sortStreams(List<Flow> streamList) {
        streamList.sort(new StreamComparator());
        return streamList;
    }
}

