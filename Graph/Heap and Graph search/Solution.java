package HeapandGraphSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Test {
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(5);
		TreeNode n4 = new TreeNode(7);
		TreeNode n5 = new TreeNode(9);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		Solution sol = new Solution();
		sol.printByLevel(n1);
		
		
	}
}



class TreeNode{
	public int value;
	public TreeNode left,right;
	public TreeNode(int v){
		value = v;
	}
}

class GraphNode{
	public int value;
	public List<GraphNode> nei = new ArrayList<>();
	public GraphNode(int v){
		value = v;
	}
}
public class Solution {
	public void printByLevel(TreeNode root){
		if(root == null) return;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()){ //每次需要判断是否为空的时候 就是另外一行开始的时候！
			int size = q.size();
			for(int i = 0;i < size; i++){
				TreeNode cur = q.poll();  // 吐出q里面的东西 这两部是放在for里面而不是while里面
				System.out.print(cur.value +" ");
				if(cur.left != null){
					q.offer(cur.left);
				}
				if(cur.right != null){
					q.offer(cur.right);
				}
			}
			System.out.println("");
		}
	}

}
