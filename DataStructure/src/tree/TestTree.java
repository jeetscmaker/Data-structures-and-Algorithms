package tree;

public class TestTree {
    public static void main(String[] args) {
        BinaryTreeNode A = new BinaryTreeNode(1);
        BinaryTreeNode B = new BinaryTreeNode(2);
        BinaryTreeNode C = new BinaryTreeNode(3);
        BinaryTreeNode D = new BinaryTreeNode(4);
        BinaryTreeNode E = new BinaryTreeNode(5);
        BinaryTreeNode F = new BinaryTreeNode(6);
        BinaryTreeNode G = new BinaryTreeNode(7);
        A.setLeft(B);
        A.setRight(C);
        B.setLeft(D);
        B.setRight(E);
        C.setLeft(F);
        C.setRight(G);

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
