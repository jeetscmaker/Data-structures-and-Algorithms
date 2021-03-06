package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    /* A recursive inorder traversal algorithm for a binary tree. */
    public void inorder(BinaryTreeNode root) {
        if (root == null)
            return;
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    /* A recursive postorder traversal algorithm for a binary tree. */
    public void postorder(BinaryTreeNode root) {
        if (root == null)
            return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }

    /* Level Order Traversal of the binary tree. */
    public void levelOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        Stack<BinaryTreeNode> s = new Stack<>();
        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            System.out.print(temp.getData() + " ");
            if (temp.right != null)
                s.push(temp.right);
            if (temp.left != null)
                s.push(temp.left);
            while (!s.isEmpty()) {
                q.add(s.pop());
            }
        }
        System.out.println("\n Level Order traversal complete.");
    }

    /* Find the height or depth of a tree. */
    public int height(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;
    }

    /**
     * Find the diameter of a tree.
     * The diameter of a tree is the longest path between any two leaf nodes.
     */
    public int diameterOfTree(BinaryTreeNode root) {
        //TODO
        return 0;
    }

    /* Find the sum of all the elements of n-ary tree */
    public int findSum(TreeNode root) {
        if (root == null)
            return 0;
        return root.getData()
                + findSum(root.getFirstChild())
                + findSum(root.getNextSibling());
    }

    /* Given two n-ary trees. Find whether the two are isomorphic or not.*/

    /**
     * Two trees are called isomorphic if both have identical structure. The
     * values of individual nodes can be different but the structure should be identical.
     */
    public int isomorphicTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return 1;
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return 0;
        return isomorphicTree(root1.getFirstChild(), root2.getFirstChild())
                &
                isomorphicTree(root1.getNextSibling(), root2.getNextSibling());
    }
}
