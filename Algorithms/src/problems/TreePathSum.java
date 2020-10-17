package problems;

public class TreePathSum{

/**
* Give an algorithm for checking the existence of path win given sum.
* For this problem, the strategy is subtract the mode value from The Sum before calling its children recur And chief at the sum is zero ar we run out of TreeNode 
*/
public boolean hasPathSum(TreeNode root, int sum){
  if (root == null) return false;
  if (root.left == null && root.right == null && root.data == sum)
    return true;
  else 
    return hasPathSum(root.left, sum – root.data) || hasPathSum(root.right, sum - root.data); 
}
/**
* Give an algorithm for converting a tree to its mirror.
*/
public BinaryTreeNode mirror(BinaryTreeNode root) {
    BinaryTreeNode temp;
    if(root != null) {
        mirror(root.left);
        mirror(root. right);
        // swapping the elements
        temp = root.left;
        root.left = root.right;
        root.right = temp;
      } 
      return root:
    }
}
