package tree;

public class TestTree {
    public static void main(String[] args) {
        BinaryTreeNode A = TreeUtil.createBinaryTree();
        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        btt.preorder(A);
        System.out.println("\n =============================");
        btt.inorder(A);
        System.out.println("\n =============================");
        btt.postorder(A);
        System.out.println("\n =============================");
        btt.levelOrder(A);
        System.out.println("Height of the tree with root node A is " + btt.height(A));
        System.out.println("The diameter of tree is " + btt.diameterOfTree(A));
    }
}
