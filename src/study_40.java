import java.util.ArrayList;
import java.util.List;

public class study_40 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> vals = new ArrayList<Integer>();
            ListNode currentNode = head;
            while (currentNode != null) {
                vals.add(currentNode.val);
                currentNode = currentNode.next;
            }
            int left = 0;
            int right = vals.size() - 1;
            while (left < right) {
                if (vals.get(left) != (vals.get(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
