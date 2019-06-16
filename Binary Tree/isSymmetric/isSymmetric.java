package issymmetric;
//判断一棵二叉树是不是对称树。不要忘记判断假设的两个root是否value相等

public class isSymmetric {
	public boolean isSymmetric(TreeNode root){
		return isSymmetric(root, root);
	}
	private boolean isSymmetric(TreeNode a, TreeNode b){ //为什么这里是private
		if(a == null && b == null){
			return true;
		}
		if(a == null || b == null){
			return false;
		}
		if(a.value != b.value){
			return false;
		}
		return(isSymmetric(a.left, b.right)&&isSymmetric(a.right, b.left));
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
