package tree;

/**
 * Java program to demonstrate insert operation in binary search tree
 * Technically there is no difference between BinarySearchTreeNode and BinarySearchTree classes,
 * but still the BinarySearchTree was created to demonstrate that the "insert()" makes a difference.
 * The insertion operation makes a BSTNode totally a BST because the nodes follow the protocol of a BST.
 */
public class BinarySearchTree extends BinarySearchTreeNode {
    BinarySearchTreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRecursion(root, key);
    }

    /* A recursive function to insert a new key in BST */
    BinarySearchTreeNode insertRecursion(BinarySearchTreeNode root, int key) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new BinarySearchTreeNode(key);
            return root;
        }
        /* Otherwise, recur down the tree */
        if (key < root.getData())
            root.setLeft(insertRecursion(root.getLeft(), key));
        else if (key > root.getData())
            root.setRight(insertRecursion(root.getRight(), key));
        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(BinarySearchTreeNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getData());
            inorderRec(root.getRight());
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
		/* Let us create following BST
		  50
		/	 \ 
	  30	 70
	 / \     / \
	20 40    60 80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}