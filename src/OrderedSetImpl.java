import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderedSetImpl<T> extends java.util.ArrayList<T> implements OrderedSet<T>{
    //Attributes
    public List<T> myList = new ArrayList<>();

    //Constructors
    public OrderedSetImpl() {}
    public OrderedSetImpl(int initialCapacity) {

    }
    //Methods
    @Override
    public boolean contains(Object o) {
        if(this.myList.contains((T)o)) {
            System.out.println("Object found!");
        } else {
            System.out.println("Object not found!");
        }
        return this.myList.contains((T) o);
    }
    @Override
    public boolean addAll(int i, Collection<? extends T> collection) throws UnsupportedOperationException{
        if(collection.isEmpty()) throw new UnsupportedOperationException("hihihi");
        for(T t: collection) {
            if(!this.myList.contains(t)) {
                this.myList.add(i, t);
            }

        }
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends T> collection) throws UnsupportedOperationException  {
        if(collection.isEmpty()) throw new UnsupportedOperationException("oioi");

        for(T t : collection) {
            if(!this.myList.contains(t)) {
                this.myList.add(t);
            }
        }
        return false;
    }
    @Override
    public T set(int i, T t) throws NullPointerException {
        T temp;
        if(t == null) throw new NullPointerException();
        if(!this.myList.contains(t)) {
           temp = this.myList.set(i, t);
           return temp;
        }

        return null;
    }
    @Override
    public boolean add(T t) throws NullPointerException {
        if(t == null) throw new NullPointerException();
        if(!this.myList.contains(t)) {
            this.myList.add(t);
            System.out.println("Element added at the end of the Set!");
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void add(int i, T t) throws NullPointerException{
        if(t == null) throw new NullPointerException();
        if(!this.myList.contains(t)) {
            this.myList.add(i, t);
            System.out.println("Element added in the position 'i' of the Set!");
        }
    }
    @Override
    public int size() {
        return this.myList.size();
    }
    @Override
    public boolean isEmpty() {
        return this.myList.isEmpty();
    }
    @Override
    public T get(int i) {
        return this.myList.get(i);
    }

    @Override
    public T remove(int index) {
        return this.myList.remove(0);
    }
}
