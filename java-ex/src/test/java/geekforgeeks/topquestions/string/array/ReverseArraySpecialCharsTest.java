package geekforgeeks.topquestions.string.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArraySpecialCharsTest {

    @Test
    void reverseEmptyChar() {
        assertEquals("", ReverseArraySpecialChars.reverse(""));
    }

    @Test
    void reverseOnElemChar() {
        assertEquals("a", ReverseArraySpecialChars.reverse("a"));

    }

    @Test
    void reverseOnlyRegular() {
        assertEquals("dcba", ReverseArraySpecialChars.reverse("abcd"));

    }

    @Test
    void reverseRegularButNoSpecials() {
        assertEquals("d|c|b|a", ReverseArraySpecialChars.reverse("a|b|c|d"));
    }

    @Test
    void reverseOnlyOneAndKeepOther() {
        assertEquals("c|b|a", ReverseArraySpecialChars.reverse("a|b|c"));
    }

    @Test
    void reverseExample() {
        assertEquals("ed,c,bA!$", ReverseArraySpecialChars.reverse("Ab,c,de!$"));
    }

}