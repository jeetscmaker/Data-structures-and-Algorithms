package tree;

/** 
* @author Jitendra
*
* The fundamental data structure for a binary search tree.
*/
public class BinarySearchTreeNode{
	private int data;
	private BinarySearchTreeNode left;
	private BinarySearchTreeNode right;
	
	public int getData(){
		return data;	
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public BinarySearchTreeNode getLeft(){
		return left;
	}
	
	public void setLeft(BinarySearchTreeNode left){
		this.left = left;
	}
	
	public BinarySearchTreeNode getRight(){
		return right;
	}
	
	public void setRight(BinarySearchTreeNode right){
		this.right = right;
	}
	/*Finding an element in BST using recursion. */
	public BinarySearchTreeNode find(BinarySearchTreeNode root, int data){
	  if (root == null) return null;
	  if (root.getData() == data) 
	    return root;
	  else if (root.getData() > data) 
	    return find(root.getLeft(), data);
	  else if(root.getData() < data)
	    return find(root.getRight(), data);
	  return null;
	}
	
	/*Find an element in BST using iterative method*/
	public BinarySearchTreeNode find_iter(BinarySearchTreeNode root, int data){
	  if(root == null) return null;
	  while(root != null){
	    if(root.getData() == data) return root;
	    if (root.getData() > data) root = root.getLeft();
	    else root = root.getRight();
	  }
	  return null;
	}
	/* Find the maximum element in BST.*/
	public BinarySearchTreeNode findMax(BinarySearchTreeNode root){
	  if (root == null) return null;
	  while (root.getRight() != null)
	    root = root.getRight();
	  return root;
	}
	
	/* Find the minimum element in BST.*/
	public BinarySearchTreeNode findMin(BinarySearchTreeNode root){
	  if (root == null) return null;
	  while (root.getLeft() != null)
	    root = root.getLeft();
	  return root;
	}
}
