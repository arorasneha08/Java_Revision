import java.util.ArrayList;

public class PrintSubsequences {
    public static void Subsequences(int arr[] , int index , int n , ArrayList<Integer> ans){
        if(index == n){
            for(int num : ans){
                System.out.print(num + " ");
            }
            if(ans.size() == 0) {
                System.out.print("{}");
            }
            System.out.println();
            return ; 
        }
        ans.add(arr[index]);
        Subsequences(arr, index+1, n, ans);
        ans.remove(ans.size()- 1);  
        Subsequences(arr, index+1, n, ans);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = 3 ; 
        ArrayList<Integer> ans = new ArrayList<>(); 
        Subsequences(arr, 0, n, ans);
    }
}
