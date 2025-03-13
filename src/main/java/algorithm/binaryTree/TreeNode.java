package algorithm.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    int val; // stores the value of the node

    TreeNode left; // this is a reference to the left child node

    TreeNode right; // this is a reference to the right child node

    public TreeNode(int val) {
        this.val = val;
    }
}

class InvertBinaryTree{
    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }

        // swap left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }


    // this is for us to test on our IDE
    public static void printTree(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }

        System.out.println();

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);

        System.out.println("Original tree:");
        printTree(root);

        root = invertTree(root);

        System.out.println("Inverted tree:");
        printTree(root);

    }
}
