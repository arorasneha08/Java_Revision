public class SeriesSum {
    public static int series(int n){
        if(n == 0) return 0 ; 
        if(n % 2 == 0) { // even numbers subtract from the sum
            return series(n-1) - n ; 
        }
        else{  // odd numbers add to the sum 
            return series(n-1)+ n ; 
        }

    }
    public static void main(String[] args) {
        int n = 5 ; 
        int ans = series(n);
        System.out.println(ans) ;
    }
}

// 1 - 2 + 3 - 4 + 5 