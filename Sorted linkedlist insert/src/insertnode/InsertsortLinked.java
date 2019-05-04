package insertnode;

class Test {          //д������Ի��˺ܾ�
	public static void main(String[] args){
		int[] array = {2,4,6,8,10};   //������취��������ķ�ʽֵ�ü���
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur  = cur.next;
		}
		InsertsortLinked sol = new InsertsortLinked();
		ListNode newhead = sol.insert(head, 11); //why define this "newhead" instead of 
		cur = newhead;                            //write cur = head? because head has 
		                            //been changed,we need a bowl to receive the result(a head node) returned from below
		
		while(cur != null){            //Notice how to print a Linkedlist ! not "print��head��"
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		
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

public class InsertsortLinked {
	public ListNode insert(ListNode head, int value) { //method name type?Сд��ͷ��ÿ����������ĸ��д���շ�����
		ListNode newNode = new ListNode(value);
		//1.determine if the inserted node is before head.
		if (head == null || head.value >= value){
			newNode.next = head;
			return newNode;
		}
		// 2. insert the new node to the right position.
		// using the previous node to traverse the linked list
		// the insert position of the new node between prev and prev.next
		ListNode prev = head;
		while(prev.next != null && prev.next.value < value){
			prev = prev.next;
			
		}
		 newNode.next = prev.next;
		 prev.next = newNode;
		 return head;
		}
	}

