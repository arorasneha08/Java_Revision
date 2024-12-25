public class SearchRotatedSortedDupl {
    class Solution {
        public boolean search(int[] arr, int target) {
            int n = arr.length ; 
            int start = 0 ;
            int end = n-1 ; 
            while(start <= end){
                int mid = start + (end - start)/2 ;
                if(arr[mid] == target){
                    return true ; 
                } 
                if(arr[mid] == arr[end]){
                    end -- ; 
                }
                if(arr[mid] == arr[start]){
                    start ++ ; 
                }
                else if(arr[mid] > arr[n-1]){
                    if(target >= arr[start] && target < arr[mid]){
                        end = mid-1 ; 
                    }
                    else{
                        start = mid + 1; 
                    }
                }
                else{
                    if(target > arr[mid] && target <= arr[n-1]){
                        start = mid + 1; 
                    }
                    else{
                        end = mid-1 ; 
                    }
                }
            }
            return false; 
        }
    }
    
}

// leetcode 81 