public class CountSubseqSumK {
    public static int SubsequenceSum(int arr[] , int index ,int sum , int target , int n ){
        if(index == n){
            if(sum == target){
                return 1 ;
            }
            else return 0; 
        }
        sum += arr[index] ; 
        int l = SubsequenceSum(arr, index+1, sum, target, n);

        sum -= arr[index]; 
        int r = SubsequenceSum(arr, index+1, sum, target, n);

        return l + r ; 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int n = 3  ;
        int target = 2 ;
        System.out.println(SubsequenceSum(arr, 0,0, target, n ));
    }
}
 