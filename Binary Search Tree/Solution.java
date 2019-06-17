package isBST;

//Time = n
//Space = h
class Solution {
	public boolean isBST(TreeNode root){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
    private boolean isBST(TreeNode root, int min, int max){
    	if(root == null){
    		return true;
    	}
    	return (root.value > min && root.value < max)&& isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
    }
	

}

class TreeNode{
	TreeNode right;
	TreeNode left;
	int value;
	public TreeNode(int v){
		value = v;
	}
}
