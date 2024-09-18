import java.util.Iterator;

public record FlowIterator(Flow flow) implements Iterator<StudentGroup> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentGroup next() {
        return null;
    }
}
