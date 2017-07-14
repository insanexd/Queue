import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface OrderedSet<T> extends java.util.List<T> {
    boolean addAll(int i, Collection<? extends T> collection);
    boolean addAll(Collection<? extends T> collection);

    T set(int i, T t);
    boolean add(T t);
    void add(int i, T t);

}
