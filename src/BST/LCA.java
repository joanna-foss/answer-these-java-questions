package BST;

public class LCA {
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        if(root == null) {
            return null;
        }
        if(root.data == node1 || root.data == node2 || root.data == node3) {
            return root;
        }

        BinaryTreeNode<Integer> left = lcaOfThreeNodes(root.left, node1, node2, node3);
        BinaryTreeNode<Integer> right = lcaOfThreeNodes(root.right, node1, node2, node3);

        if(left != null && right != null) {
            return root;
        } else if (left == null) {
            return right;
        } else {
            return left;
        }
    }
}