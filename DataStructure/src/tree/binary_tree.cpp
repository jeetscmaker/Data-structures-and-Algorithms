#include <bits/stdc++.h>
using namespace std;


class binary_tree
{
private:
	int data;
	binary_tree* left;
	binary_tree* right;
public:
	binary_tree() {}
	binary_tree(int d) {
		data = d;
		left = NULL;
		right = NULL;
	}
	int get_data(){
		return data;
	}
	binary_tree* get_left(){
		return left;
	}
	binary_tree* get_right(){
		return right;
	}
	void set_data(int d) {
		data = d;
	}
	void set_left(binary_tree* l){
		left = l;
	}
	void set_right(binary_tree* r){
		right = r;
	}
	void print_tree(binary_tree* root){
		if(root != NULL){
			// printing in pre-order traversal form by default.
			cout << root->get_data() << " ";
			print_tree(root->get_left());
			print_tree(root->get_right());
		}
	}
	void preOrder_traverse(binary_tree* root);
	void inOrder_traverse(binary_tree* root);
	void postOrder_traverse(binary_tree* root);
};

 void binary_tree :: preOrder_traverse(binary_tree* root) {
	if(root != NULL) {
		// print data, we can process this data as per our need.
		cout << root->get_data() << " ";
		preOrder_traverse(root->get_left());
		preOrder_traverse(root->get_right());
	}
}

void binary_tree :: inOrder_traverse(binary_tree* root) {
	if(root != NULL) {
		inOrder_traverse(root->get_left());
		// print data, we can process this data as per our need.
		cout << root->get_data() << " ";
		inOrder_traverse(root->get_right());
	}
}

void binary_tree :: postOrder_traverse(binary_tree* root) {
	if(root != NULL) {
		postOrder_traverse(root->get_left());
		postOrder_traverse(root->get_right());
		// print data, we can process this data as per our need.
		cout << root->get_data() << " ";
	}
}

binary_tree* search_in_BST(int key, binary_tree* root);
binary_tree* insert_in_BST(int key, binary_tree* root);
bool is_same_binaryTree(binary_tree* root1, binary_tree root2);

int main() {
	binary_tree t1(10);
	binary_tree t2(7);
	binary_tree t3(3);
	binary_tree t4(15);
	binary_tree t5(8);
	binary_tree t6(23);
	binary_tree t7(45);

	t1.set_left(&t2);
	t1.set_right(&t3);
	t2.set_left(&t4);
	t2.set_right(&t5);
	t3.set_left(&t6);
	t3.set_right(&t7);
	
	cout << "preOrder traversal: ";
	t1.preOrder_traverse(&t1);
	cout << "\n";

	cout << "inorder travaersal: ";
	t1.inOrder_traverse(&t1);
	cout << "\n";

	cout << "postOrder traversal: ";
	t1.postOrder_traverse(&t1);

	return 0;
}
/**
 * This function returns the node whose data is equal to the given key.
 * If there is no such data in the tree, the function returns a NULL pointer.
 * */
binary_tree* search_in_BST(int key, binary_tree* root) {
	if(root == NULL)
		return NULL;
	if(root->get_data() == key)
		return root;
	else if(root->get_data() < key) 
		return search_in_BST(key, root->get_right());
	else
		return search_in_BST(key, root->get_left());
}

/**
 * This function inserts a node(key) in a Binary Search Tree.
 * */
binary_tree* insert_in_BST(int key, binary_tree* root) {
	binary_tree newNode(key);
	if(root == NULL)
		return newNode;
	binary_tree* current = root, parent = NULL;
	while(current != NULL){
		parent = current;
		if(key >= current->get_data())
			current = current->get_right();
		else
			current = current->get_left();
	}
	if(key >= parent->get_data())
		parent->set_right(newNode);
	else
		parent->set_left(newNode);
	return root;
}

/**
 * If the two binary trees (denoted by their root nodes root1 and root2 respectively)
 * are exactly the same, this function returns true, else it returns false;
 * */
bool is_same_binaryTree(binary_tree* root1, binary_tree root2) {
	if(root1 == NULL && root2 == NULL)
		return true;
	if(root1 == NULL || root2 == NULL)
		return false;
	return (root1->get_data() == root2->get_data())
			&&	is_same_binaryTree(root1->get_left(), root2->get_left())
			&&	is_same_binaryTree(root1->get_right(), root2->get_right());
}
