import java.util.Arrays;

public class deleteElemFromArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length ; 
        int newLen = n ; 
        int del = 3 ;
        for(int i = 0 ; i<newLen ;i++){
            if(arr[i] == del){
                for(int j = i ; j<newLen-1 ; j++){
                    arr[j] = arr[j+1]; 
                }
                i--;
                newLen -- ; 
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLen)));
    }
}
