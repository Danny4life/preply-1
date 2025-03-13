package algorithm.leetcodeBST;

public class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class BinarySearchTree{
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val){
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        if(val < root.val){
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);

        }

        return root;
    }

    public TreeNode searchBst(int val){
        return searchBstRec(root, val);
    }

    private TreeNode searchBstRec(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }

        return (val < root.val) ? searchBstRec(root.left, val) : searchBstRec(root.right, val);
    }

    public void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);

            preOrder(root.right);
        }

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);

        int searchVal1 = 5;

        TreeNode result1 = bst.searchBst(searchVal1);
        System.out.print("Subtree rooted at " + searchVal1 + ": ");
        bst.preOrder(result1);
        System.out.println();



    }
}
