package traversal;

class InorderTraversal {
	public void inOrder(TreeNode root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.println(root.value);
		inOrder(root.right);
	}

}

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int v){
		value = v;
		
	}
}
