public class searchTargetInLL {
    class Solution {
        static boolean searchKey(int n, Node head, int key) {
            if(head == null) return false; 
            while(head != null){
                if(head.data == key) return true ; 
                head = head.next ; 
            }
            return false ; 
        }
    }
}
