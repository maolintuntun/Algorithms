package issymmetric;
//�ж�һ�ö������ǲ��ǶԳ�������Ҫ�����жϼ��������root�Ƿ�value���

public class isSymmetric {
	public boolean isSymmetric(TreeNode root){
		return isSymmetric(root, root);
	}
	private boolean isSymmetric(TreeNode a, TreeNode b){ //Ϊʲô������private
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
