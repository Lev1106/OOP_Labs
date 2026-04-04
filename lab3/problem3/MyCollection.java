package lab3.problem3;

public interface MyCollection<E> {
    void add(E element);
    void delete(E element);
    void clear();
    int getSize();
    boolean isEmpty();
    boolean contains(E element);
}
