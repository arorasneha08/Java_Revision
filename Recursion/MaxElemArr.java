public class MaxElemArr {
    public static int findMax(int arr[] ,int index ){
        if(index == arr.length-1){
            return arr[index] ;
        } 
        int smallAns = findMax(arr, index+1) ;
        return Math.max(arr[index] , smallAns); 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5} ;
        int ans = findMax(arr , 0 ); 
        System.out.println(ans);
    }
}
