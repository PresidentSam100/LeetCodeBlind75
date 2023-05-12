/*
206. Reverse Linked List
Link: https://leetcode.com/problems/reverse-linked-list/
Code by: Sam Lu
Language: Java
Iterative Solution:
Time Complexity: O(n)
Space Complexity: O(1)
Recursive Solution:
Time Complexity: O(n)
Space Complexity: O(n)
Note: This code answers the follow-up of coding both the iterative and recursive solution
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	// Iterative Solution
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
	/*
	// Recursive Solution
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        ListNode head_new = reverseList(next);
        head.next = null;
        next.next = head;
        return head_new;
    }
	*/
}