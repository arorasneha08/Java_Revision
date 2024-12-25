
public class RotateMatrixBy90 {
    class Solution {
        void rotateMatrix(int arr[][], int n) {
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<i ; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp ;
                }
            }
            for(int j = 0 ; j<n ; j++){
                for(int i = 0 ; i < n/2 ; i++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[n-i-1][j];
                    arr[n-i-1][j] = temp ; 
                }
            }
        }
    }
}

// rotate a matrix anticlockwise in 90 degrees 


class Solution {
    void rotateMatrix(int arr[][], int n) {
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp ; 
            }
        }
    }
}

// rotate a matrix clockwise in 90 degrees 