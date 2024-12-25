import java.util.Arrays;

public class NextGreaterElem {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2}; 
        int n = arr.length  ;
        int maxRight = -1; 
        for(int i = n-1 ; i>=0 ; i--){
            int current = arr[i] ; 
            arr[i] = maxRight ; 
            if(current > maxRight){
                maxRight = current ; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
