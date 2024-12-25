public class ImplementUsingLL {
    class MyStack {
        class StackNode {
            int data;
            StackNode next;
            StackNode(int a) {
                data = a;
                next = null;
            }
        }
        StackNode top;
        int size = 0 ; 
    
        void push(int a) {
            StackNode temp = new StackNode(a); 
            temp.next = top ;
            top = temp ; 
            size ++ ; 
        }
    
        int pop() {
            if(size ==0) return -1; 
            StackNode temp = new StackNode(top.data);
            top = top.next ; 
            size -- ; 
            return temp.data; 
        }
    }
}
