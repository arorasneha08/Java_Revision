public class LengthOfLL {
    class Solution {
        // Function to count nodes of a linked list.
        public int getCount(Node head) {
            int count = 0 ; 
            while(head != null){
                count ++ ; 
                head = head.next ; 
            }
            return count; 
        }
    }
}
