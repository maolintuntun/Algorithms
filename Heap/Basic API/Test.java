
// Heap is like a complete binary tree, the top is the smallest. become bigger when going down
// Priority Queue: The smallest leave fist! it is not who come first, who leave first. 
// Maximum priority queue: Who bigger who leave first

package basicAPI;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test{
	 public static void main(String[] args){
		 //If want to output the biggest first,use this :
		 //Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		 //Collections is a class in Java, reverseOrder will reverse the original sequence,is a static member method of it
		 Queue<Integer> pq = new PriorityQueue<>();
		 // six API
		 // 1. offer logn  Add an element
		 //        offer() is swap 1 by 1 from bottom to top,operate logn times(total n numbers in heap)
		 // 2. poll  logn  Take an smallest element out then return 
		 //        as top go out, the bottom most right swap to top.also 1by1.also logn times
		 // 3. peek  O1 peek the smallest and return the element but not take out
		 // 4. size
		 // 5. isEmpty return a boolean
		 // 6. remove
		 
		 pq.offer(7);
		 pq.offer(3);
		 
		 // this writing is wrong, node can't compare value big small
		 //so we should tell java how to compare--- comparator. see below
		 pq.offer(new Node(3));
		 
		 
	
	 }
}

class Node{
	int value;
	public Node(int v){
		value = v;
	}
}


// we need input 2 nodes, return 1 int 
class NodeComparator implements Comparator<Node>{
	public int compare(Node o1, Node o2){
		//if you want o1 to be before o2(o1 smaller and give us o1),return a negative number
		//if you want o1 to be after o2,return a positive number
		//if order of 1 and 2 are equal,return 0
		
		//if you want to output the biggest one, return 1 in first if, return -1 in second if
		if(o1.value < o2.value){
			return -1;
		}else if(o1.value > o2.value){
			return 1;
		}else{
		return 0;
	 }
	}
}


// Then line23 should change into 
// Queue<Node> pq = new PriorityQueue<>(new NodeComparator());
