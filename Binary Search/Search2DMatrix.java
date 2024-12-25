public class Search2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] arr, int target) {
            int n = arr.length ; 
            int m = arr[0].length ; 
            int start = 0 ;
            int end = n*m-1 ; 
            while(start <= end){
                int mid = start + (end - start)/2 ;
                int midElem = arr[mid/m][mid%m];
                if(target == midElem){
                    return true ; 
                }
                else if(target < midElem){
                    end = mid - 1  ; 
                }
                else {
                    start = mid + 1  ;
                }
            }
            return false  ; 
        }
    }
}
