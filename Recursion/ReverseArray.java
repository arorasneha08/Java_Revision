// package Recursion;

// public class ReverseArray {
//     class Solution {
//         public void reverse(int arr[] , int left , int right){
//             if(left >= right) return ; 
//             int temp =arr[left];
//             arr[left] = arr[right] ;
//             arr[right] = temp ; 
            
//             reverse(arr, left + 1 , right - 1) ;
//         }
//         public void reverseArray(int arr[]) {
//            reverse(arr , 0 , arr.length-1);
//         }
//     }
// }

// public class ReverseArray{
//     public static void reverse(int arr[] , int i){
//         int n = arr.length; 
//         if(i >= n/2) return ; 

//         int temp = arr[i] ;
//         arr[i] = arr[n-i-1];
//         arr[n-i-1] = temp ; 

//         reverse(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         reverse(arr, 0);
//         for(int ar : arr){
//             System.out.println(ar);
//         }
//     }
// }