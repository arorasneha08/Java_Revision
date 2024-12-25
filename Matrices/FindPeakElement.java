class Solution {
    public int maxElem(int arr[][] , int r , int c , int mid){
        int max = -1; 
        int index = -1  ;
        for(int i = 0; i<r  ; i++){
            if(arr[i][mid] > max){
                max = arr[i][mid] ; 
                index = i ;
            }
        }
        return index; 
    }
    public int[] findPeakGrid(int[][] mat) {
        int r = mat.length ;
        int c = mat[0].length;
        int low = 0 ;
        int high = c - 1 ;
        while(low <= high){
            int mid = (low + high)/2 ;
            int maxRowIdx = maxElem(mat , r, c, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIdx][mid-1] : -1 ;
            int right = mid + 1 < c ? mat[maxRowIdx][mid+1] : -1 ;
            if(mat[maxRowIdx][mid] > left && mat[maxRowIdx][mid] > right){
                return new int[]{maxRowIdx, mid}; 
            }
            else if(mat[maxRowIdx][mid] < left){
                high = mid - 1 ; 
            }
            else{
                low = mid + 1 ; 
            }
        } 
        return new int[]{-1,-1}; 
    }
}

// leetcode 1901 