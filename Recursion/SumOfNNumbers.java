public class SumOfNNumbers {
    public static int sum(int n ){
        if(n == 1) return 1 ; 
        return n + sum(n-1); 
    }
    public static int factorial(int n){
        if(n == 1) return 1 ;
        return n * factorial(n-1); 
    }
    public static void main(String[] args) {
        int n = 5 ;
        int s = sum(n); 
        System.out.println(s);
        int fact = factorial(n);
        System.out.println(fact);
    }
}
