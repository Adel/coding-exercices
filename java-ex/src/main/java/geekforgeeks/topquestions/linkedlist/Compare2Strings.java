package geekforgeeks.topquestions.linkedlist;

/**
 * https://www.geeksforgeeks.org/compare-two-strings-represented-as-linked-lists/
 */
public class Compare2Strings {

    public static <T extends Comparable> int compare(Node<T> h1, Node<T> h2) {
        Node n1 = h1, n2 = h2;
        while (n1 != null && n2 != null) {
            int co = n1.value.compareTo(n2.value);
            if (co != 0) {
                return co;
            } else {
                n1 = n1.next;
                n2 = n2.next;
            }
        }

        if (n1 == null && n2 == null) {
            return 0;
        } else if (h2 != null) {
            return -1;
        } else {
            return 1;
        }
    }
}
