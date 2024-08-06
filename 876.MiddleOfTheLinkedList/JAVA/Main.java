
public class Main {
    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        ListNode middle = solution.middleNode(head);
        // Print the result starting from the middle node
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null) {
            size++;
            current = current.next;
        }

        ListNode middle = head;
        for(int i = 0; i < size/2; i++){
            middle = middle.next;
        }
        return middle; // Placeholder return statement
    }
}
