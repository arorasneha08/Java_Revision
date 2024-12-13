import java.util.Arrays;

public class BrickSort{
    public static void main(String[] args) {
        int arr[] ={81,15,93,75,19} ; 
        int n = arr.length ; 
        boolean isSorted = false; 
        while(!isSorted){
            boolean flag = false; 

            // check for the even indexes 
            for(int i = 0 ; i< n-2 ;  i+=2){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp ; 
                    flag = true ; 
                }
            }

            // check for the odd indexes 
            for(int i = 1 ; i<=n-2  ;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i] ;
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp ; 
                    flag = true ; 
                }
            }
            if(!flag){
                // the array is alread sorted ... 
                isSorted = true ; 
                break ; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}