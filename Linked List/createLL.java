public class createLL {
    public static class Node{
        int data ; // value
        Node next ; // address of the next node 
        Node(int data){
            this.data = data ;
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(5) ; 
        Node b = new Node(51) ; 
        Node c = new Node(53) ; 
        Node d = new Node(52) ; 
        Node e = new Node(95) ; 
        a.next = b ;
        b.next = c ;
        c.next = d; 
        d.next = e ; 
        // same memory address
        System.out.println(a.next);
        System.out.println(b);

        // accessign the value of the linked list 
        System.out.println(a.next.data);
        System.out.println(b.data);

    }
}