public class CountOccurElem {
    class Solution {
        int firstOccur(int arr[] , int target, int n){
            int start = 0 ; 
            int end = n-1; 
            int firstOccur = -1; 
            while(start <= end){
                int mid = start + (end - start)/2; 
                if(arr[mid] == target){
                    firstOccur =  mid ; 
                    end = mid -1  ; 
                }
                else if(arr[mid]< target){
                    start = mid + 1 ; 
                }
                else{
                    end = mid - 1 ; 
                }
            }
            return firstOccur ; 
        }
        int lastOccur(int arr[] , int target, int n){
            int start = 0 ; 
            int end = n-1; 
            int lastOccur = -1; 
            while(start <= end){
                int mid = start + (end - start)/2; 
                if(arr[mid] == target){
                    lastOccur =  mid ; 
                    start = mid + 1 ; 
                }
                else if(arr[mid]< target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1 ; 
                }
            }
            return lastOccur ; 
        }
        int countFreq(int[] arr, int target) {
            int n = arr.length ; 
            int first = firstOccur(arr, target, n);
            int last = lastOccur(arr, target , n); 
            if(first == -1){
                return 0 ; 
            }
            int count = last-first+1; 
            return count ; 
        }
    }
}
