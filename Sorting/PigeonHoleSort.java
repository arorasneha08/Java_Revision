import java.util.Arrays;

public class PigeonHoleSort {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE ; 
        int min = Integer.MAX_VALUE ; 
        int arr[] = {21,45,21,90,67,56}; 
        int n = arr.length ; 
        for(int i = 0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i] ; 
            }
            if(arr[i] < min){
                min = arr[i] ; 
            }
        }
        // count each element in the array 
        int size = max - min + 1 ; 
        int pigeonhole[] = new int[size]; 
        for(int i = 0 ; i<n ; i++){
            int index = arr[i] - min ; 
            pigeonhole[index]++ ; 
        }
        
        int insertIdx = 0 ;
        for(int j = 0 ; j< size ; j++){
            while(pigeonhole[j] > 0){
                arr[insertIdx] = j + min ; 
                insertIdx ++ ; 
                pigeonhole[j] -- ; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
