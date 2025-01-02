import java.util.Stack;

public class OnlineStockSpan {
    class StockSpanner {
    Stack<int[]> st ; 
    int index ;

    public StockSpanner() {
        st = new Stack<>(); 
        index = 0; 
    }
    
    public int next(int price) {
        while(!st.isEmpty() && price >= st.peek()[0]){
            st.pop();
        }
        int span = st.isEmpty() ? index + 1 : index - st.peek()[1];
        st.push(new int[]{price , index}); 
        index ++; 
        return span ; 
    }
}
}

// leetcode 901 
