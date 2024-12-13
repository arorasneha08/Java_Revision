import java.util.HashMap;
import java.util.Map;

public class LongestSubstrOccurThrice{
    class Solution {
    public int maximumLength(String s) {
        int n = s.length() ;
        Map<String , Integer> mpp = new HashMap<>();
        int maxLen = -1; 
        for(int i = 0; i<n ; i++){
            StringBuilder substr = new StringBuilder();
            for(int j = i ; j<n ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    substr.append(s.charAt(i)); 
                    String str = substr.toString(); 
                    mpp.put(str, mpp.getOrDefault(str, 0) + 1) ; 
                    if(mpp.get(str) >= 3){
                        maxLen = Math.max(maxLen, str.length()); 
                    }
                }
                else{
                    break ;
                }
            }
        }
        return maxLen ;
    }
}
    public static void main(String[] args) {
        
    }
}

// string : aaabaaabaaaa 