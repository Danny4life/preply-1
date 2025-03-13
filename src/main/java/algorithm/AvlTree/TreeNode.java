package algorithm.AvlTree;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution{
    public boolean isBalanced(TreeNode root){
        return checkedHeight(root) != -1;

    }

    private int checkedHeight(TreeNode node) {
        if(node == null) return 0; // Base case: Empty tree is balanced

        // Recursively check the height of left subtree
        int leftHeight = checkedHeight(node.left);
        if(leftHeight == -1) return -1; // if left tress is unbalanced, return -1

        // Recursively check the height of right subtree
        int rightHeight = checkedHeight(node.right);
        if(rightHeight == -1) return -1; // if right subtree is unbalanced, return -1

        // check if the current node is balanced
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        // Return height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Case 1:
//        TreeNode root1 = new TreeNode(3);
//        root1.left = new TreeNode(9);
//        root1.right = new TreeNode(20);
//        root1.right.left = new TreeNode(15);
//        root1.right.right = new TreeNode(7);
//
//        System.out.println(solution.isBalanced(root1));


        // Case 2:
//        TreeNode root2 = new TreeNode(1);
//        root2.left = new TreeNode(2);
//        root2.right = new TreeNode(2);
//        root2.left.left = new TreeNode(3);
//        root2.left.right = new TreeNode(3);
//        root2.left.left.left = new TreeNode(4);
//        root2.left.left.right = new TreeNode(4);
//
//        System.out.println(solution.isBalanced(root2));


        // Case 3:
        System.out.println(solution.isBalanced(null));
    }
}
