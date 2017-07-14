import java.util.LinkedList;
import java.util.List;

public class QueueImpl<T> implements Queue<T>{
    private List<T> elements;

    public QueueImpl(boolean withDuplicates) {
        if(withDuplicates) {
            elements = new LinkedList<>();
        } else {
            elements = new OrderedSetImpl<>();
        }

    }

    //FAIL
    @Override
    public boolean add(T t) throws NullPointerException {
        if(t == null) throw new NullPointerException();
        return this.elements.add(t);
    }

    //FAIL
    @Override
    public T remove() {
        if(this.elements.isEmpty()) return null;
        return this.elements.remove(0);
    }
    //OK
    @Override
    public T first() {
        if(this.elements.isEmpty()) return null;
        return this.elements.get(0);
    }
    //OK
    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
    //OK
    @Override
    public int size() {
        return this.elements.size();
    }
}
