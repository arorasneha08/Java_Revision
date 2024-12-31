// import java.util.Arrays;

// public class MedianRowWiseSortedMatrix {

//     // brute force approach :- o(n2)
//     class Solution {
//     int median(int mat[][]) {
//         int n = mat.length ;
//         int arr[] = new int[n*n]; 
//         int index = 0 ;
//         for(int i = 0 ; i<n ; i++){
//             for(int j = 0; j< n ; j++){
//                 arr[index ++] = mat[i][j];
//             }
//         }
//         Arrays.sort(arr);
//         int len = arr.length ;
//         return arr[len/2]; 
//     }
// }

// // optmised approach using the binary search 
//     int upperBound(int arr[], int x , int n){
//         int low = 0, high = n-1 ;
//         int ans = n ; 
//         while(low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] > x){
//                 ans = mid ; 
//                 high = mid - 1 ; 
//             }
//             else{
//                 low = mid + 1 ; 
//             }
//         }
//         return ans ; 
//     }
//     int countSmallEqual(int mat[][] , int n, int m , int x){
//         int count = 0 ;
//         for(int i = 0 ; i<n ; i++){
//             count += upperBound(mat[i], x, m); 
//         }
//         return count; 
//     }
//     int median(int mat[][]) {
//         int low = Integer.MAX_VALUE , high = Integer.MIN_VALUE ; 
//         int n = mat.length ;
//         int m = mat[0].length ;
//         for(int i = 0 ; i<n ; i++){
//             low = Math.min(low , mat[i][0]); 
//             high = Math.max(high , mat[i][m-1]);
//         }
//         int req = (n*m)/2 ;
//         while(low <= high){
//             int mid = (low + high)/2 ;
//             int smallEqual = countSmallEqual(mat , n, m, mid);
//             if(smallEqual <= req) low = mid + 1 ; 
//             else high = mid - 1 ; 
//         }
//         return low ; 
//     }
// }


// // gfg : median in a row wise sorted matrix 


class Solution {
    // Helper function to find the number of elements <= assumedMedian
    int findSmallerElements(int matrix[][], int assumedMedian) {
        int noOfSmallerElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] <= assumedMedian) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            noOfSmallerElements += start; // Add count of smaller elements in this row
        }
        return noOfSmallerElements;
    }

    // Function to find the median
    int median(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        int n = r * c;
        int medianIndex = n / 2;

        int start = 1; // Assume values in the matrix range from 1
        int end = 2000; // Assume maximum value is 2000

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;
            int lesserElem = findSmallerElements(mat, assumedMedian);

            // Check if assumedMedian can be the median
            if (lesserElem <= medianIndex) {
                start = assumedMedian + 1; // Move right
            } else {
                end = assumedMedian - 1; // Move left
            }
        }

        return start; // The median value
    }
}