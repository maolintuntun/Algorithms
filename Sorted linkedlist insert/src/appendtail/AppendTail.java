package appendtail;

class Test{
	public static void main(String[] args){
		int array[] = {1,2,5,7,9};
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
		//ListNode head = null;
		AppendTail sol = new AppendTail();
		ListNode c = sol.addtail(head, 2);
		while( c != null ){
			System.out.print(c.value + " ");
			c = c.next;
			
		  }
		}
	
}

class ListNode{
	public ListNode(int x){  // don't forget public
		value = x;          //write mistake: x = value; **Understand the pass value from outside
	}
	int value;
	ListNode next;
}

public class AppendTail{
	public ListNode addtail(ListNode head, int value){ //don't forget public
		if(head == null){
			return new ListNode(value);
		}
		ListNode cur = head;
		while(cur.next != null){   // why not cur!=null? where does the pointer stop? watch out the stop condition
			cur = cur.next;       // in while loop. As it will go on 1 more step after 括号中的停止条件。
		}
		cur.next = new ListNode(value);
		return head;
		
	}

}
