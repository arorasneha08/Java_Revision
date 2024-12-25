import java.util.Arrays;

public class SortSquaresIncreasing {
    public static void reverse(int arr[]){
        int n = arr.length ; 
        for(int i = 0; i < n/2 ; i++){
            int temp = arr[i] ;
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp ; 
        }
    }
    public static int[] sortSquares(int arr[] , int n){
        int left = 0 ;
        int right = n-1 ; 
        int ans[] = new int[arr.length] ; 
        int k = 0 ; 
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left] ;
                left ++ ; 
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right -- ;
            }
        }
        return ans ; 
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,5,6,7} ;
        int n = arr.length ; 
        int ans[] = sortSquares(arr, n); 
        reverse(ans); 
        System.out.println(Arrays.toString(ans));
    }
}
