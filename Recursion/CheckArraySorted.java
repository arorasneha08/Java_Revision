public class CheckArraySorted {
    public static boolean checkSort(int arr[] , int index){
        if(index == arr.length-1) {
            return true ; 
        }
        if(arr[index] > arr[index+1]){
            return false; 
        }
        return checkSort(arr, index+1); 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,14,5};
        System.out.println(checkSort(arr, 0)); 
    }
}


