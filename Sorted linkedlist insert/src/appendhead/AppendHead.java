package appendhead;

class Test{
	public static void main(String[] args){
	    int array[] = { 1, 2, 5, 7};
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		
		for( int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		} 
		//ListNode head = null;
		AppendHead sol = new AppendHead();
		ListNode c = sol.append(head, 50);
		while( c != null ){
			System.out.print(c.value + " ");
			c = c.next;
		}
	}
}
class ListNode{
	public ListNode(int x){
		 value = x;
	}
	int value;
	ListNode next;
}


public class AppendHead {
	public ListNode append(ListNode head, int value){
		
		ListNode newhead = new ListNode(value);
		newhead.next = head;
		return newhead;
	}

}
