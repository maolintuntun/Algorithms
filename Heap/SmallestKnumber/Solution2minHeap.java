package smallestKelementfromUnsortedarray;

import java.util.PriorityQueue;
import java.util.Queue;

//Heapify the whole array O(n)
//keep popping k times   O(klogn)


public class Solution2minHeap {
	public void smallestK2(int[] array,int k){
		// Constructor heapify the whole list only one time.easy!
		for(int x : array){ //add array into a list because constructor don't take array,only take collection.
			               // so put array in a collection. List is a subclass of collection!
			list.add(x);
		}
		Queue<Integer> pq = new PriorityQueue<>(list);//not pretend.it is true heapify
		// list is transfer to the constructor as input parameter
		for(int i = 0; i < k; i++){
			System.out.println(pq.poll());
		}
		
	}
	

}

//Time: O(n + klogn)
//Analyze: 1. k << n   O(n)
//         2. k~= n/2  nlogn
//         3. k~= n    nlogn

////Space: O(n) 
// Extra space is Minheap 's size is n