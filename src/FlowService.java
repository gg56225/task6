import java.util.List;

public class ПотокСервис {
    public List<Поток> sortStreams(List<Поток> streamList) {
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
