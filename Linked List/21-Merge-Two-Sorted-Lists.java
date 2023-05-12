/*
21. Merge Two Sorted Lists
Link: https://leetcode.com/problems/merge-two-sorted-lists/
Code by: Sam Lu
Language: Java
Time Complexity: O(n + m)
Space Complexity: O(n + m)
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ans = null;
        ListNode curr = null;
        if (list1.val < list2.val) {
            ans = curr = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            ans = curr = new ListNode(list2.val);
            list2 = list2.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }
        while (list1 != null) {
            curr.next = new ListNode(list1.val);
            list1 = list1.next;
            curr = curr.next;
        }
        while (list2 != null) {
            curr.next = new ListNode(list2.val);
            list2 = list2.next;
            curr = curr.next;
        }
        return ans;
    }
}