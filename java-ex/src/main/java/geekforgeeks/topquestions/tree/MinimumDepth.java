package geekforgeeks.topquestions.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 */
public class MinimumDepth {

    static class Node<T> {
        final T value;
        Node<T> left;
        Node<T> right;

        public Node(T value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

    /**
     * bfs to compute minimum height
     *
     * @param node
     * @param <T>
     * @return
     */
    public static <T> int compute(Node<T> node) {
        if (node == null) {
            return 0;
        } else if (node.isLeaf()) {
            return 1;
        } else {
            if (node.right == null) {
                return 1 + compute(node.left);
            } else if (node.left == null) {
                return 1 + compute(node.right);
            } else {
                return 1 + Math.min(compute(node.left), compute(node.right));
            }
        }
    }

    static class Depth{
        Node node;
        int depth;

        public Depth(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    public static <T> int levelOrderTraversal(Node<T> root){
        if(root == null){
            return 0;
        }

        ArrayDeque<Depth> queue = new ArrayDeque<>();
        queue.add(new Depth(root, 1));

        while (!queue.isEmpty()){
            Depth current = queue.pollFirst();
            if(current.node.left == null && current.node.right == null){
                return current.depth;
            }
            if(current.node.left != null){
                queue.add(new Depth(current.node.left, current.depth + 1));
            }
            if(current.node.right != null){
                queue.add(new Depth(current.node.right, current.depth + 1));
            }
        }

        return 0;
    }

}
