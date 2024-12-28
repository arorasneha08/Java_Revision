import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousGreaterElem {
    public static List<Integer> previousGreat(int arr[], int n){
        Stack<Integer> st = new Stack<>(); 
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n ; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop(); 
            }
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek()); 
            }
            st.push(arr[i]); 
        }
        return ans ; 
    }
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length; 
        List<Integer> ans = previousGreat(arr, n); 
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
