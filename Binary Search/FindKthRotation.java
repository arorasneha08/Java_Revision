import java.util.List;

public class FindKthRotation {
    class Solution {
    public int findMin(int arr[] , int n){
        int start = 0 ;
        int end = n-1;  
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] <= arr[n-1]){
                ans = mid ; 
                end = mid -1 ; 
            }
            else{
                start = mid + 1 ; 
            }
        }
        return ans ; 
    }
    public int findKRotation(List<Integer> arr) {
        int a[] = new int[arr.size()];
        for(int i = 0 ;i<arr.size() ; i++){
            a[i] = arr.get(i);
        }
        int n = a.length ; 
        int res = findMin(a, n); 
        return res; 
    }
}
}

// find the number of times the array is rotated ...