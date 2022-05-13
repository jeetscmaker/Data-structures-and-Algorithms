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

	}
	void preOrder_traverse(binary_tree* root);
	void inorder_traverse(binary_tree* root);
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
	
	t1.preOrder_traverse(&t1);
	return 0;
}