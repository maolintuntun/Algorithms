package reverselist;

class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value = value;
		next = null;
	}
}


class Test{
	public static void main(String[] args){
		int[] array = {1,2,3,4};
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
		
		ReverseLinked sol = new ReverseLinked();
		ListNode newhead = sol.reverse(head);
		cur = newhead;
		
		while(cur != null){
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		
	}
}
public class ReverseLinked{
	public ListNode reverse(ListNode head){
		
		if( head == null || head.next == null){
			return head;
		}
		ListNode newhead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}

}
