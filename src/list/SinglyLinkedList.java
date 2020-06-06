package list;

public class SinglyLinkedList<E> {
    private int size;

    // API
    public SinglyLinkedList() { }
    public SinglyLinkedList(SinglyLinkedList<E> orig) { }
    void InsertFirst(E e) { }
    void insertAfter(E e, int index) { }
    void removeFirst() { }
    void remove(int index) { }
    void removeAll() { }
    E getFirst() { }
    E get(int index) { }
    int size() { }
    public String toString() {}

    private static class Element<E> {
        private E data;
        Element next;

        public Element(E data) {
            this.data = data;
        }
    }
}
