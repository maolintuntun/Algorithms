package twistedisidentical;

class isIdentical {
	public boolean isIdentical(TreeNode a, TreeNode b){
		if(a == null && b == null){
			return true;
		}else if( a.value != b.value){
			return false;
		}else if(a == null || b == null){
			return false;
		}else{
			return (isIdentical(a.left, b.left)&&isIdentical(a.right, b.right))||(isIdentical(a.left, b.right)&&isIdentical(a.right, b.left));
		}
	}
	

}

class TreeNode{
	int value;
	TreeNode right;
	TreeNode left;
	public TreeNode(int v){
		value = v;
	}
}
