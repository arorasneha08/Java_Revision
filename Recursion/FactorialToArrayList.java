import java.util.ArrayList;

public class FactorialToArrayList {
    class Solution {
    public static void findFactorials(long n , long i , long fact , ArrayList<Long> ans ){
        if(fact > n) return ;
        ans.add(fact);
        findFactorials(n , i+1 , fact * (i+1) , ans);
    }
    
    static ArrayList<Long> factorialNumbers(long n) {
       ArrayList<Long> result = new ArrayList<>();
       findFactorials(n, 1, 1, result);
       return result; 
    }
}
}
