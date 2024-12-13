import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>() ; 
        for(int i = 0 ; i<numRows ; i++){
            List<Integer> list = new ArrayList<>() ;
            for(int j = 0 ; j<= i ;j++){
                if(j == 0 || j == i){
                    list.add(1); 
                }
                else{
                    list.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(list) ; 
        }
        return result ; 
    }
}
}


// leetcode 118 

class PascalTriangle1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(); 
        res.add(1); 
        long ans = 1  ;
        for(int i = 1 ; i<=rowIndex; i++){
            ans = ans * (rowIndex-i + 1);
            ans = ans / i ; 
            res.add((int)ans); 
        }
        return res ; 
    }
}

// leetcode 119 
