package binaryTree.classActivity3A;

public class Node {

    int data;

    Node left;

    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Binary{
    Node root;

    // Recursive InOrder Transversal Method
    void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left); // visit all the left subtree

        System.out.print(node.data + " "); // come back and print the root

        inOrder(node.right); // then visit all the right subtree

    }

    public static void main(String[] args) {
        Binary tree = new Binary();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Recursive Inorder Transversal");

        tree.inOrder(tree.root);
    }
}
