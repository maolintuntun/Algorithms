package smallestKelementfromUnsortedarray;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// find the smallest k element from an unsorted array.size is n.
// Max heap
public class Solution {
	public void smallestK(int[] array, int k){
		
	 Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	//create a k size heap. use the first k number, and compare the rest ones with the biggest in the heap.
	//If she is bigger than the top, then not consider,go next. If she is smaller,then swap(poll the old, offer the new) 
	//Pretend we are using heapify;
	//O(k)
	for(int i = 0; i < k; i++){
		maxHeap.offer(array[i]);
	}
	
	//(n-k)logk forloop Run n-k time, priority queue size is always K.
	for(int i = k; i < array.length; i++){
		if(array[i] < maxHeap.peek()){
			maxHeap.poll();
			maxHeap.offer(array[i]);
		}
	}
	 //remaining values in the maxHeap is the smallest k elements

  }
}

// Time: O(k + (n-k)log(k))
//Analyze: 1. k << n   O(nlogk)
//         2. k~= n/2  nlogn
 //        3. k~= n    n

//Space: O(k) 
 // Extra space is Maxheap 's size is k
 // it is a Priority queue after all

