public class MissingNumber {
    public static void main(String[] args) {
        int arr [] = {1,2,3,5};
        int n = 4 ;
        int xor1 = 0 , xor2 = 0 ;
        for(int i = 0; i<= n+1 ; i++){
            xor1 = xor1 ^ i ;
        }
        for(int i = 0 ; i<n ; i++){
            xor2 = xor2 ^ arr[i] ; 
        }
        int missingNum = xor1 ^ xor2 ; 
        System.out.println(missingNum);
    }
}
