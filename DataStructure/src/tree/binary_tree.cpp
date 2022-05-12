#include <bits/stdc++.h>
using namespace std;


class binary_tree
{
private:
	int data;
	bool data_assigned = false;
	binary_tree* left;
	binary_tree* right;
public:
	binary_tree() {
		data_assigned = false;
	}
	binary_tree(int d) {
		data = d;
		data_assigned = true;
		left = NULL;
		right = NULL;
	}
	~binary_tree(){
		data = INT_MIN;
		data_assigned = false;
		delete left;
		delete right;
	}
	bool is_data_assigned() {
		return data_assigned;
	}
	int get_data(){
		return data;
	}
	binary_tree* get_left(){
		return this->left;
	}
	binary_tree* get_right(){
		return this->right;
	}
	void set_data(int d) {
		data = d;
	}
	void set_left(binary_tree* left){
		this->left = left;
	}
	void set_right(binary_tree* right){
		this->right = right;
	}
	void print_tree(binary_tree* root){

	}
	void preOrder_traverse(binary_tree* root);
	void inorder_traverse(binary_tree* root);
	void postOrder_traverse(binary_tree* root);
};

 void binary_tree :: preOrder_traverse(binary_tree* root) {
	if(root->is_data_assigned()) {
		// print data, we can process this data as per our need.
		cout << this->get_data() << " ";
		preOrder_traverse(root->get_left());
		preOrder_traverse(root->get_right());
	}
}

int main() {
	binary_tree tree(10);
	return 0;
}