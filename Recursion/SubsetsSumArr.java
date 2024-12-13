public class SubsetsSumArr {
    public static void subsetSum(int arr[] , int index, int n , int sum){
        // base case
        if(index == n){
            System.out.println(sum);
            return ; 
        }
        // add the current elem to the sum
        subsetSum(arr, index+1, n, sum + arr[index]);

        // do not add the current elem to the sum 
        subsetSum(arr, index+1, n, sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3}; 
        int n = arr.length; 
        subsetSum(arr, 0 , n , 0);  
    }
}
