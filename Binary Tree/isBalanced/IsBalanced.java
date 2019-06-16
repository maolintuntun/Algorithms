package isbalanced;

public class IsBalanced {
	/*public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		int leftHeight = getHeight(root.left);//时间复杂度太高了 重复计算高度 需要换一个精妙的方法！
		int rightHeight = getHeight(root.right);
		return isBalanced(root.left) && isBalanced(root.right) && Math.abs(leftHeight-rightHeight)<=1;
	}
	
	public int getHeight(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	
    	int result = 1+ Math.max(getHeight(root.left), getHeight(root.right));
    	return result;
    }*/
	
	
	//非常好的办法 解决了一个函数只能返回一个值的问题
	//If unbalanced, return -1
	//If balanced,return height(>=0)
	public int isBalancedOrHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int l = isBalancedOrHeight(root.left);
		int r = isBalancedOrHeight(root.right);
		if(l < 0 || r < 0){
			return -1;
		}else if( Math.abs(r - l) > 1){
			return -1;
		}else{
			//balanced
			return 1 + Math.max(l, r);
		}
	}
	
	//Time:O n 每个node遍历一遍，每次只要O1
	//Space:O height.
	
	

}

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int v){
		value = v;
	}
}