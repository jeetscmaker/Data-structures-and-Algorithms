class binary_tree
{
private:
	int data;
	binary_tree left;
	binary_tree right;
public:
	binary_tree(int data) {
		this.data = data;
	}
	~binary_tree(){
		delete data;
		delete left;
		delete right;
	}
	binary_tree get_left(){
		return this.left;
	}
	binary_tree get_right(){
		return this.right;
	}
	void set_left(binary_tree left){
		this.left = left;
	}
	void set_right(binary_tree right){
		this.right = right;
	}
	void print_tree(binary_tree root){

	}
};

int main() {
	binary_tree tree(10);
	return 0;
}