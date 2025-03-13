package binaryTree.classActivity2A;

public class Node {

    int data; // This will represent the data stored in the node (e.g., an integer value).
    Node left; // This will reference to the left child of the node

    Node right; // This will reference to the right child of the node

    public Node(int data) {
        this.data = data; // Assign the provided data to the node
        left = right = null; // Initialize left and right children as null (no children initially)
    }
}

class BinaryTree{
    Node root; // This represents the root node of the Binary Tree - it serves as the starting point of the transversal


    // Method to perform the pre-order transversal of the Binary tree
    void preOrder(Node node){

        if(node == null){
            return; // Base case: if the node is null, return (just stop the recursion)
        }

        // process the current node by printing its data
        System.out.print(node.data + " ");

        // Recursively transverse the left subtree - recursive method is a method that calls itself.
        preOrder(node.left);

        // Recursively transverse the right subtree
        preOrder(node.right);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Construct the tree
        tree.root = new Node(1); // Create the root node with the data = 1.
        tree.root.left = new Node(2); // create the left child of the root with data = 2.
        tree.root.right = new Node(3); // create the right child of the root with data = 3.
        tree.root.left.left = new Node(4); // create the left child of node 2 with the data = 4.
        tree.root.left.right = new Node(5); // create the right child of node 2 with data = 5.
        tree.root.right.right = new Node(6); // create the right child pf node 3 with data = 6.

        System.out.println("pre-order transversal of binary tree:");

        tree.preOrder(tree.root);

    }
}
