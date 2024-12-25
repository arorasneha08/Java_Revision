// import java.util.Stack;

// public class MinStack {
//     class MinStack {

//     Stack<Long> st ; 
//     public MinStack() {
//         st = new Stack<>() ; 
//     }
//     private long min = 0 ; 
    
//     public void push(int x) {
//         long val = (long) x; 
//         if(st.isEmpty()){
//             st.push(val) ;
//             min = val ;
//         }
//         else{
//             if(val < min){
//                 st.push(2 * val - min); 
//                 min = val ; 
//             }
//             else{
//                 st.push(val); 
//             }
//         }
//     }
    
//     public void pop() {
//         if(st.isEmpty()) return ; 
//         long top = st.peek() ; 
//         if(top < min){
//             min = 2 * min - top ;
//         }
//         st.pop(); 
//     }
    
//     public int top() {
//         if(st.isEmpty()) return -1; 
//         long top = st.peek() ;
//         if(top < min){
//             return (int)min ; 
//         }
//         else{
//             return (int) top ; 
//         }
//     }
    
//     public int getMin() {
//         return (int)min ; 
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */
// }

// // leetcode 155 