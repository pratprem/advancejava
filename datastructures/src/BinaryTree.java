
public class BinaryTree {
TreeNode root;



public BinaryTree(){
	
}
public void add(int value){
	if (root == null){
		root = new TreeNode(value);
	}else{
		TreeNode num = root;
		boolean done = false;
		while(! done){
		if (value<num.value){
			if(num.left!=null) {
				num = num.left;
			}else{
				num.left = new TreeNode(value);
				done = true;
			
			}
		}
		else{
			if(num.right != null){
				num = num.right;
			}else{
				num.right = new TreeNode(value);
				done = true;
			}
		}
	}
}
}
public boolean contains(int value){
	TreeNode num = root;
	boolean done = false;
	
	while(! done){
		if (num==null){
			return false;
		}
		if(value == num.value){
			return true;
		}
		else if (value < num.value){
			num = num.left;
		}
		else{
			num = num.right;
		}
	}
	return false;
}
public void print(){
	print(root,0);
}
public void print(TreeNode node, int indent){
	if(node==null) return;
	for(int i = 0; i<indent; i++){
		System.out.print(" ");
	}
	System.out.println(node.value);
	print(node.left, indent+2);
	print(node.right,indent + 2);
}
}
