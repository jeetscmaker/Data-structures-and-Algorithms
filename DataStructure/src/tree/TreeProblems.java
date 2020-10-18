package tree;

import java.util.HashMap;

public class TreeProblems {
    /* Give an algorithm for finding the vertical sums in a binary tree. */
    public static void vSum(HashMap<Integer, Integer> hash, BinaryTreeNode root, int c) {
        if (root.getLeft() != null)
            vSum(hash, root.getLeft(), c - 1);
        if (root.getRight() != null)
            vSum(hash, root.getRight(), c + 1);
        int data = 0;
        if (hash.containsKey(c))
            data = hash.get(c);
        hash.put(c, root.getData() + data);
    }

    public static void verticalSum(BinaryTreeNode root) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        vSum(hash, root, 0);
        System.out.println();
        for (int k : hash.keySet()) {
            System.out.println("key(pos): " + k + " sum: " + hash.get(k) + " ");

        }
    }

    /* Find the lowest common ancestor (LCA) of two given nodes in a tree.*/
    public static BinarySearchTreeNode lca(BinarySearchTreeNode root, BinarySearchTreeNode a, BinarySearchTreeNode b) {
        if (root == null) return null;
        if (root == a || root == b) return root;
        if (Math.max(a.getData(), b.getData()) < root.getData())
            return lca(root.getLeft(), a, b);
        else if (Math.min(a.getData(), b.getData()) > root.getData())
            return lca(root.getRight(), a, b);
        else
            return root;
    }

   /*Check if a given binary tree is a BST. */
   public static boolean isBST(BinarySearchTreeNode root, int min, int max) {
     if(root == null)
        return true;
     if(root.getData() < min || root.getData() > max)
        return false;
     return (isBST(root.getLeft(), min, root.getData()) && isBST(root.getRight(), root.getData(), max));
   }
}
