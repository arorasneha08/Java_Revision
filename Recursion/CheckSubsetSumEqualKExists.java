public class CheckSubsetSumEqualKExists {
    public static boolean subsetSum(int arr[] , int target , int index, int sum ,  int n){
        if(index == n){
            if(sum == target) return true ;
            else return false ; 
        }
        if(subsetSum(arr, target, index+1,sum+arr[index] , n) ){
            return true ; 
        }
        return subsetSum(arr, target, index+1,sum , n); 
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        return subsetSum(a, k, 0,0,  n);
    }
}

// this code is giving me a tle error , optimised approach is dp 