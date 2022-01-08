package BST;
//Notes about binary trees:
//Full Binary Trees exist when every node has exactly 0 or 2 children.
//Perfect Binary Trees exist when all of the internal nodes have exactly 2 children and all leaves are at the same level.
//Complete Binary Trees exist when every level except the last is completely filled and all nodes are placed as far left as possible.

public class Tree {
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
//    public Node traverseTheTree(Tree tree, Node node){
//        int root = 0;
//
//        return root;
//    }

    public void insert(Node node, int data){

    }

    public Tree perfectTreePostOrder(int height){
        Tree test = new Tree();



        return test;
    }

    public static void main(String[] args) {

    }
}