import java.util.Scanner;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode() {};

    BinaryTreeNode(int data) {
        this.data = data;
    }

    BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class LongestPath {
    static int totalPaths;
    static Scanner sc = new Scanner(System.in);

    static int longestPathLength(BinaryTreeNode root) {
        int totalPaths = 0;
        arrowLengths(root);
        return totalPaths;
    }

    static int arrowLengths(BinaryTreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = arrowLengths(root.left);
        int right = arrowLengths(root.right);

        int arrowLeft = 0;
        int arrowRight = 0;

        if(root.left != null && root.left.data == root.data) {
            arrowLeft += left + 1;
        }

        if(root.right != null && root.right.data == root.data) {
            arrowRight += right + 1;
        }

        totalPaths = Math.max(totalPaths, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}