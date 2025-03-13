package bTree;

public class BtreeNode {
    int[] keys; // Array to store keys
    int t; // Minimum degree (defines the range of number of keys)
    
    BtreeNode[] children; // Array of child pointers
    
    int numKeys; // Current number of keys
    
    boolean leaf; // True if the node is a leaf

    public BtreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1]; // Max keys a node can have = 2t - 1
        this.children = new BtreeNode[2 * t]; // Max children a node can have = 2t
        this.numKeys = 0; // Initially, node has no keys
    }
}

class Btree{
    private BtreeNode root; // Root node of the tree
    private int t; // Minimum degree (t defines the order of the B-Tree)

    public Btree(int t) {
        this.t = t;
        this.root = null;
    }
    
    // Search a key in the B-Tree
    public BtreeNode search(int key){
        return (root == null) ? null : searchRec(root, key);
        
    }

    // Recursive helper method to search for a key
    private BtreeNode searchRec(BtreeNode node, int key) {
        int i = 0;
        while (i < node.numKeys && key > node.keys[i]){
            i++; // find the first key greater than or equal to a key
        }
        
        // if the key is found, return the node
        if(i < node.numKeys && node.keys[i] == key){
            return node; // found key
        }
        
        // if the node is a leaf, the key is not present
        if(node.leaf){
            return null; // Reached leaf, key is not found
        }
        
        // Recur to the appropriate child
        return searchRec(node.children[i], key); // Continue searching
    }
    
    // Insert a key into the B-Tree
    public void insert(int key){
        if(root == null){
            // if tree is empty, create the first node
            root = new BtreeNode(t, true);
            root.keys[0] = key; // inserting key
            root.numKeys = 1;
        }else {
            // if root is full, create a new root and split it
            if(root.numKeys == (2 * t - 1)){
                BtreeNode newRoot = new BtreeNode(t, false);
                newRoot.children[0] = root;
                splitChild(newRoot, 0, root);
                int i = (newRoot.keys[0] < key) ? 1 : 0;
                insertNonFull(newRoot.children[i], key);
                root = newRoot;
            }else {
                insertNonFull(root, key);
            }
        }
        
    }

    // Insert key into a node that is not full
    private void insertNonFull(BtreeNode node, int key) {
        int i = node.numKeys - 1;

        if(node.leaf){
            // Insert key in correct position in leaf node
            while (i >= 0 && key < node.keys[i]){

                node.keys[i + 1] = node.keys[i];

                i--;
            }
            node.keys[i + 1] = key;
            node.numKeys++;
        }else {
            // find the correct child to insert the key into
            while (i >= 0 && key < node.keys[i]){
                i--;
            }
            i++;
            // if the child is full, split it
            if(node.children[i].numKeys == (2 * t -1)){
                splitChild(node, i, node.children[i]);

                if(key > node.keys[i]){
                    i++;
                }
            }
            insertNonFull(node.children[i], key);
        }
    }

    // Split a full child node
    private void splitChild(BtreeNode parent, int i, BtreeNode child) {
        BtreeNode newChild = new BtreeNode(t, child.leaf);
        parent.keys[i] = child.keys[t - 1];  // move middle key to parent

        // move second half of keys to the new child
        for (int j = 0; j < t - 1; j++){
            newChild.keys[j] = child.keys[j + t];
        }


        // move child pointers if it is not a leaf
        if(!child.leaf){
            for(int j = 0; j < t; j++){
                newChild.children[j] = child.children[j + t];
            }
        }

        parent.children[i + 1] = newChild;  // Link new child
        child.numKeys = t - 1;
        newChild.numKeys = t - 1;
        parent.numKeys++;

    }

    // Delete a key from the B-Tree
    public void delete(int key){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }

