package geekforgeeks.topquestions.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthTest {

    @Test
    @DisplayName("root with no child nodes should return 1")
    void compute() {
        assertEquals(1, MinimumDepth.compute(new MinimumDepth.Node<>(1)));
    }



    @Test
    @DisplayName("root with only one left child should return 2")
    void compute2() {
        MinimumDepth.Node root = new MinimumDepth.Node(1);
        root.setLeft(new MinimumDepth.Node(2));
        assertEquals(2, MinimumDepth.compute(root));
        assertEquals(2, MinimumDepth.levelOrderTraversal(root));
    }


    @Test
    @DisplayName("root with two leafs should return 2")
    void compute3() {
        MinimumDepth.Node root = new MinimumDepth.Node(1);
        root.setLeft(new MinimumDepth.Node(2));
        root.setRight(new MinimumDepth.Node(3));

        assertEquals(2, MinimumDepth.compute(root));
        assertEquals(2, MinimumDepth.levelOrderTraversal(root));
    }

    @Test
    @DisplayName("root with no left child and right child")
    void compute4() {
        MinimumDepth.Node root = new MinimumDepth.Node(1);
        root.setRight(new MinimumDepth.Node(3));

        assertEquals(2, MinimumDepth.compute(root));
        assertEquals(2, MinimumDepth.levelOrderTraversal(root));
    }



    @Test
    @DisplayName("root with children should return correct minimum depth")
    void compute5() {
        MinimumDepth.Node root = new MinimumDepth.Node(1);
        MinimumDepth.Node left = new MinimumDepth.Node(2);
        root.setLeft(left);
        MinimumDepth.Node right = new MinimumDepth.Node(3);
        root.setRight(right);
        MinimumDepth.Node fourth = new MinimumDepth.Node(4);
        left.setLeft(fourth);
        left.setRight(new MinimumDepth.Node(5));
        fourth.setLeft(new MinimumDepth.Node(8));
        right.setLeft(new MinimumDepth.Node(6));
        right.setRight(new MinimumDepth.Node(7));
        assertEquals(3, MinimumDepth.compute(root));
        assertEquals(3, MinimumDepth.levelOrderTraversal(root));
    }
}