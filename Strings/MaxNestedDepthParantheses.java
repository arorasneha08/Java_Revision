public class MaxNestedDepthParantheses {
    class Solution {
        public int maxDepth(String s) {
            int n = s.length();
            int count = 0 ; 
            int max = 0 ; 
            for(int i = 0 ; i< n ; i++){
                if(s.charAt(i) == '(') count ++ ;
                else if(s.charAt(i) == ')')count -- ; 
                else continue ; 
                max = Math.max(count , max);
            }
            return max ;
        }
    }
}

// leetcode 1614 