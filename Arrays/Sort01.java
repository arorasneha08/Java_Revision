public class Sort01 {
    public class Solution {  

        public static void sortZeroesAndOne(int[] arr) {
            int n = arr.length; 
            int left = 0 ;
            int right = n - 1;
            while(left < right){
                if(arr[left] != 0 && arr[right] == 0){
                    int temp = arr[left] ;
                    arr[left] = arr[right] ;
                    arr[right] = temp ; 
                    left ++ ; 
                    right -- ;
                }
                else if(arr[left] == 0) left ++ ; 
                else right -- ; 
            }
        }
    }
}
