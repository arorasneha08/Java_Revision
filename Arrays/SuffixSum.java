import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length ; 
        int suff[] = new int[n] ;
        int j = n - 2 ; 
        suff[n-1] = arr[n-1]; 
        for(int i = n-2 ; i>= 0 ; i--){
            suff[j] = suff[j+1] + arr[i] ; 
            j--;
        }
        System.out.println(Arrays.toString(suff));
    }
}