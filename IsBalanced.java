package isbalanced;

public class IsBalanced {
	/*public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		int leftHeight = getHeight(root.left);//ʱ�临�Ӷ�̫���� �ظ�����߶� ��Ҫ��һ������ķ�����
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
	
	
	//�ǳ��õİ취 �����һ������ֻ�ܷ���һ��ֵ������
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
	
	//Time:O n ÿ��node����һ�飬ÿ��ֻҪO1
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