package geekforgeeks.topquestions.linkedlist;

import java.util.NoSuchElementException;

/**
 * https://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/
 */
public class MyLinkedSortedList<T extends Comparable> {

//    public class Node {
//        final T value;
//        Node next;
//
//        public Node(T value) {
//            this.value = value;
//        }
//    }

    private Node<T> h;

    public void insert(T item) {
        //TODO check null value value
        if (h == null) {
            //empty list
            h = new Node(item);
        } else if (item.compareTo(h.value) < 0) {
            Node n = new Node(item);
            n.next = h;
            h = n;
        } else {
            Node last = null;
            Node current = h;
            while (current != null && current.value.compareTo(item) <= 0) {
                last = current;
                current = current.next;
            }
            Node n = new Node(item);
            if (current == null) {
                last.next = n;
            } else {
                last.next = n;
                n.next = current;
            }
        }
    }

    public boolean isEmpty() {
        return h == null;
    }

    public T head() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return h.getValue();
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T value = h.getValue();
        h = h.next;
        return value;
    }


}
