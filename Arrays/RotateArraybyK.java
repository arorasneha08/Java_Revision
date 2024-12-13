public class RotateArraybyK {
    class Solution {
        private void reverse(int arr[] , int left , int right){
            while(left < right){
                int temp = arr[left];
                arr[left]  = arr[right] ;
                arr[right] = temp ;
                left ++ ;
                right -- ;  
            }
        }
        public void rotate(int[] arr, int k) {
            // int n = arr.length ; 
            // k = k % n ;
            // int []y = new int [n];
            // int j = 0 ; 
            // for(int i = n-k; i<n ; i++){
            //     y[j++] = arr[i];
            // }
            // for(int i = 0 ; i<n-k ; i++){
            //     y[j++] = arr[i] ; 
            // }
            // for(int i = 0 ; i<n ; i++){
            //     arr[i] = y[i]; 
            // }
    
            int n = arr.length ; 
            k = k % n ;
            reverse(arr , 0 , n-1) ;
            reverse(arr, 0 , k-1) ;
            reverse(arr, k , n-1);
        }
    }
}
