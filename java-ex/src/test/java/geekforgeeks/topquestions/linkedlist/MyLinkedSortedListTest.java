package geekforgeeks.topquestions.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyLinkedSortedListTest {

    @Test
    @DisplayName("insert one element and get head should return same element")
    public void test1() {
        MyLinkedSortedList<Integer> myList = new MyLinkedSortedList<>();
        //add
        Integer item = new Integer(0);
        myList.insert(item);
        //get head
        assertEquals(item, myList.head());
    }

    @Test
    @DisplayName("insert three element in random order and get head should return lowest element")
    public void test2() {
        MyLinkedSortedList<String> myList = new MyLinkedSortedList<>();

        myList.insert("b");
        myList.insert("c");
        myList.insert("a");

        assertEquals("a", myList.pop());
        assertEquals("b", myList.pop());
        assertEquals("c", myList.pop());
    }


    @Test
    @DisplayName("Should throw exception on empty list")
    public void test3() {
        MyLinkedSortedList<Integer> myList = new MyLinkedSortedList<>();
        assertThrows(NoSuchElementException.class, () -> myList.pop());
        assertThrows(NoSuchElementException.class, () -> myList.head());
    }

    @Test
    @DisplayName("insert same element multiple times and one bigger element")
    public void test5() {
        MyLinkedSortedList<String> myList = new MyLinkedSortedList<>();

        myList.insert("a");
        myList.insert("a");
        myList.insert("b");
        myList.insert("a");
        myList.insert("b");
        myList.insert("c");

        assertEquals("a", myList.pop());
        assertEquals("a", myList.pop());
        assertEquals("a", myList.pop());
        assertEquals("b", myList.pop());
        assertEquals("b", myList.pop());
        assertEquals("c", myList.pop());
    }

    @Test
    @DisplayName("insert one element and then a smaller element")
    public void test4() {
        MyLinkedSortedList<String> myList = new MyLinkedSortedList<>();

        myList.insert("b");
        myList.insert("a");

        assertEquals("a", myList.pop());
        assertEquals("b", myList.pop());
    }

    @DisplayName("try list with random values for fun")
    @RepeatedTest(10)
    public void randomTest() {
        MyLinkedSortedList<Integer> myList = new MyLinkedSortedList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            if (random.nextBoolean() && !myList.isEmpty()) {
                myList.pop();
            } else {
                myList.insert(random.nextInt(10001));
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!myList.isEmpty()) {
            result.add(myList.pop());
        }
        List<Integer> sorted = new ArrayList<>(result);
        Collections.sort(sorted);
        assertIterableEquals(sorted, result);
    }
}