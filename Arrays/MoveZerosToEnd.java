public class MoveZerosToEnd {
    class Solution {
        public void moveZeroes(int[] arr) {
            // int count = 0 ; 
            // int n = arr.length ; 
            // for(int i = 0  ;i<n; i++){
            //     if(arr[i] == 0 ){
            //         count ++ ;
            //     }
            // }
            // int j = 0 ;
            // for(int i = 0 ; i<arr.length ; i++){
            //     if(arr[i]!=0){
            //         arr[j++] = arr[i];
            //     }
            // }
            // for(int i = 0  ;i<count ; i++){
            //     arr[j++] = 0 ; 
            // }
    
            int n = arr.length ;
            int nonZeroIdx = 0 ;
            for(int i = 0 ; i <n ; i++){
                if(arr[i] != 0){
                    arr[nonZeroIdx++] = arr[i]; 
                }
            }
            for(int i = nonZeroIdx ; i< n ; i++){
                arr[i] = 0 ;
            }
        }
    }
}
