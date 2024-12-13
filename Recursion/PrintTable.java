public class PrintTable {
    public static void printTable(int n , int k){
        if(k == 1){
            System.out.println(n);
            return ; 
        } 
        printTable(n, k-1);
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        int n = 5 ;
        int k = 10 ; 
        printTable(n, k);
    }
}
 // print the first k multiples of n : 