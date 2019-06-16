package countnode;

class CountNode {
	public int countNode(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + countNode(root.left) + countNode(root.right);
		
	}
	
}

class TreeNode{
	TreeNode left;
	TreeNode right;
	int v;
	public TreeNode(int value){
		v = value;
	}
}
