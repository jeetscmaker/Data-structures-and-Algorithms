package tree;

/**
 * This class consists of binary tree traversal algorithms such as
 * preorder, inorder, postorder traversals to name a few.
 *
 * @author Jitendra
 */
public class BinaryTreeTraversal {
    /* A recursive preorder traversal algorithm for a binary tree. */
    public void preorder(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    /* A recursive inorder traversal algorithm for a binary tree. */
    public void inorder(BinaryTreeNode root) {
        if (root == null)
            return;
        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }

    /* A recursive postorder traversal algorithm for a binary tree. */
    public void postorder(BinaryTreeNode root) {
        if (root == null)
            return;
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data);
    }
}
