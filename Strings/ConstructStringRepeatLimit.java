public class ConstructStringRepeatLimit {
    class Solution {
        public String repeatLimitedString(String s, int repeatLimit) {
            int n = s.length();
            int freq[] = new int[26]; 
            for(int i = 0 ;i<n ; i++){
                freq[s.charAt(i) - 'a'] ++ ; 
            }
            StringBuilder str = new StringBuilder();
            for(int i = 25 ; i>= 0 ;i--){
                int count = 0 ; 
                while(freq[i] > 0){
                    if(count < repeatLimit){
                        str.append((char) (i+ 'a')); 
                        freq[i] -- ; 
                        count ++ ; 
                    }
                    else{
                        int found = 0; 
                        for(int j = i-1 ; j>= 0 ; j--){
                            if(freq[j] > 0){
                                str.append((char) (j + 'a')); 
                                freq[j]-- ; 
                                count  = 0 ;
                                found = 1 ; 
                                break ; 
                            }
                        }
                    if(found  == 0) return str.toString(); 
                    }
                }
            }
            return str.toString(); 
        }
    }
}

// leetcode 2182 