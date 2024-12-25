public class Sort012 {
    class Solution {
        static Node segregate(Node head) {
            
            Node zero = new Node(-1);
            Node one = new Node(-1);
            Node two = new Node(-1);
            
            Node zeroHead = zero ;
            Node oneHead = one ;
            Node twoHead = two ; 
            Node temp = head;
            
            while(temp != null){
                if(temp.data == 0){
                    zero.next = temp ;
                    zero = zero.next ; 
                }
                else if(temp.data == 1){
                    one.next = temp ;
                    one = one.next;
                }
                else{
                    two.next = temp;
                    two = two.next ;
                }
                temp = temp.next; 
            }
            two.next = null ;
            if(oneHead.next != null){
                zero.next = oneHead.next ;
            }
            else{
                zero.next = twoHead.next ; 
            }
            one.next = twoHead.next ; 
            return zeroHead.next ; 
        }
    }
}
