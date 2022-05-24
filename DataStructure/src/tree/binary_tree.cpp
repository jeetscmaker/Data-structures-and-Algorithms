#include <bits/stdc++.h>
using namespace std;
/*
              10         preorder:   10 7 15 8 3 23 45
             /  \        inorder :   15 7 8 10 23 3 45
            7    3       postorder:  15 8 7 23 45 3 10
           / \  / \      levelOrder: 10 7 3 15 8 23 45
          15  8 23 45 
*/
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
	void levelOrder_traverse(binary_tree* root);
	int size(binary_tree* root);
	int height(binary_tree* root);
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

void binary_tree :: levelOrder_traverse(binary_tree* root) {
	queue<binary_tree*> q;
	if(root != NULL) {
		q.push(root);
		while(!q.empty()) {
			binary_tree* top = q.front();
			cout << top->get_data() << " ";
			q.pop();
			if(top->get_left() != NULL)
				q.push(top->get_left());
			if(top->get_right() != NULL)
				q.push(top->get_right());
		}
	}
}

int binary_tree :: size(binary_tree* root) {
	if(root == NULL)
		return 0;
	int left_size = size(root->get_left());
	int right_size = size(root->get_right());
	return left_size + right_size + 1;
}
/**
 * The height of a binary tree is the maximum of the longest path on its left side
 * and its right side + 1(for root node).
 * */
int binary_tree :: height(binary_tree* root) {
	if(root == NULL)
		return 0;
	int left_height = height(root->get_left());
	int right_height = height(root->get_right());
	return 1 + max(left_height, right_height);
}

binary_tree* search_in_BST(int key, binary_tree* root);
binary_tree* insert_in_BST(int key, binary_tree* root);
bool is_same_binaryTree(binary_tree* root1, binary_tree root2);
bool root_to_leaf_sum(binary_tree* root, int sum, std::vector<int> v);
bool is_BST(binary_tree* root, int MIN, int MAX);

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
	
	cout << "level order traversal: ";
	t1.levelOrder_traverse(&t1);

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
		root = &newNode;
	binary_tree* current = root;
	binary_tree* parent = NULL;
	while(current != NULL){
		parent = current;
		if(key >= current->get_data())
			current = current->get_right();
		else
			current = current->get_left();
	}
	if(key >= parent->get_data())
		parent->set_right(&newNode);
	else
		parent->set_left(&newNode);
	return root;
}

/**
 * If the two binary trees (denoted by their root nodes root1 and root2 respectively)
 * are exactly the same, this function returns true, else it returns false;
 * */
bool is_same_binaryTree(binary_tree* root1, binary_tree* root2) {
	if(root1 == NULL && root2 == NULL)
		return true;
	if(root1 == NULL || root2 == NULL)
		return false;
	return (root1->get_data() == root2->get_data())
			&&	is_same_binaryTree(root1->get_left(), root2->get_left())
			&&	is_same_binaryTree(root1->get_right(), root2->get_right());
}

/**
 * Given a sum. Find whether there is a path from the root node to ANY LEAF
 * node such that the sum of elements in that path is equal to the given sum.
 * */
bool root_to_leaf_sum(binary_tree* root, int sum, std::vector<int> v) {
	if(root == NULL)
		return false;
	// check for leaf node
	if(root->get_left() ==  NULL && root->get_right() == NULL) {
		if(root->get_data() == sum) {
			v.push_back(root->get_data());
			return true;
		}
		else
			return false;
	}
	if(root_to_leaf_sum(root->get_left(), sum - root->get_data(), v)) {
		v.push_back(root->get_data());
		return true;
	}

	if(root_to_leaf_sum(root->get_right(), sum - root->get_data(), v)) {
		v.push_back(root->get_data());
		return true;
	}

	return false;
}

/**
 * Given the root of a binary tree. Find out whether it is a binary 
 * search tree or not. Starting values for MIN is INT_MIN and MAX is INT_MAX.
 * */
bool is_BST(binary_tree* root, int MIN, int MAX) {
	if(root == NULL)
		return true;
	if(root->get_data() < MIN || root->get_data() > MAX)
		return false;
	return is_BST(root->get_left(), MIN, root->get_data()) 
		 && is_BST(root->get_right(), root->get_data(), MAX);
}