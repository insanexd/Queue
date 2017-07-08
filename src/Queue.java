public interface Queue<T> {
    //Operations
    boolean add(T t);
    T remove();
    T first();
    boolean isEmpty();
    int size();

}
