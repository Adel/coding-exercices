package geekforgeeks.topquestions.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Compare2StringsTest {

    @Test
    @DisplayName("should return 0 for 2 empty lists")
    void compare1() {
        assertEquals(0, Compare2Strings.compare(fromString(""), fromString("")));
    }

    @Test
    @DisplayName("should return -1 if first list is empty")
    void compare2() {
        assertEquals(-1, Compare2Strings.compare(fromString(""), fromString("a")));
    }

    @Test
    @DisplayName("should return 1 if second list is empty")
    void compare3() {
        assertEquals(1, Compare2Strings.compare(fromString("a"), fromString("")));
    }

    @Test
    @DisplayName("should return 0 for one element equal lists")
    void compare4() {
        assertEquals(0, Compare2Strings.compare(fromString("a"), fromString("a")));
    }

    @Test
    @DisplayName("should return -1 for one element list [a] and [b]")
    void compare5() {
        assertEquals(-1, Compare2Strings.compare(fromString("a"), fromString("b")));
    }

    @Test
    @DisplayName("should return 0 for one element equal lists")
    void compare6() {
        assertEquals(1, Compare2Strings.compare(fromString("b"), fromString("a")));
    }

    @Test
    @DisplayName("should return correct ordering")
    void compare7() {
        assertEquals(-1, Compare2Strings.compare(fromString("geeksa"), fromString("geeksb")));
    }

    @Test
    @DisplayName("should return correct ordering")
    void compare8() {
        assertEquals(0, Compare2Strings.compare(fromString("geeks"), fromString("geeks")));
    }

    @Test
    @DisplayName("should return correct ordering")
    void compare9() {
        assertEquals(1, Compare2Strings.compare(fromString("geeksb"), fromString("geeksa")));
    }



    private Node<Character> fromString(String s) {
        if (s.length() > 0) {
            Node h = new Node(s.charAt(0));
            Node current = h;
            for (int i = 1; i < s.length(); i++) {
                Node n = new Node(s.charAt(i));
                current.next = n;
                current = n;
            }
            return h;
        }
        return null;
    }
}