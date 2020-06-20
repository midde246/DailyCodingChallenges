package day2;

import java.math.BigInteger;

// Definition for singly-linked list.
class ListNode {
	int val; // Items to be stored....
	ListNode next; // Refer to the next node of node type, default value null;

	ListNode() {
	}
	ListNode(int val) {
		this.val = val;
	}
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class AddTwoNumbers_LinkedList {

	public static void main(String[] args) {
		
//		(2 -> 4 -> 3) + (5 -> 6 -> 4)
		ListNode fl1 = new ListNode(9);
//		ListNode fl2 = new ListNode(4, fl1);
//		ListNode fl3 = new ListNode(2, fl1);
		
		ListNode sl1 = new ListNode(9);
		ListNode sl2 = new ListNode(9, sl1);
		ListNode sl3 = new ListNode(9, sl2);
		ListNode sl4 = new ListNode(9, sl3);
		ListNode sl5 = new ListNode(9, sl4);
		ListNode sl6 = new ListNode(9, sl5);
		ListNode sl7 = new ListNode(9, sl6);
		ListNode sl8 = new ListNode(9, sl7);
		ListNode sl9 = new ListNode(9, sl8);
		ListNode sl10 = new ListNode(1, sl9);
		
		ListNode ln = addTwoNumbers(fl1, sl10);
		
		while(ln != null) {
			System.out.println(ln.val);
			ln = ln.next;
		} 
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode tempResult = new ListNode();
		ListNode ln = tempResult;
		
		int car = 0;
		while(l1 != null || l2 != null) {
			int fNum  = l1 != null ? l1.val : 0;
			int sNum  = l2 != null ? l2.val : 0;
			int sum = fNum + sNum + car;
			car = sum / 10;
			tempResult.next = new ListNode(sum % 10);
			tempResult = tempResult.next;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(car > 0) {
			tempResult.next = new ListNode(car);
		}
		
		return ln.next;
	}

}
