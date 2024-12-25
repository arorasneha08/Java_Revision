import java.util.Arrays;

public class CeilOfArray {
    class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr); 
        int n = arr.length ; 
        int start = 0 ;
        int end = n-1 ;
        int floor = -1; 
        int ceil = -1; 
        while(start <= end){
            int mid = start + (end - start)/2 ; 
            if(arr[mid] == x){
                return new int[]{x,x}; 
            }
            else if(arr[mid] > x){
                ceil = arr[mid] ; 
                end = mid - 1 ; 
            }
            else if(arr[mid] < x){
                floor = arr[mid] ; 
                start = mid + 1 ; 
            }
        }
        return new int[]{floor, ceil} ; 
    }
}

}
