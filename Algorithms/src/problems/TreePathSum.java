/**
Give an algorithm for checking the existence of path win given sum.

For this problem, the strategy is subtract the mode value from The Sum before calling its children recur And chief at the sum is zero ar we run out of TreeNode 
*/
public class TreePathSum{
public boolean hasPathSum(TreeNode root, int sum){
  if (root == null) return false;
  if (root.left == null && root.right == null && root.data == sum)
    return true;
  else 
    return hasPathSum(root.left, sum – root.data) || hasPathSum(root.right, sum - root.data); 
}
}
