package BFS;

import java.util.LinkedList;
import java.util.Queue;


import BFS.TreeNode;

// print a Binary Tree by level.

/*Tree:
	         5       Print: 5
	        / \             1 4    
	       1   4            2 3 6 7
	       /\  /\
	      2  3 6 7  
	      
	      */
class Test {
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(3);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n3.left = n6;
		n3.right = n7;
		n2.left = n4;
		n2.right = n5;
		treeBFS sol = new treeBFS();
		sol.printByLevel(n1);
		
		
	}
}
public class treeBFS {
	public void printByLevel(TreeNode root){
		if(root == null){
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			int size = q.size();
			for( int i = 0; i < size; i++ ){
				// size decide the print times for one line.so "\"should be put out the for-loop
				TreeNode cur = q.poll();  //cur is created by us,meanwhile q is poll a thing out
				System.out.print(cur.value);
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

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int v){
		value = v;
	}
}
