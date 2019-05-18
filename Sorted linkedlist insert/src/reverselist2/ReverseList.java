package reverselist2;
//use iterate method

class ListNode{
	public ListNode(int x){
		value = x;
	}
	int value;
	ListNode next; //next is a pointer or a reference,it store the next node's address
}

class Teeeest{
	public static void main(String[] args){
		int array[] = {1,2,3,4,5};
		ListNode head = new ListNode(array[0]);
		ListNode curr = head;
		for( int i = 1; i < array.length; i++){
			  curr.next = new ListNode(array[i]);
			  curr = curr.next;
			
		}
		 ReverseList sol = new ReverseList();
		 ListNode newhead = sol.reverse(head);
		 ListNode c = newhead;
		 while( c != null ){
			 System.out.print(c.value);
			 c = c.next;
		 }
		
	}
}


public class ReverseList {
	public ListNode reverse(ListNode head){
		if( head == null || head.next == null){
			return head;
		}
		ListNode cur = head;
		ListNode pre = null;
		while( cur != null ){              //important how to write this loop
			ListNode next = cur.next;
			cur.next = pre;
			
			pre = cur;
			cur = next;  // why not cur = cur.next?
			
		}
		return pre;
	}
	

}
