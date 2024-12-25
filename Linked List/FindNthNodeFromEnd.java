public class FindNthNodeFromEnd {
    public static class Node{
        int data ; // value
        Node next ; // address of the next node 
        Node(int data){
            this.data = data ;
        }
    }
    public static void display(Node head){
        Node temp = head ; 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next ; 
        }
    }
    public static Node findNode(Node head, int m){
        int size = 0 ; 
        Node temp =head ; 
        while(temp != null){
            size ++ ; 
            temp = temp.next ; 
        }
        temp = head ; 
        int n = size - m + 1 ; 
        for(int i = 0 ; i < n-1 ; i++){
            temp = temp.next ; 
        }
        return temp;  
    }
    public int getKthFromLast(Node head, int k) {
            Node slow = head ; 
            Node fast = head;  
            for(int i = 1 ; i<=k ; i++){
                if(fast == null) return -1;
                fast = fast.next ;
            }
            while(fast!= null){
                fast = fast.next ;
                slow = slow.next ; 
            }
            return slow.data ; 
        }

    public static void main(String[] args) {
        Node a = new Node(5) ; 
        Node b = new Node(51) ; 
        Node c = new Node(53) ;  
        Node d = new Node(52) ; 
        Node e = new Node(95) ; 
        a.next = b ;
        b.next = c ;
        c.next = d ; 
        d.next = e ; 

        // calculate the 3 rd node from the last , we got the 4th element form the start ..

        Node temp = findNode(a, 3); 
        System.out.println(temp.data);
    }
}
