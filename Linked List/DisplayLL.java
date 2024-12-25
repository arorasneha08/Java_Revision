public class DisplayLL {
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
    public static void reverse(Node head){
        if(head == null) return ; 
        reverse(head.next);
        System.out.print(head.data + " ");
    }
    public static void displayrecur(Node head){
        if(head == null) return ; 
        System.out.print(head.data + " ");
        displayrecur(head.next);
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

        display(a);
        System.out.println();
        displayrecur(a); 
        System.out.println();
        reverse(a);
        // display(a);
    }
}