        deleteRec(root, key);
        if(root.numKeys == 0){
            root = root.leaf ? null : root.children[0];
        }

    }

    private void deleteRec(BtreeNode node, int key) {
        int idx = 0;
        while (idx < node.numKeys && node.keys[idx] < key){
            idx++;
        }

        if(idx < node.numKeys && node.keys[idx] == key){
            if(node.leaf){
                removeFromLeaf(node, idx);
            }else {
                removeFromInternal(node, idx);
            }
        }else {
            if(node.leaf){
                return;
            }

            boolean lastChild = (idx == node.numKeys);
            if(node.children[idx].numKeys < t){
                fill(node, idx);
            }
            deleteRec((lastChild && idx > node.numKeys) ? node.children[idx - 1] : node.children[idx], key);
        }
    }

    public void fill(BtreeNode node, int idx){
        if(idx != 0 && node.children[idx - 1].numKeys >= t){
            borrowFromPrev(node, idx);
        }else if(idx != node.numKeys && node.children[idx + 1].numKeys >= t){
            borrowFromNext(node, idx);
        }else {
            if(idx != node.numKeys){
                merge(node, idx);
            }else {
                merge(node, idx - 1);
            }
        }

    }


    private void borrowFromPrev(BtreeNode node, int idx) {
        BtreeNode child = node.children[idx];
        BtreeNode sibling = node.children[idx - 1];

        for(int i = child.numKeys - 1; i >= 0; i--){
            child.keys[i + 1] = child.keys[i];
        }

        if(!child.leaf){
            for(int i = child.numKeys; i >= 0; i--){
                child.children[i + 1] = child.children[i];
            }
        }

        child.keys[0] = node.keys[idx - 1];
        if(!child.leaf){
            child.children[0] = sibling.children[sibling.numKeys];
        }

        node.keys[idx - 1] = sibling.keys[sibling.numKeys - 1];
        child.numKeys++;
        sibling.numKeys--;
    }

    private void borrowFromNext(BtreeNode node, int idx) {

        BtreeNode child = node.children[idx];
        BtreeNode sibling = node.children[idx + 1];

        child.keys[child.numKeys] = node.keys[idx];

        if(!child.leaf){
            child.children[child.numKeys + 1] = sibling.children[0];
        }

        node.keys[idx] = sibling.keys[0];

        for(int i = 1; i < sibling.numKeys; i++){
            sibling.keys[i - 1] = sibling.keys[i];
        }

        if(!sibling.leaf){
            for(int i = 1; i <= sibling.numKeys; i++){
                sibling.children[i - 1] = sibling.children[i];

            }
        }

        child.numKeys++;
        sibling.numKeys--;

    }



    private void merge(BtreeNode node, int idx){

        BtreeNode child = node.children[idx];
        BtreeNode sibling = node.children[idx + 1];

        child.keys[t - 1] = node.keys[idx];

        for(int i = 0; i < sibling.numKeys; i++){
            child.keys[i + t] = sibling.keys[i];
        }

        if(!child.leaf){
            for(int i = 0; i <= node.numKeys; i++){
                child.children[i + t] = sibling.children[i];
            }
        }

        for(int i = idx + 1; i < node.numKeys; i++){
            node.keys[i - 1] = node.keys[i];
        }

        for(int i = idx + 1; i <= node.numKeys; i++){
            node.children[i - 1] = node.children[i];
        }

        child.numKeys += sibling.numKeys + 1;
        node.numKeys--;

        if(node.numKeys == 0 && node == root){
            root = child;
        }

    }

    private void removeFromLeaf(BtreeNode node, int idx) {
        for(int i = idx; i < node.numKeys - 1; i++){
            node.keys[i] = node.keys[i + 1];
        }
        node.numKeys--;
    }

    private void removeFromInternal(BtreeNode node, int idx) {
        int key = node.keys[idx];
        if(node.children[idx].numKeys >= t){
            int pred = getPredecessor(node, idx);
            node.keys[idx] = pred;
            deleteRec(node.children[idx], pred);

        } else if (node.children[idx + 1].numKeys >= t) {
            int succ = getSuccessor(node, idx);
            node.keys[idx] = succ;
            deleteRec(node.children[idx + 1], succ);

        }else {
            merge(node, idx);
            deleteRec(node.children[idx], key);
        }

    }

    private int getPredecessor(BtreeNode node, int idx) {
        BtreeNode cur = node.children[idx];

        while (!cur.leaf){
            cur = cur.children[cur.numKeys];
        }

        return cur.keys[cur.numKeys - 1];
    }

    private int getSuccessor(BtreeNode node, int idx) {
        BtreeNode cur = node.children[idx + 1];

        while (!cur.leaf){
            cur = cur.children[0];

        }

        return cur.keys[0];
    }

//    public void inOrder(BtreeNode node){
//        int i;
//        for(i = 0; i < node.numKeys; i++){
//            if(!node.leaf){
//                inOrderRec(node.children[i]);
//            }
//            System.out.print(node.keys[i] + " ");
//        }
//
//        if(!node.leaf){
//
//            inOrderRec(node.children[i]);
//        }
//
//    }

    private void inOrderRec(BtreeNode node) {
        int i;
        for(i = 0; i < node.numKeys; i++){
            if(!node.leaf){
                inOrderRec(node.children[i]);
            }

            System.out.print(node.keys[i] + " ");
        }

        if(!node.leaf){
            inOrderRec(node.children[i]);

        }
    }

    public void inOrder(){
        if(root != null){
            inOrderRec(root);
        }
    }

    public static void main(String[] args) {

        Btree tree = new Btree(2); // B-Tree of order 2


        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(6);
        tree.insert(12);
        tree.insert(30);
        tree.insert(7);
        tree.insert(17);

        System.out.println("In-order transversal of B-Tree:");
        tree.inOrder();

        int searchKey = 6;
        System.out.println("\nSearching for " + searchKey + ": " + (tree.search(searchKey) != null));

        searchKey = 15;
        System.out.println("\nSearching for " + searchKey + ": " + (tree.search(searchKey) != null));


        System.out.println("\nDeleting 6...");
        tree.delete(6);
        tree.inOrder();

        System.out.println("\nDeleting 13 (Not Present)...");
        tree.delete(13);
        tree.inOrder();


    }


}
