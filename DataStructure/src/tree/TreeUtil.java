package tree;
/**
 * A utility class for Tree Data structures.
 * */
public class TreeUtil {

    public static BinaryTreeNode createBinaryTree(){
        BinaryTreeNode A = new BinaryTreeNode(1); //                A(1)
        BinaryTreeNode B = new BinaryTreeNode(2); //              /     \
        BinaryTreeNode C = new BinaryTreeNode(3); //            B(2)     C(3)
        BinaryTreeNode D = new BinaryTreeNode(4); //          /     \   /     \
        BinaryTreeNode E = new BinaryTreeNode(5); //        D(4)  E(5) F(6)   G(7)
        BinaryTreeNode F = new BinaryTreeNode(6);
        BinaryTreeNode G = new BinaryTreeNode(7);
        A.setLeft(B);
        A.setRight(C);
        B.setLeft(D);
        B.setRight(E);
        C.setLeft(F);
        C.setRight(G);
        return A;
    }

}
