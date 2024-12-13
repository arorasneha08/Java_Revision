public class SumOfArrElem {
    public static int sum(int arr[] , int index ){
        if(index == arr.length){
            return 0 ; 
        }
        return sum(arr, index+1) + arr[index];

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans  = sum(arr, 0 ); 
        System.out.println(ans);
    }
}
