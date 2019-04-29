# Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## Leetcode solution:
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        
        if(l2==null){
            if(l1.val>=10){
                l2 = new ListNode(0);
                l2.next = null;
            }else{
                 return l1;
            }

        }

        int temp = l1.val+l2.val;
        l1.val = temp%10;
        if(temp>=10){
            if(l1.next==null){
                l1.next = new ListNode(1);
            }else{
                l1.next.val++;
            }
        }       

        l1.next = addTwoNumbers(l1.next,l2.next);

        return l1;
              
    }
}
```

## My not working solution:
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addend1 = 0;
        int addend2 = 0;
        int tens = 1;
        int sum = 0;
        
        // add digits of 1st linked list
        while (l1 != null) {
            addend1 = addend1 + l1.val * tens;
            tens = tens * 10; 
            l1 = l1.next;
        }
        
        tens = 1;
        // add digits of 2nd linked list
        while (l2 != null) {
            // add digits
            addend2 = addend2 + l2.val * tens;
            tens = tens * 10;
            l2 = l2.next;
        }     
        
        // sum of 2 linked lists
        sum = addend1 + addend2;
        
        String numberString = Integer.toString(sum);
        
        // fence post
        int num = Character.getNumericValue(numberString.charAt(numberString.length()-1));
        
        ListNode myListNode = new ListNode(num);
        ListNode currentNode = new ListNode(num);
        
        if (numberString.length() >= 1) {
            for (int i = numberString.length() - 2; i >= 0; i--){
                char c = numberString.charAt(i);      
                num = Character.getNumericValue(c);

                currentNode.next = new ListNode(num);
                myListNode.next = currentNode;
                currentNode = currentNode.next;
            }                    
        } 
        
        return myListNode;
    }
}
```
