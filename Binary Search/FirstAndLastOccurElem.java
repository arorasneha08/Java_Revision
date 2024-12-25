public class FirstAndLastOccurElem {
    class Solution {
        public int firstOccur(int arr[] , int target){
            int start = 0 ;
            int firstoccur = -1;
            int end = arr.length -1 ; 
            while(start <= end){
                int mid = start + (end - start)/2; 
                    if(arr[mid] == target){
                        firstoccur = mid ;
                        end = mid -1 ; 
                    }
                    else if(arr[mid]<target){
                        start = mid + 1 ; 
                    }else{
                        end = mid -1  ; 
                    }
            }
            return firstoccur ; 
        }
            public int lastOccur(int arr[] , int target){
            int start = 0 ;
            int lastoccur = -1;
            int end = arr.length -1 ; 
            while(start <= end){
                int mid = start + (end - start)/2; 
                    if(arr[mid] == target){
                        lastoccur = mid ;
                        start = mid +1 ;
                    }
                    else if(arr[mid]<target){
                        start = mid + 1 ; 
                    }else{
                        end = mid -1  ; 
                    }
            }
            return lastoccur ; 
        }
        public int[] searchRange(int[] arr, int target) {
            int ans[] = new int [2];
            int firstoccur = -1;
            int lastOccur = -1  ; 
            ans[0] = firstOccur(arr,target);
            ans[1]  = lastOccur(arr,target);
            return ans ; 
        }
    }
}

// leetcode 34 