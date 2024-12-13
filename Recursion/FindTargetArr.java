public class FindTargetArr {
    // find the index of the element in the array 
    public static int FindTarget1(int arr[] ,int index , int target){
        if(index == arr.length){
            return -1; 
        }
        if(arr[index] == target){
            return index ; 
        }
        return FindTarget1(arr, index+1, target); 
    }
    public static boolean FindTarget(int arr[] , int index, int target){
        // base case 
        if(index == arr.length) {
            return false ; 
        }
        // self work 
        if(arr[index] == target){
            return true ;
        }
        // recursive work 
        return FindTarget(arr, index+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int target = 3 ; 
        System.out.println(FindTarget1(arr , 0, target));
    }
}
