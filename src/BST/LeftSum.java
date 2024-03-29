package BST;

public class LeftSum {
    public static long leftSum(BinaryTreeNode<Integer> root) {
       return calculate(root, false);
    }

    public static long calculate(BinaryTreeNode<Integer> root, boolean isLeftNode) {
        if(root == null) {
            return 0;
        }

        long left = calculate(root.left, true);
        long right = calculate(root.right, false);

        if(isLeftNode) {
            return left + right + (long) root.data;
        }
        return left + right;
    }
}