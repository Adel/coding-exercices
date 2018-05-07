package geekforgeeks.topquestions.dp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCSTest {

    @Test
    @DisplayName("should return 0 if non identical chars in both strings")
    void compute1() {
        assertEquals(0, LCS.compute("abcd", "efghij"));
    }


    @Test
    @DisplayName("should return 1 if only one char")
    void compute2() {
        assertEquals(1, LCS.compute("abcd", "efgahij"));
    }

    @Test
    @DisplayName("should return longest common subsequence")
    void compute3() {
        assertEquals(4, LCS.compute("AGGTAB", "GXTXAYB"));
    }


    @Test
    @DisplayName("should return longest common subsequence")
    void compute4() {
        assertEquals(3, LCS.compute("ABCDGH", "AEDFHR"));
    }


}