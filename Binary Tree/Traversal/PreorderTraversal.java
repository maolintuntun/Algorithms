package traversal;

class PreorderTraversal {
	
	public void traversal(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.value);
		traversal(root.left);
		traversal(root.right);
	}
}

