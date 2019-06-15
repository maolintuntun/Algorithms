package getHeight;

class Solution {
    public int getHeight(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	
    	int result = 1+ Math.max(getHeight(root.left), getHeight(root.right));
    	return result;
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
