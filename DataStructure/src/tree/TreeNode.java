package tree;
/**
* Fundamental data structure for n-ary tree.
* 
* @author Jitendra
*/
public class TreeNode{
  private int data;
  private TreeNode firstChild;
  private TreeNode nextSibling;
  
  public TreeNode(int data){
    this.data = data;
    firstChild = null;
    nextSibling = null;
  }
  
  public TreeNode(){
    data = 0;
    firstChild = null;
    nextSibling = null;
  }
  
  public int getData(){
    return data;
  }
  
  public void setData(int data){
    this.data = data;
  }
  
  public TreeNode getFirstChild(){
    return firstChild;
  }
  
  public void setFirstChild(TreeNode node){
    this.firstChild = node;
  }
  
  public TreeNode getNextSibling(){
    return nextSibling;
  }
  
  public void setNextSibling(TreeNode node){
    this.nextSibling = node;
  }
}
