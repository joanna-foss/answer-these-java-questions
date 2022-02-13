package BST;

import java.util.Scanner;

public class LongestPath {
    static int totalPaths;

    static int longestPathLength(TreeNode root) {
        int totalPaths = 0;
        arrowLengths(root);
        return totalPaths;
    }

    static int arrowLengths(TreeNode root) {
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