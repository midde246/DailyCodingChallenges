package day7;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

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

public class MergeTwoSortedLists {
	public static void main(String[] args) {
//		l1 : 1->2->4, l2 : 1->3->4
		ListNode fl1 = new ListNode(4);
		ListNode fl2 = new ListNode(2, fl1);
		ListNode l1 = new ListNode(1, fl2);
		
		ListNode sl3 = new ListNode(4);
		ListNode sl2 = new ListNode(3, sl3);
		ListNode l2 = new ListNode(1, sl2);
		
		ListNode ln = mergeTwoLists(l1, l2);

		while(ln != null) {
			System.out.println(ln.val);
			ln = ln.next;
		} 
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newListNode = new ListNode();
		ListNode result = newListNode;
		while (l1 != null && l2 != null) { 
			if (l1.val < l2.val) {
				newListNode.next = l1;
				l1 = l1.next;
			} else {
				newListNode.next = l2;
				l2 = l2.next;
			}
			newListNode = newListNode.next;
		}

		if (l1 != null || l2 != null) {
			newListNode.next = l1 == null ? l2 : l1;
		}

		return result.next;
	}
}
