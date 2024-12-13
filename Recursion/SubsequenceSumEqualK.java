import java.util.ArrayList;

// public class SubsequenceSumEqualK {
//     public static void SubsequenceSum(int arr[] , int index ,int sum , int target , int n , ArrayList<Integer> ans){
//         if(index == n){
//             if(sum == target){
//                 for(int num : ans){
//                     System.out.print(num + " ");
//                 }
//                 System.out.println();
//             }
//             return ; 
//         }
//         ans.add(arr[index]);
//         sum += arr[index] ; 
//         SubsequenceSum(arr, index+1, sum, target, n, ans);

//         sum -= arr[index]; 
//         ans.remove(ans.size()-1);
//         SubsequenceSum(arr, index+1, sum, target, n, ans);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,1};
//         int n = 3  ;
//         int target = 2 ;
//         ArrayList<Integer> ans  = new ArrayList<>();
//         SubsequenceSum(arr, 0,0, target, n , ans); 
//     }
// }


// printing only the one subsequence :- 

public class SubsequenceSumEqualK {
    public static boolean SubsequenceSum(int arr[] , int index ,int sum , int target , int n , ArrayList<Integer> ans){
        if(index == n){
            if(sum == target){
                for(int num : ans){
                    System.out.print(num + " ");
                }
                System.out.println();
                return true ; 
            }
            else return false; 
        }
        ans.add(arr[index]);
        sum += arr[index] ; 
        if(SubsequenceSum(arr, index+1, sum, target, n, ans)){
            return true ;
        }

        sum -= arr[index]; 
        ans.remove(ans.size()-1);
        if(SubsequenceSum(arr, index+1, sum, target, n, ans)){
            return true; 
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int n = 3  ;
        int target = 2 ;
        ArrayList<Integer> ans  = new ArrayList<>();
        SubsequenceSum(arr, 0,0, target, n , ans); 
    }
}
