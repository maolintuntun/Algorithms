
//将链表中对应index的这个元素拿出

package getindex;

class Teeest{
	public static void main(String[] args){
		int array[] = {5,6,3,5,5,32,42};
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
		int index = 9;
		GetIndex sol = new GetIndex();
		ListNode result = sol.get(head, index);
		System.out.print(result.value);
		
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

//***************************************************************************
public class GetIndex {
	public ListNode get(ListNode head, int index){
		while (index > 0 && head != null){    //****index =0 找到了这个元素 head == null 链表不够长 
			head = head.next;
			index--;
		}                      // index <= 0 (found) or head == null(list is not long enough)
	   return head;         //把找到的这个节点返回
	}
}
