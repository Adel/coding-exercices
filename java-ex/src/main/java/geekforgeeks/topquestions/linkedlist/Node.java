package geekforgeeks.topquestions.linkedlist;

public class Node<T extends Comparable> {
    final T value;
    Node next;

    public Node(T item) {
        this.value = item;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
