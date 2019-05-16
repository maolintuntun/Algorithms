package length;


class Teest{
	public static void main(String[] args){
		int[] array = { 2,3,4,5,5,5,5,};
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
		length sol = new length();
		int result = sol.getlength(head);
		System.out.print(result);
		
		
	}
}

class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value = value;
		next = null;
	}
}

public class length {  //class name not standard
	public int getlength(ListNode head){
		int linkedlistSize = 0;
		ListNode curr = head;
		while (curr != null){
			curr = curr.next;
			linkedlistSize++;
		}
		return linkedlistSize;
	}


}


