import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode list = new ListNode();
        Set<ListNode> visitedNodes = new HashSet<>();
       
        
        while(head!= null){
             if(visitedNodes.contains(head)){
            return true;
            }
            visitedNodes.add(head);
            head = head.next;
            }
            return false;
        }
    }

    


