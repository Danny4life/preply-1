package avlTree;

public class TreeNode {
    int val; // Stores the value of the node;
    
    int height; // Height of the node(used for balancing)
    
    TreeNode left; // Reference to the left child
    
    TreeNode right; // Reference to the right child

    public TreeNode(int val) {
        this.val = val;
        this.height = 1; // Initially, new nodes have height 1
    }


    private int num; // modified state
}

class AVLTree{
    private TreeNode root; // Root node of the AVL Tree
    
    // Get height of a node
    private int height(TreeNode node){
        
        // if node is null, return height 0 (base case)
        // Otherwise, return the node's height
        return (node == null) ? 0 : node.height;
        
    }
    
    // Get the balance factor
    private int getBalanceFactor(TreeNode node){
        // The Balance factor = Height of left subtree - Height of right subtree
        // This determines if the tree is balanced or needs rotation
        return (node == null) ? 0 : height(node.left) - height(node.right);
        
    }
    
    // Right Rotate(RR Rotation for Balancing the Tree)
    private TreeNode rightRotate(TreeNode y){
        TreeNode x = y.left; // new root
        TreeNode T2 = x.right; // save x's right subtree
        
        // perform rotation
        x.right = y;
        y.left = T2;
        
        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        
        return x; // Return new root
        
    }
    
    // Left Rotate (LL Rotation - Left Rotation For Balancing The Tree)
    private TreeNode leftRotate(TreeNode x){
        TreeNode y = x.right; // New root
        TreeNode T2 = y.left; // Save y's left subtree
        
        // Perform rotation
        y.left = x;
        x.right = T2;
        
        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        
        return y; // return new root
    }
    
    // Insert into AVL Tree
    public void insert(int val){
        root = insertRec(root, val);
        
    }

    private TreeNode insertRec(TreeNode node, int val) {
        if(node == null) return new TreeNode(val); // Base case: Create new node
        
        if(val < node.val) node.left = insertRec(node.left, val); // Go left
        else if (val > node.val) node.right = insertRec(node.right, val); // Go right
        
        else return node; // Duplicate values not allowed
        
        // Update height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        // Get balance factor to check for imbalance
        int balance = getBalanceFactor(node);
        
        // Rotation to balance the tree
        // LL Rotation
        if(balance > 1 && val < node.left.val) return rightRotate(node);
        
        // RR Rotation
        if(balance < -1 && val > node.right.val) return leftRotate(node);
        
        // LR Rotation
        if(balance > 1 && val > node.left.val){
            node.left = leftRotate(node.left);
            
            return rightRotate(node);
        }
        
        // RL Rotation
        if(balance < -1 && val < node.right.val){
            node.right = rightRotate(node.right);
            
            return leftRotate(node);
        }
        
        return node; // Return Balanced node
    }
    
    // Delete a node from an AVL Tree
    public void delete(int val){
        root = deleteRec(root, val);
    }

    private TreeNode deleteRec(TreeNode node, int val) {
        if(node == null) return null; // Base case
        
        // find the node to be deleted
        if(val < node.val) node.left = deleteRec(node.left, val);
        else if (val > node.val) node.right = deleteRec(node.right, val);
        else {
            // Node with one or no child
            if(node.left == null || node.right == null){
                node = (node.left != null) ? node.left : node.right;
            }else {
                // Node with two children,get the inorder successor
                TreeNode temp = findMin(node.right);
                node.val = temp.val;
                node.right = deleteRec(node.right, temp.val);
            }
        }
        if(node == null) return null; // if the tree becomes empty
        
        // Update height 
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        // Get the balance factor
        int balance = getBalanceFactor(node);
        
        // LL Rotation
        if(balance > 1 && getBalanceFactor(node.left) >= 0) return rightRotate(node);
        
        // LR Rotation
        if(balance > 1 && getBalanceFactor(node.left) < 0){
            node.left = leftRotate(node.left);
            
            return rightRotate(node);
        }
        
        // RR Rotation
        if(balance < -1 && getBalanceFactor(node.right) <= 0) return leftRotate(node);
        
        // RL Rotation
        if(balance < -1 && getBalanceFactor(node.right) > 0){
            node.right = rightRotate(node.right);
            
            return leftRotate(node);
        }
        
        return node;
    }

    // Find the smallest node (used for deletion)
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;

        return node;
    }

    // This search for a value
    public boolean search(int val){
        return searchRec(root, val);

    }

    private boolean searchRec(TreeNode node, int val) {
        if(node == null) return false;
        if(val == node.val) return true;

        return val < node.val ? searchRec(node.left, val) : searchRec(node.right, val);

    }

    // Inorder transversal (for testing) - to print the values in ascending order
    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode node) {
        if(node != null){
            inOrderRec(node.left);
            System.out.print(node.val + " ");
            inOrderRec(node.right);
        }

    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(25);
        tree.insert(50);

        tree.inOrder();

        // left --> root --> right

        tree.delete(40);

        tree.inOrder();
    }
}
