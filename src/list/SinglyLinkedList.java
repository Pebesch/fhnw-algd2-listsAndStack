package list;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private int size;
    private Element head;

    // API
    public SinglyLinkedList() {
        size = 0;
        head = null;
    }

    public SinglyLinkedList(SinglyLinkedList<E> orig) {
        // Push last element first from orig
        for(int i = orig.size() - 1; i + 1 > 0; i--) {
            insertFirst(orig.get(i));
        }
    }

    void insertFirst(E e) {
        Element element = new Element(e);
        element.next = head;
        head = element;
        size++;
    }

    void insertAfter(E e, int index) {
        if(index > size - 1) throw new IndexOutOfBoundsException();
        Element current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Element newElement = new Element(e);
        newElement.next = current.next;
        current.next = newElement;
        size++;
    }

    void removeFirst() {
        if (size > 0) {
            head = head.next;
            size--;
        } else {
            throw new NoSuchElementException();
        }
    }

    void remove(int index) {
        if(index > size - 1) throw new IndexOutOfBoundsException();
        if(index != 0) {
            Element current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        } else {
            head = head.next;
        }
        size--;
    }

    void removeAll() {
        head = null;
        size = 0;
    }

    E getFirst() {
        if (size == 0) throw new NoSuchElementException();
        return (E)head.data;
    }

    E get(int index) {
        if(index > size - 1) throw new IndexOutOfBoundsException();
        Element current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E)current.data;
    }

    int size() {
        return size;
    }

    public String toString() {
        String result = "";
        Element<E> r = head;
        while (r != null){
            result += (r.data.toString() + "  ");
            r = r.next;
        }
        return result;
    }

    private static class Element<E> {
        E data;
        Element next;

        public Element(E data) {
            this.data = data;
        }
    }
}
