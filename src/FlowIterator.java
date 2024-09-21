import java.util.Iterator;
// FlowIterator class - этот класс кажется пустым и не предоставляет никаких
//специальная функциональность для перебора групп учащихся. Мы можем удалить его
//и используйте итератор по умолчанию, предоставляемый реализацией списка в FlowService.
// Это соответствует принципу Single Responsibility Principle
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

